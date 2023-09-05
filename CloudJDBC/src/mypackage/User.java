

package mypackage;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class User {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public User()
	{
		sc = new Scanner(System.in);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","Milan","root");
		System.out.println("Connected");
		/*
		 * jdbc--protocol
		 * mysql-sub protocol
		 * localhost-mysql is installed on current system and running on port number 3306
		 * root-username
		 * mysql-password
		 */
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("unable to find driver");
		}
		catch(SQLException ex)
		{
			System.out.println("Excepiton is "+ex.getMessage());
		}
	}
		public void insert()
		{
			try
			{
			
			stat=con.prepareStatement("insert into user values(?,?,?)");
			System.out.println("Enter user id ");
			int uid=sc.nextInt();
			System.out.println("Enter User name ");
			String name=sc.next();
			System.out.println("Enter User Password ");
			String pass=sc.next();

			stat.setInt(1,uid);
			stat.setString(2,name);
			stat.setString(3, pass);
	
			int result=stat.executeUpdate();
			if(result>0)
			{
				System.out.println("inserted");
			}
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
			
		}
		public void delete() {
			try {
				System.out.println("Enter user id want to delete");
				int uid=sc.nextInt();
				stat=con.prepareStatement("delete from user where uid=?");
				stat.setInt(1, uid);
				int result=stat.executeUpdate();
				if(result>0)
				{
					System.out.println("Deleted");
				}
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				
			
			}
		
		
		
		
		public void update() {
			try {
				System.out.println("Enter user id want to update");
				int uid=sc.nextInt();
				System.out.println("Enter new password");
				String add=sc.next();
				stat=con.prepareStatement("update user set pass=? where uid=?");
				stat.setString(1,add);
				stat.setInt(2,uid);
				int result=stat.executeUpdate();
				if(result>0)
				{
					System.out.println("Deleted");
				}
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
				
			
			}
		public void retreive() {
			try {
				stat=con.prepareStatement("select * from user");
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					System.out.println("User id"+result.getInt(1));
					System.out.println("User name is"+result.getString(2));
				}
				
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
		
	public static void main(String[] args) {
		User u =new User();
		//u.insert();
		//u.delete();
		//u.update();
		//u.retreive();
	}

}