package dao;

import java.sql.ResultSet;

public class ProductDao {
	
	
	
	
	
	public void buyProductById(int id) {
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
		}
		catch
		{
			
		}
	}

}
