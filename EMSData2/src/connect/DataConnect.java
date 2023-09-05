
package connect;
import java.sql.*;
public class DataConnect {
	private static Connection con;
	private DataConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql");
			System.out.println("Data connected");
			/*
			 * jdbc-protocol
			 * mysql-sub protocol
			 * localhost-address of mysql
			 * 3306-port number of mysql
			 */
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	public static Connection getConnect() {
		DataConnect d1=new DataConnect();
		return con;
	}

}