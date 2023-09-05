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

@WebServlet("/update")                       //imp
public class UpdateRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Get");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String email = request.getParameter("email");
	 String mobile = request.getParameter("mobile");
	// System.out.println(email); 
	// System.out.println(mobile);
	 
	 //JDBC CODING
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db","Milan","root");
	     
		 Statement stmnt = con.createStatement();
		 
		 stmnt.executeUpdate("UPDATE registration SET mobile = '"+mobile+"' where email='"+email+"'");
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
	 }
	}
	

}
