import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CBSE_homepageServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
				
				// sets the content type of the HTTP response that the servlet will send back to the client (usually a web browser).
		response.setContentType("text/html");  //getWriter() method of the HttpServletResponse
        PrintWriter out = response.getWriter(); //PrintWriter allows you to write character data 
		//html start
        out.println("<html>");
		out.println("<head>");
        out.println("<title>CBSE Board</title>");
		
		//style
		out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: lightskyblue; }");
        out.println("header { background-color: #0073e6; color: white; padding: 10px 0; text-align: center; }");
        out.println("nav {  display: flex; justify-content: center; background-color: #333; }");
		out.println("nav a { color: white; padding: 14px 20px; text-decoration: none; display: block; }");
		out.println("nav a:hover { background-color: #ddd; color: black; }");
		out.println(".container { padding: 20px; }");
		out.println("footer { background-color: #333; color: white; text-align: center; padding: 10px 0; position: absolute; bottom: 0; width: 100%;}");
		out.println(".container { display: flex; align-items: left; justify-content: space-around; padding: 5px; }");
		out.println(".image-container { flex: 1; padding-left:100px; }");
		out.println(".links-container { flex: 2; text-align: center; padding:40px; }");
		out.println(".links-container a { display: block;  margin: 10px 0; text-decoration: none; color: #0073e6;  }");
		out.println(".links-container a:hover { color: red; }");
		out.println("</style>");
		
		out.println("</head>");
		//css code for servlet
		
		
        out.println("<body>");
		//NavBar
		out.println("<header>");
		out.println("<h1>Central Board of Secondary Education</h1>");
		out.println("</header>");
		out.println("<nav>");
        out.println("<a href=\"#\">Home</a>");
        out.println("<a href=\"#\">About</a>");
        out.println("<a href=\"#\">Academics</a>");
        out.println("<a href=\"#\">Examination</a>");
        out.println("<a href=\"#\">Results</a>");
        out.println("<a href=\"#\">Contact</a>");
        out.println("</nav>");
		
		//img comtainer
		out.println("<div class=\"container\">");
        out.println("<h2>Welcome to the CBSE Board's Result Portal</h2>");
        // More content can be added here
        out.println("</div>");
		out.println("<div class=\"container\">");
        out.println("<div class=\"image-container\">");
        out.println("<img src=\"dd.jpg\" alt=\"Descriptive Image Text\" width=\"400\">");
        out.println("</div>");
		
		
		//Links
        //out.println("<h1>Links</h1>");
        out.println("<div class=\"links-container\">");
        out.println("<a href=\"Add.html\">Add Student</a>");
        out.println("<a href=\"Delete.html\">Delete Student</a>");
        out.println("<a href=\"Modify.html\">Modified in Students Result</a>");
        out.println("<a href=\"searchParcent.html\">Search Students Percentage</a>");
        out.println("<a href=\"#\">Total Numbers of Students</a>");
		out.println("</div>");
		out.println("</div>");
		
		//for footer
		out.println("<footer>");
		out.println("<p>© 2024 Central Board of Secondary Education. All rights reserved.</p>");
		out.println("</footer>");
		
		
        // Add more links as needed
        out.println("</body>");
        out.println("</html>");
    }
}
