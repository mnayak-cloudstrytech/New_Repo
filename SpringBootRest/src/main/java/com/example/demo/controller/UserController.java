
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userrep;
	@PostMapping("/validate")
	public User validate(@RequestBody User u1)
	{
		User finduser=userrep.findByUsernameAndPassword(u1.getUsername(), u1.getPassword());
		return finduser;
		
	}

}