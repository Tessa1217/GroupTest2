package co.edu.practice.geun.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.edu.practice.common.DataSource;
import co.edu.practice.geun.service.GeunMapper;
import co.edu.practice.geun.service.GeunService;
import co.edu.practice.geun.vo.GeunVO;

public class GeunServiceImpl implements GeunService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private GeunMapper map = sqlSession.getMapper(GeunMapper.class);
	
	@Override
	public List<GeunVO> AllList() {
		
		return map.AllList();
	}
	
	
	
}
