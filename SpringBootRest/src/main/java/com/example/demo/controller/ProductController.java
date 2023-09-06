package com.example.demo.controller;

import java.util.List;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.ProductRepository;

@RestController
@RequestMapping("/Product")
public class ProductController {

	@Autowired
	ProductRepository productrepo; 
	
	@GetMapping("/retreiveAllDAta")
	public List<Product>getAllProducts(){
		return productrepo.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Product getById(@PathVariable int id)
	{
	   Optional<Product> p=productrepo.findById(id);
	   Product pr=null;
	   if( p.isPresent()) {
		   pr=p.get();
	   }
	   return pr;
	}
	
	@PostMapping("/insertProduct")
	public Product insertProduct(@RequestBody Product p1)
	{
		productrepo.save(p1);
		return p1;
	}
	
	@PostMapping("/insertAllProduct")
	public List<Product>insertAllProduct(@RequestBody List<Product>plist)
	{
		productrepo.saveAll(plist);
		return plist;
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id)
	{
		  productrepo.deleteById(id);
        System.out.println("Data deleted");
	  
	}
	
	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@RequestBody Product pupdate) {
		Optional<Product> pfindupdate=productrepo.findById(pupdate.getProductid());
		
		if( pfindupdate.isPresent()) {
			productrepo.save(pupdate);
		   }
		   return pupdate;
	}
}
