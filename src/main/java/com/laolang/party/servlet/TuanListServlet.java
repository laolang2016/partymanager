package com.laolang.party.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laolang.party.dao.TuanDao;
import com.laolang.party.dao.TuanDaoImpl;
import com.laolang.party.domain.Tuan;

/**
 * Servlet implementation class TuanListServlet
 */
public class TuanListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TuanListServlet() {
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
		TuanDao dao = new TuanDaoImpl();
		List<Tuan> tuanlist = dao.selectAll();
		request.setAttribute("tuanlist", tuanlist);
		ServletContext servletContext = getServletContext();
		RequestDispatcher dispatcher = null;
		
		
		dispatcher = servletContext.getRequestDispatcher("/tuanlist.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}

}
