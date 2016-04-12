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
	
	
	
	public String getTime() {
	//	transactionManager.
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	
	
	@Override
	public Integer createMember(String name, String email, String phone) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_name", name);
		paramMap.put("m_email", email);
		paramMap.put("m_phone_num", phone);
		
		
		System.out.println(paramMap);
		
		return sqlSession.insert(namespace+".createMember", paramMap);
	}

	
	
	@Override
	public MemberDTO searchMemberOverview(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMember(Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_member_no", memberNo);
		return sqlSession.delete(namespace+".deleteMember", paramMap);
	}



	@Override
	public List<MemberDTO> searchMemberAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchMemberAll");
	}



	@Override
	public int updateMemberToCreator(Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_member_no", memberNo);
		paramMap.put("creator_string", (String)"crecre");
		
		return sqlSession.update(namespace+".updateMemberToCreator", paramMap);
	}

}
