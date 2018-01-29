

import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class controller
 */
@WebServlet("/ff")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname = request.getParameter("sname");
		String enroll = request.getParameter("enroll");
		String fname = request.getParameter("fname");
		String subject = request.getParameter("sub");
		String feedback = request.getParameter("feedback");
		int enroll1 = Integer.parseInt(enroll);
		int cid = 1;
		String page="";
		PrintWriter out = response.getWriter();
		
		if(sname.equals("")||enroll.equals("")||fname.equals("")||subject.equals("")||feedback.equals("")) 
		{
			//out.println("field not filled");
			page="index.jsp?msg=allfieldsaremandatory";
		}
		else
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://au-cdbr-sl-syd-01.cleardb.net/ibmx_1f5176609ac54e4?user=b9e3ee670e688d&password=2d04bda4");
				PreparedStatement ps = con.prepareStatement("insert into feedback values("+cid+",'+sname+',"+enroll1+",'+fname+','+subject+','+feedback+')");
				//cid++;
			    int i = ps.executeUpdate();
			   
			    if(i!=0)
			    {
			    	System.out.println("data inserted");
			    	page="index.jsp?msg=success";
			    }
			    else
			    {
			    	
			    	page="index.jsp?msg=failure";
			    }
				
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		response.sendRedirect(page);
	}
}