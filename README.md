# ServletCBSEsite       
Here Servlet program make CBSE Board site
Add, Delete, Search, Total no of students, Modified, and one button go to homepage.
proper form send krna method post multiple field search title 
page- Form.html, FormServlet.java, Add.java, Delete.java, Update.java.
WEB-INF/classes- java classe in class package
WEB-INF/lib - ojdbc-14 jar
Web-INF/web.xml
firstly you start your command on running mode-
for RUN PROCESS-  on cmd >javac -d WEB-INF/classes *.java
                        >jar cf s1.war *.*
              autodeploy>copy s1.war c:/yourLocation where you install Oracle Weblogic till autodeploy
Now serch on chrome http://localhost:7002/s1/Form.servlet
