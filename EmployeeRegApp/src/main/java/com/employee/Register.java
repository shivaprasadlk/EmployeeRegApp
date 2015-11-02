package main.java.com.employee;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */

public class Register extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
			throws ServletException, IOException {  
    	//test build
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  

		String n=request.getParameter("userName");  
		String p=request.getParameter("userPass");  
		String e=request.getParameter("userEmail");  
		String c=request.getParameter("userCountry");  
			
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			//String hostname = "localhost";
			//String port = "3307";
			//String dbname = "app";
			
			//String user = "root";
			//String password = "secret";
			
			//String dbUrl = "jdbc:mysql://PRASADLK1:3307/app";

			System.out.println("Connecting to a selected database...");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/app","root","secret");
			
			System.out.println("Connected database successfully...");
			
			String sql = "insert into REGISTERUSER values(?,?,?,?)";

			PreparedStatement ps=conn.prepareStatement(sql);

			ps.setString(1,n);  
			ps.setString(2,p);  
			ps.setString(3,e);  
			ps.setString(4,c);  

			int i=ps.executeUpdate();
			
			System.out.println("Successfully inserted records into REGISTERUSER table");
			
			if(i>0)  
				out.print("Hi "+n+" ,You are successfully registered...!");
				/* //out.print(\n);test1
				out.println("<html><head>");
				out.println("<title>Employees Registered details</title></head><body>");
				out.println("<table width='359' border='1'>");
				out.println("<tr><th width='50'>Name</th><th width='50'>Password</th><th width='50'>Email</th><th width='50'>Country</th></tr>");
				//out.println("<tr><td>"+userName+"</td><td>"+pass+"</td><td>"+email+"</td><td>"+country+"</td></tr>");
				out.println("</table>");
				out.println("</body></html>");// */
				

			String query = "SELECT * FROM REGISTERUSER";
			
			Statement st = conn.createStatement();
		       
		    ResultSet rs = st.executeQuery(query);
			
			while (rs.next())
		      {
		        
		        String userName = rs.getString("NAME");
		        String pass = rs.getString("PASS");
		        String email = rs.getString("EMAIL");
		        String country = rs.getString("COUNTRY");
		        
		        System.out.format("%s, %s, %s, %s\n",userName,pass,email,country);
				
				System.out.println("Constructing table for output");
				out.println("<html><head>");
				out.println("<title>Employees Registered details</title></head><body>");
				out.println("<table width='359' border='1'>");
				out.println("<tr><th>Name</th><th>Password</th><th>Email</th><th>Country</th></tr>");
				out.println("<tr><td>"+userName+"</td><td>"+pass+"</td><td>"+email+"</td><td>"+country+"</td></tr>");
				out.println("</table>");
				out.println("</body></html>");
				out.println("\n");
				System.out.println("table constructed");
		      }
		      st.close();


		}catch (Exception e2) {
			System.out.println(e2);
			}  
		out.close();  
	}  



}
