package alok.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CityFilter {

		public static void main (String [] args) {
			
			
			String jdbcUrl = "jdbc:mysql://localhost:3306/student_data_db";
			String username = "Milan";
			String password ="root" ;
		

		try(Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Scanner scan = new Scanner (System.in );
			System.out.print("Enter the Character: ");
			String givenCharactor = scan.nextLine();

			String sql = "SELECT * FROM registration  WHERE city like ?" ;

			PreparedStatement stmnt = connection.prepareStatement(sql);
			stmnt .setString(1 , givenCharactor + "%");

			ResultSet resultSet = stmnt .executeQuery( ) ;


			while( resultSet.next() ) {

			String name = resultSet.getString("name");
			String city = resultSet.getString("city");
			String email = resultSet.getString("email");
			String mobile = resultSet.getString("mobile");


			System.out.println("name :" + name );

			System.out.println("city :" + city );

			System.out.println("email :" + email );

			System.out.println("mobile :" + mobile );
			}
			
		} catch (Exception e) {
			System.err.print("Error"+e.getMessage());
			// TODO: handle exception
			e.printStackTrace();
		}





		}
	
	
	
	
	

}
