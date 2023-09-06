package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import dto.User;

public class UserDao {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	
	public UserDao() {
		this.sc=new Scanner(System.in);
		this.con=ConnectJDBC.getConnect();
	}
	public boolean insertUser(User user) {
		try {
			if(user.getUserType().equals("admin"))
			{
				this.stat=con.prepareStatement("insert into user value(?,?,?,?,0)");
				this.stat.setString(1,user.getUserType());
				this.stat.setInt(2,user.getUserId());
				this.stat.setString(3,user.getUserName());
				this.stat.setString(4,user.getPassword());
				this.stat.setString(5,user.getEmail());
				int result=stat.executeUpdate();
				if(result>0) 
				{
					System.out.println("Admin User created.....");
					return true;
				}
				else return false;
			}
			else 
			{
				int superCoin=100;
				this.stat=con.prepareStatement("insert into user value(?,?,?,?,?,?)");
				this.stat.setString(1,user.getUserType());
				this.stat.setInt(2,user.getUserId());
				this.stat.setString(3,user.getUserName());
				this.stat.setString(4,user.getPassword());
				this.stat.setString(5,user.getEmail());
				this.stat.setInt(6,superCoin);
				int result=stat.executeUpdate();
				
				if(result>0) 
				{
					System.out.println("User created.....");
					return true;
				}
				else return false;
			   }
			}catch(NullPointerException ne) 
		{
				System.out.println(ne.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return false;
	}

}
