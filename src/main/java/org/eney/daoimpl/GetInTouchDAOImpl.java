package org.eney.daoimpl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.GetInTouchDAO;
import org.springframework.stereotype.Repository;

/**
 * GetInTouchDAO를 구현하는 구체 클래스 Repository
 * @author KimByeongKou
 *
 */
@Repository
public class GetInTouchDAOImpl implements GetInTouchDAO{

	
	@Inject
	private SqlSession sqlSession;
	
	
	//MyBatis  사용을 위한  xml Mapper Namespace
	private static final String namespace =
			"org.eney.mapper.GetInTouchMapper";
	
	@Override
	public Integer createGetInTouch(String name, String phoneNum, String email, String info) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("touch_name", name);
		paramMap.put("touch_phone_num", phoneNum);
		paramMap.put("touch_email", email);
		paramMap.put("touch_info", info);
		return sqlSession.insert(namespace+".createGetInTouch", paramMap);
	}
/*
	@Override
	public Integer deleteGetInTouchByTouchNo(Integer touchNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetInTouchDTO> searchAllGetInTouch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetInTouchDTO searchGetInTouchByTouchNo(Integer touchNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetInTouchDTO> searchGetInTouchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetInTouchDTO> searchGetInTouchByPhone(String phoneNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetInTouchDTO> searchGetInTouchByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetInTouchDTO> searchGetInTouchByTouchInfo(String touchInfo) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
