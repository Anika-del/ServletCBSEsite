import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class AddServlet extends HttpServlet
{
 
   
 public  void service(HttpServletRequest req, HttpServletResponse res) throws  ServletException,IOException
  {   
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
	 String s=req.getMethod();
	 
	           doPost(req,res);
  }
	 public  void doPost(HttpServletRequest req, HttpServletResponse res) throws  ServletException,IOException
	 {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String rollNumber = req.getParameter("rollNumber");
		String studentName = req.getParameter("studentName");
		String math = req.getParameter("math");
		String english = req.getParameter("english");
		String science= req.getParameter("science");
		String hindi = req.getParameter("hindi");
		String computer = req.getParameter("computer");
		
		try
		{
			   Class.forName("oracle.jdbc.driver.OracleDriver");
               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
			   
               Statement st = con.createStatement();
			 
			ResultSet chek=st.executeQuery("select * from Student_Marks where  rollNumber="+rollNumber+"");
			if(chek.next()==false){
	int x=st.executeUpdate("insert into Student_Marks values(' "+rollNumber+" ', ' "+studentName+" ', ' "+math+" ','"+english+" ' ,' "+science+" ',' "+hindi+" ',' "+computer+" ')");
			 
	
        if (x==1)
			{
             out.println("Your data was successfully inserted.");
            } 
			}
		
		else {
            out.println("Failed to insert data.");
        }		
		}catch(Exception e)
			 {
				 out.println(e);
			 }
			
	    out.println("<a href='CBSE_homepage.html'>back to home</a>");
		out.println("</html></body>");
	
	
		
  }
}