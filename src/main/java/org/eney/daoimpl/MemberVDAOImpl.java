package org.eney.daoimpl;

import java.util.List;

import org.eney.dao.MemberVDAO;
import org.eney.domain.MemberVDTO;
import org.springframework.stereotype.Repository;



/**
 * MemberVDAO를 구현하는 구체 클래스 Repository
 * @author KimByeongKou
 *
 */
@Repository
public class MemberVDAOImpl implements MemberVDAO{

	
	//@Inject
	//private SqlSession sqlSession;
	
	//MyBatis  사용을 위한  xml Mapper Namespace
	//private static final String namespace =	"org.eney.mapper.memberViewMapper";


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
