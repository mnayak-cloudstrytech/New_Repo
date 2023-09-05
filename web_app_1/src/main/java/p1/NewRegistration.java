package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@WebServlet("/new")                       //imp
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public NewRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Get");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String name = request.getParameter("firstName");
	 String city = request.getParameter("city");
	 String email = request.getParameter("email");
	 String mobile = request.getParameter("mobile");
	// System.out.println(name);
	 //System.out.println(city);
	// System.out.println(email); 
	// System.out.println(mobile);
	 
	 //JDBC CODING
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db","Milan","root");
	     
		 Statement stmnt = con.createStatement();
		 
		 stmnt.executeUpdate("insert into registration values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
	 }
	}
	

}
