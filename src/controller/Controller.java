package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.AnamneseDao;
import model.dao.DaoFactory;
import model.entities.Anamnese;

@WebServlet(urlPatterns = { "/Controller", "/anamnese" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		if (action.equals("/anamnese")) {
			anamnese(request, response);
		}
	}

	protected void anamnese(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AnamneseDao anamneseDao = DaoFactory.createAnamneseDao("C:\\ws-Medilab\\Medilab\\WebContent\\assets\\JSON\\data.json");
		List<Anamnese> lst = new ArrayList<>();
		lst = anamneseDao.findAll();
		request.setAttribute("anamnese", lst);
		RequestDispatcher rd = request.getRequestDispatcher("anamnese.jsp");
		rd.forward(request, response);
	}

}
