package co.edu.practice.jong.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.practice.common.Command;
import co.edu.practice.jong.service.JongService;
import co.edu.practice.jong.serviceImpl.JongServiceImpl;
import co.edu.practice.jong.vo.JongVO;

public class jongPage implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		List<JongVO> list = new ArrayList<JongVO>();
		JongService dao = new JongServiceImpl();
		
		list = dao.selectAllJong();
		
		System.out.println(list.size());
		
		request.setAttribute("list", list);
		
		return "jong/jongPage";
	}

}
