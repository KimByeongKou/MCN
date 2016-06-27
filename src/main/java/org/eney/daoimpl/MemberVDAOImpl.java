package org.eney.daoimpl;

import java.util.List;

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
	public List<MemberVDTO> searchMemberViewAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MemberVDTO searchMemberViewByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MemberVDTO> searchMemberViewByName(String memberName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MemberVDTO searchMemberViewByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MemberVDTO searchMemberViewByAccessToken(String accessToken) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
