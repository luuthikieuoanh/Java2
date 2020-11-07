package helloJV2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		//lay value da duoc gui di tu form
		String email = request.getParameter("email");
		String username = request.getParameter("userName");
		String pass = request.getParameter("pass");
		PrintWriter pw = response.getWriter();
//		
//		Cookie cookie = new Cookie(SSORealm.SSO_COOKIE_NAME, "");
//		cookie.setDomain(SSORealm.SSO_DOMAIN);
//		cookie.setMaxAge(0);
//		cookie.setPath("/");
//		cookie.setComment("EXPIRING COOKIE at " + System.currentTimeMillis());
//		response.addCookie(cookie);
		
		
		// khoi tao cookie
		Cookie ckEmail = new Cookie("email", email);
//		ckEmail.setMaxAge(60);
		
		Cookie ckUsername = new Cookie("username", username);
//		ckUsername.setMaxAge(60);
		
		Cookie ckPass = new Cookie("password",pass);
//		ckEmail.setMaxAge(60);
		
		// add cookie
		response.addCookie(ckEmail);
		response.addCookie(ckUsername);
		response.addCookie(ckPass);
		
		request.getSession(false);
		//get session
		HttpSession ss = request.getSession(false);
		
		//set value
		ss.setAttribute("email", email);
		ss.setAttribute("username", username);
		ss.setAttribute("password", pass);
		
		
		pw.write("<a href='Page2'> Click here to get data </a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
