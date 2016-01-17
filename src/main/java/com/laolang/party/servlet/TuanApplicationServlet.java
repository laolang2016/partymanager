package com.laolang.party.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laolang.party.dao.TuanDao;
import com.laolang.party.dao.TuanDaoImpl;
import com.laolang.party.domain.Tuan;

/**
 * Servlet implementation class TuanApplicationServlet
 */
public class TuanApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TuanApplicationServlet() {
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
		
		String studentid = request.getParameter("studentid");
		String groupid = request.getParameter("groupid");
		
		TuanDao dao = new TuanDaoImpl();
		
		Tuan tuan = new Tuan(studentid,groupid);
		
		dao.add(tuan);
		
		response.sendRedirect("/party/index.jsp");
		
		
	}

}
