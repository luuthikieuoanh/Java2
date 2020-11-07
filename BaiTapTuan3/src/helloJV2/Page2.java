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
 * Servlet implementation class GetdataPage
 */
@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Page2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		// get cookie list
		Cookie[] arrCk = request.getCookies();
		pw.write("<h2> Cookie List </h2>");
		
		// print tat ca cookie co trong ds
		if (arrCk != null) {
			for (int i=0;i<arrCk.length-1;i++) {
				pw.write("<P>" + arrCk[i].getName() + " - " + arrCk[i].getValue() + "</p>");
			}
		}

		// get session
		HttpSession ss = request.getSession(false);
		
		//get value from session
		String email = ss.getAttribute("email") + "";
		String username = ss.getAttribute("username") + "";
		String pass = ss.getAttribute("password") + "";
		
		//print value of session
		pw.write("<hr><h2> Session List:  </h2>");
		pw.write("<p>" + email + "</p>");
		pw.write("<p>" + username + "</p>");
		pw.write("<p>" + pass + "</p>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
