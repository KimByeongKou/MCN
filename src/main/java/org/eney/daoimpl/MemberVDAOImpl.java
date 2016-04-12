package org.eney.daoimpl;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberVDAO;
import org.eney.domain.MemberVDTO;
import org.springframework.stereotype.Repository;


@Repository
public class MemberVDAOImpl implements MemberVDAO{

	
	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.memberViewMapper";
	
	
	
	@Override
	public MemberVDTO searchMemberViewOverview(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateMemberToCreator(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateCreatorToMember(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateMemberToAdvertiser(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateAdvertiserToMember(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
