package com.laolang.party.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laolang.party.dao.UserDao;
import com.laolang.party.dao.UserDaoImpl;
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
		UserDao dao = new UserDaoImpl();
		User user = dao.select(username);
		
		
		if( null == user || !username.equals(user.getName()) ){
			request.setAttribute("loginError", "该用户不存在");
			dispatcher = servletContext.getRequestDispatcher("/error.jsp");
		}else if( !userpwd.equals(user.getPwd())){
			request.setAttribute("loginError", "密码不正确");
			dispatcher = servletContext.getRequestDispatcher("/error.jsp");
		}else{
			request.getSession().setAttribute("user", user);
			response.sendRedirect("/party/index.jsp");
			return ;
		}
		
		dispatcher.forward(request, response);
		
	}

}
