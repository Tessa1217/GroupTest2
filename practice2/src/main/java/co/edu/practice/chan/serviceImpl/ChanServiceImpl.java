package co.edu.practice.chan.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.edu.practice.chan.service.ChanMapper;
import co.edu.practice.chan.service.ChanService;
import co.edu.practice.chan.vo.ChanVO;
import co.edu.practice.common.DataSource;

public class ChanServiceImpl implements ChanService {
	private SqlSession sqlsession = DataSource.getInstance().openSession();
	private ChanMapper map = sqlsession.getMapper(ChanMapper.class);

	@Override
	public List<ChanVO> chanListSelect() {
		return map.chanListSelect();
	}

}
