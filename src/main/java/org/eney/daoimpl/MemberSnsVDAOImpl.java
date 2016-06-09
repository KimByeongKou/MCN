package org.eney.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberSnsVDAO;
import org.eney.domain.MemberSnsVDTO;
import org.springframework.stereotype.Repository;


@Repository
public class MemberSnsVDAOImpl implements MemberSnsVDAO{

	

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.memberSnsViewMapper";


	@Override
	public List<MemberSnsVDTO> searchMemberSnsViewByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsAddr(Integer snsAddr) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsName(String snsName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberSnsVDTO> searchMemberSnsViewAll() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	

}
