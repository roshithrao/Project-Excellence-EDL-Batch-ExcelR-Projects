import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet is initialized");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter pw = resp.getWriter();
		pw.println("<body bgcolor='blue'> <h1>"
				+ " Welcome to servlets</h1></body>");		
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is desstroyed");
	}

}
