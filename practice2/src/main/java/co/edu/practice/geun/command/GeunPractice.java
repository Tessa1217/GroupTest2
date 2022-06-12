package co.edu.practice.geun.command;

import co.edu.practice.common.Command;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.practice.geun.service.GeunService;
import co.edu.practice.geun.serviceImpl.GeunServiceImpl;
import co.edu.practice.geun.vo.GeunVO;

public class GeunPractice implements Command {
	
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 세부목록 보기
				GeunService dao = new GeunServiceImpl();
				List<GeunVO> list = dao.AllList();
				request.setAttribute("list", list);
				
				return "geun/GeunPractice";
	}
}
