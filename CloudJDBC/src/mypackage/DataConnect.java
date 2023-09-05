
package mypackage;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class DataConnect {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc;
	public DataConnect()
	{
		sc = new Scanner(System.in);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","Milan","root");
		System.out.println("Data connected");
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
			
			stat=con.prepareStatement("insert into employee values(?,?,?,?)");
			System.out.println("Enter employee id ");
			int empid=sc.nextInt();
			System.out.println("Enter Employee name ");
			String name=sc.next();
			System.out.println("Enter Address ");
			String address=sc.next();
			System.out.println("Enter Department code ");
			String deptcode=sc.next();
			stat.setInt(1,empid);
			stat.setString(2,name);
			stat.setString(3, address);
			stat.setString(4, deptcode);
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
				System.out.println("Enter employee id want to delete");
				int empid=sc.nextInt();
				stat=con.prepareStatement("delete from employee where empid=?");
				stat.setInt(1, empid);
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
				System.out.println("Enter employee id want to update");
				int empid=sc.nextInt();
				System.out.println("Enter new address");
				String add=sc.next();
				stat=con.prepareStatement("update employee set address=? where empid=?");
				stat.setString(1,add);
				stat.setInt(2, empid);
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
				stat=con.prepareStatement("select * from employee");
				ResultSet result=stat.executeQuery();
				while(result.next())
				{
					System.out.println("Employee id"+result.getInt(1));
					System.out.println("Employee name is"+result.getString(2));
				}
				
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		}
		
	public static void main(String[] args) {
		DataConnect d=new DataConnect();
		//d.insert();
		//d.delete();
		//d.update();
		d.retreive();
	}

}