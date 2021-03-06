package co.edu.practice.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.practice.chan.command.chan;
import co.edu.practice.common.Command;
import co.edu.practice.geun.command.GeunPractice;
import co.edu.practice.home.command.Home;
import co.edu.practice.ytest.command.YTest;
import co.edu.practice.jong.command.jongPage;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, Command> map = new HashMap<String, Command>(); 

    public FrontController() {
        super();
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new Home());
		map.put("/ytest.do", new YTest());
		map.put("/jongPage.do", new jongPage());
		map.put("/chan.do", new chan());
		map.put("/GeunPractice.do", new GeunPractice());

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command command = map.get(page);
		String viewPage = command.exec(request, response);
		
		if(!viewPage.endsWith(".do")) {
			// viewPage = "/WEB-INF/views/" + viewPage + ".jsp";
			viewPage = viewPage + ".tiles";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
