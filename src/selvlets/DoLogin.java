package selvlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read form data 사용자가 적은 아이디와 패스워드를 다져와서 저장
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// perform business logic

		PrintWriter out = response.getWriter(); 
		                                        // PrintWriter라는 객체를 얻을 수 있음
												// ctrl+shift+o를 눌러주면 위에 import
												// java.io.printWriter; 가 생김

		// Build HTML cose
		String htmlResponse="<html>";

		htmlResponse+= "<h2> Your name is: " + username + "<br/>";
		htmlResponse+= "Your password is: " + password + "<h2>";
		htmlResponse+= "</html>";
		out.println(htmlResponse);

	}

}
