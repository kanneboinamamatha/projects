

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstsevlet
 */
@WebServlet("/firstsevlet")
public class firstsevlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg=request.getParameter("username");
		String pwd=request.getParameter("userpass");
		 PrintWriter out = response.getWriter();  
		 out.println("username:"+msg);
		 out.println("userpwd:"+pwd);
		 out.close();
		
	}



}
