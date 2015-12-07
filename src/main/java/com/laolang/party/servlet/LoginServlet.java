package com.laolang.party.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laolang.party.domain.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String userpwd = request.getParameter("userpwd");
		ServletContext servletContext = getServletContext();
		RequestDispatcher dispatcher = null;
		if( "xiaodaima".equals(username) && "123456".equals(userpwd)){
//			response.sendRedirect("/index.jsp");
			User user = new User(username,userpwd);
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/party/index.jsp");
//			dispatcher = servletContext.getRequestDispatcher("/index.jsp");
			return ;
		}else{
			request.setAttribute("loginError", "用户名或密码不正确");
//			dispatcher = servletContext.getRequestDispatcher("/login.jsp");
			response.sendRedirect("/party/error.jsp");
		}
//		dispatcher.forward(request, response);
		
	}

}
