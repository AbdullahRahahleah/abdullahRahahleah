package rahahleah.rahahleah.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *This is the main hadler where we forward the request to the defined view to display the needed resutls after it was moved from first filter 
 *Author : Abdullah Rahahleah
 */
public class HomeHandler extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/views/Home.jsp").forward(req, resp);
	}
}
