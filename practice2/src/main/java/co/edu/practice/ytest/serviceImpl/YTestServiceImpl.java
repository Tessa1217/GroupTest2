package co.edu.practice.ytest.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.edu.practice.common.DataSource;
import co.edu.practice.ytest.service.YTestMapper;
import co.edu.practice.ytest.service.YTestService;
import co.edu.practice.ytest.vo.YTestVO;

public class YTestServiceImpl implements YTestService {
	
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private YTestMapper map = sqlSession.getMapper(YTestMapper.class);

	@Override
	public List<YTestVO> yTestSelectList() {
		return map.yTestSelectList();
	}

}
