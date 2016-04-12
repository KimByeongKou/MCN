package org.eney.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.CreatorApplyDAO;
import org.eney.domain.CreatorApply;
import org.eney.domain.CreatorApplyDTO;
import org.springframework.stereotype.Repository;


@Repository
public class CreatorApplyDAOImpl implements CreatorApplyDAO{

	
	
	

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.creatorApplyMapper";
	
	
	
	
	@Override
	public Integer createCreatorApply(Integer memberNo, String name, String email, String phone, String youtubeAfrice,
			String facebook, String otherSns, String applyInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer createCreatorApply(CreatorApply creatorApply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCreatorApply(Integer applyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorApplyAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreatorApplyDTO searchCreatorApplyByCreatorApplyNo(Integer applyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByYoutubeAfrica(String youtubeAfrica) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByFacebook(String facebook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApplyDTO> searchCreatorByOtherSns(String otherSns) {
		// TODO Auto-generated method stub
		return null;
	}

}
