package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/read")
public class ReadRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		PrintWriter out = response.getWriter();
		
		//JDBC CODING
		 
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db","Milan","root");
		     
			 Statement stmnt = con.createStatement();
			 ResultSet result = stmnt.executeQuery("Select * from registration");
			 
			 out.println("<html>");
			 out.println("<table>");
			 out.println("<tr>");
			 
			   out.println("<th>");
			      out.println("Name");
			   out.println("</th>");
			   
			   out.println("<th>");
			      out.println("City");
			   out.println("</th>");
			   
			   out.println("<th>");
			      out.println("email");
			   out.println("</th>");
			   
			   out.println("<th>");
			      out.println("mobile");
			   out.println("</th>");
			   
			 out.println("</tr>");
			 while(result.next())
			 {
				 out.println("<tr>");
				 
				   out.println("<td>");
				      out.println(result.getString(1));
				   out.println("</td>");
				   
				   out.println("<td>");
				   out.println(result.getString(2));
				   out.println("</td>");
				   
				   out.println("<td>");
				   out.println(result.getString(3));
				   out.println("</td>");
				   
				   out.println("<td>");
				   out.println(result.getString(4));
				   out.println("</td>");
				   
				 out.println("</tr>");

				 
			 }
			 out.println("</table>");
			 out.println("</html>");
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("Post");
	}

}
