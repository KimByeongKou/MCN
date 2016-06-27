package org.eney.daoimpl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberSnsDAO;
import org.springframework.stereotype.Repository;



/**
 * MemberSnsDAO를 구현하는 구체 클래스 Repository
 * @author KimByeongKou
 *
 */
@Repository
public class MemberSnsDAOImpl implements MemberSnsDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	//MyBatis  사용을 위한  xml Mapper Namespace
	private static final String namespace =
			"org.eney.mapper.memberSnsMapper";


	@Override
	public Integer createMemberSns(Integer memberNo, String snsName, String snsAddr) {
		// TODO Auto-generated method stub
		//createMemberSns
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_member_no", memberNo);
		paramMap.put("m_sns_name", snsName);
		paramMap.put("m_sns_addr", snsAddr);
		
		return sqlSession.insert(namespace+".createMemberSns",paramMap);
	}


	@Override
	public Integer updateMemberSnsAddr(Integer memberNo, String snsName, String snsAddr) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*

	@Override
	public List<MemberSnsDTO> searchMemberSnsAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsDTO> searchMemberSnsByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsDTO> searchMemberSnsBySnsAddr(String snsAddr) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsDTO> searchMemberSnsBySnsName(String snsName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer deleteMemberSnsBySnsAddrNo(Integer snsAddrNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer deleteMemberSnsByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer deleteMemberSnsByMemberNoSnsName(Integer memberNo, String snsName) {
		// TODO Auto-generated method stub
		return null;
	}

	 */
	
	
	
	
}
