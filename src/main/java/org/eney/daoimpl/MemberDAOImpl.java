package org.eney.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberDAO;
import org.eney.domain.MemberDTO;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAOImpl implements MemberDAO{

	

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.memberMapper";


	@Override
	public Integer createMember(String name, String userId, String accessToken) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_name", name);
		paramMap.put("m_user_id", userId);
		paramMap.put("m_access_token", accessToken);
		
		
		return sqlSession.insert(namespace+".createMember", paramMap);
	}

	
	

	@Override
	public int updateMemberToCreator(Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("creator_string", "creator");
		paramMap.put("m_member_no", memberNo);
		return sqlSession.update(namespace+".updateMemberToCreator", paramMap);
	}


	@Override
	public Integer updateCreatorToMember(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberDTO> searchMemberAll() {
		// TODO Auto-generated method stub

		return sqlSession.selectList(namespace+".searchMemberAll");
	}


	@Override
	public Integer searchMemberNo(String userId) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_user_id", userId);
		return sqlSession.selectOne(namespace+".searchNewId", paramMap);
	}


	@Override
	public MemberDTO searchMemberByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberDTO> searchMemberByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MemberDTO searchMemberByUserId(String userId) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_user_id", userId);
		return sqlSession.selectOne(namespace+".searchMemberByUserId", paramMap);
	}


	@Override
	public MemberDTO searchMemberByAccessToken(String accessToken) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer deleteMember(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}




	//가입이후 할당된 멤버 넘버를 가져오기 위한 메서드
	@Override
	public Integer searchNewId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Integer searchAdmin(String userId, String name, Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_user_id", userId);
		paramMap.put("m_name", name);
		paramMap.put("m_member_no", memberNo);
		return sqlSession.selectOne(namespace+".searchAdmin", paramMap);
	}


}
