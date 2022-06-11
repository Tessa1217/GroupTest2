package co.edu.practice.jong.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.edu.practice.common.DataSource;
import co.edu.practice.jong.service.JongMapper;
import co.edu.practice.jong.service.JongService;
import co.edu.practice.jong.vo.JongVO;

public class JongServiceImpl implements JongService {

	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private JongMapper map = sqlSession.getMapper(JongMapper.class);
	
	@Override
	public List<JongVO> selectAllJong() {
		
		return map.selectAllJong();
	}

}
