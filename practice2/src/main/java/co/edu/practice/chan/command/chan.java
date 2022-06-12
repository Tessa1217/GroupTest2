package co.edu.practice.chan.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edu.practice.chan.service.ChanService;
import co.edu.practice.chan.serviceImpl.ChanServiceImpl;
import co.edu.practice.chan.vo.ChanVO;
import co.edu.practice.common.Command;

public class chan implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		ChanService dao = new ChanServiceImpl();
		List<ChanVO> list = dao.chanListSelect();
		request.setAttribute("list",list);
		return "chan/chan";
	}

}
