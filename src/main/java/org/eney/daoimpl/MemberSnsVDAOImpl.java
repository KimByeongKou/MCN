package org.eney.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.MemberSnsVDAO;
import org.eney.domain.MemberSnsVDTO;
import org.springframework.stereotype.Repository;


/**
 * MemberSnsVDAO를 구현하는 구체 클래스 Repository
 * @author KimByeongKou
 *
 */
@Repository
public class MemberSnsVDAOImpl implements MemberSnsVDAO{

	

	@Inject
	private SqlSession sqlSession;
	
	//MyBatis  사용을 위한  xml Mapper Namespace
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
