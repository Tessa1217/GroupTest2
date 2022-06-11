package co.edu.practice.ytest.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.practice.common.Command;
import co.edu.practice.ytest.service.YTestService;
import co.edu.practice.ytest.serviceImpl.YTestServiceImpl;
import co.edu.practice.ytest.vo.YTestVO;

public class YTest implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		YTestService dao = new YTestServiceImpl(); 
		List<YTestVO> list = new ArrayList<YTestVO>();
		list = dao.yTestSelectList();
		request.setAttribute("list", list);
		return "ytest/ytestList";
	}

}
