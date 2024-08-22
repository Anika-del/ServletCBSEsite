import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DeleteServlet extends HttpServlet
{
	
   public  void doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException,IOException
  {   
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("Delete Student Record");
		String  rollNumber = req.getParameter("rollNumber");
		
		
		try
		{
			   Class.forName("oracle.jdbc.driver.OracleDriver");
               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
               Statement s = con.createStatement();
			 
			    PreparedStatement ps = con.prepareStatement ("delete from STUDENT_MARKS where rollNumber = ?");
                ps.setString (1,rollNumber);
				int i = ps.executeUpdate();

        if(i > 0) {
            out.println("User successfully deleted");
        }
        }
        	
		catch(Exception e)
			 {
				 out.println(e);
			 }
			
		 out.println("<a href='CBSE_homepage.html'>back to home</a>");
		out.println("</html></body>");
	
		
		
  }
}