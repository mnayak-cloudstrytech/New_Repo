package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	List<Product>buyingList;
	
	public ProductDao() {
		this.sc=new Scanner(System.in);
		this.con=ConnectJDBC.getConnect();
		buyingList=new ArrayList<>();
	}
	
	public boolean insertProduct(Product product,Item item) {
		try {
			this.stat=con.prepareStatement("insert into product values(?,?,?,?,?,0)");
			this.stat.setInt(1,product.getProductId());
			this.stat.setString(2,product.getProductName());
			this.stat.setInt(3,product.getPrice());
			this.stat.setInt(4,product.getQuantity());
			
		}
	}
	
	public ResultSet showAllProduct() {
		try {
			this.stat=con.prepareStatement("select category,productName,sellPrice from product order by category=?");
			ResultSet resultSet=stat.executeQuery();
			return resultSet;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	
	
	public ResultSet viewProductByName(String name)
	{
		try
		{
			this.stat=con.prepareStatement("select category,productName,sellPrice from product where productname=?");
			this.stat.setString(1,name);
			ResultSet resultSet=stat.executeQuery();
			return resultSet;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	public ResultSet viewProductByCategory(String category,int input)
	{
		try
		{
			if(input==1) {
			this.stat=con.prepareStatement("select productName,sellPrice from product where category=? order by");
			this.stat.setString(1,category);
			ResultSet resultSet=stat.executeQuery();
			return resultSet;
			}
			else {
				this.stat=con.prepareStatement("select productName,sellPrice from product order by productwhere category=? order by");
				this.stat.setString(1,category);
				ResultSet resultSet=stat.executeQuery();
				return resultSet;
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	
	public ResultSet viewProductById(int id)
	{
		try
		{
			this.stat=con.prepareStatement("select category,productName,sellPrice from product where productId=?");
			this.stat.setInt(1,id);
			ResultSet resultSet=stat.executeQuery();
			return resultSet;
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	
	
	public void buyProductById(int id) 
	{
		System.out.println("Hello");
		try {
			this.stat=con.prepareStatement("select * from product where productId=?");
			this.stat.setInt(1,id);
			ResultSet result=this.stat.executeQuery();
			System.out.println("Welcome"+result);
			if(result.next()) {
				System.out.println("coming here"+result.getString(2));
				Product p=new Product();
				p.setProductId(result.getInt(1));
				p.setProductName(result.getString(2));
				p.setPrice(result.getInt(3));
				p.setQuantity(result.getInt(4));
				p.setCategory(result.getInt(5));
				buyingList.add(p);
			}
			System.out.println("Product id"+buyingList.get(1));
		}
		catch
		{
			
		}
		
		int grandTotal=0;
		for(Product product:listOfProductById) {
			this.stat=this.con.prepareStatement("select soldQuantity from product where productId=?");
			this.stat.setInt(1,product.getProductId());
			ResultSet result=this.stat.executeQuery();
			if(result.next()) 
			{
				int quantity = quantity+1;
				this.stat=this.con.prepareStatement("update product set soldQuantity=? where productId=?");
				this.stat.setInt(1,quantity);
				this.stat.setInt(2,product.getProductId());
				int result1=stat.executeUpdate();
				if(result1>0) 
				{
					System.out.println("Upated |||");
				}
			}
			this.stat=con.prepareStatement("select sellingPrice from product where productId=?");
			this.stat.setInt(1,product.getProductId());
		}
	}

}
