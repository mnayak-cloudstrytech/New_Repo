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

@WebServlet("/delete")                       //imp
public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Get");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String email = request.getParameter("email");
	
	// System.out.println(email); 
	
	 
	 //JDBC CODING
	 
	 try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db","Milan","root");
	     
		 Statement stmnt = con.createStatement();
		 
		 stmnt.executeUpdate("Delete from registration where email='"+email+"'");
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
	 }
	}
	

}
