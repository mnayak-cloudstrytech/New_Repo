package connect;
import java.sql.*;
import java.util.Scanner;
public class DataConnect {
	private static Connection con;
	 private Scanner sc;
	 private PreparedStatement stat;
	public DataConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Product1","Milan","root");
			System.out.println("Data connected");
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	public void loginUser() 
    {
		sc=new Scanner(System.in);
    	System.out.println("Enter the User name where use");
    	String username = sc.next();
    	System.out.println("Enter the password :");
    	String pass = sc.next();
    	try
    	{
    	stat=con.prepareStatement("select * from User where username=? and password=?");
    	stat.setString(1, username);
    	stat.setString(2, pass);
    	ResultSet result=stat.executeQuery();
    	if(result.next())
		
      	  {
    		
    		System.out.println("Sucessfully Logged in....");
    	  }
    	  else 
    	  {
    		  System.out.println("User Not Found....");
		  }
    	}
    	catch(Exception ex)
    	{
    		System.out.println(ex.getMessage());
    	}
    		
     }
//	public static Connection getConnect() {
//		DataConnect d1=new DataConnect();
//		return con;
//	}

}
