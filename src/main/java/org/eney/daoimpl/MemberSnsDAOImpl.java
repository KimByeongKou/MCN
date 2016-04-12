package org.eney.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberSnsDAO;
import org.eney.domain.MemberSnsDTO;

public class MemberSnsDAOImpl implements MemberSnsDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.memberSnsMapper";
	
	
	
	
	@Override
	public Integer createMemberSns(Integer snsAddrNo, String snsAddr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateMemberSnsAddr(Integer snsAddrNo, String snsAddr) {
		// TODO Auto-generated method stub
		return null;
	}

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
	public Integer deleteMemberSnsBySnsAddrNo(Integer snsAddrNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMemberSnsByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
