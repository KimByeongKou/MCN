package org.eney.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.CreatorApplyDAO;
import org.eney.domain.CreatorApplyDTO;
import org.eney.domain.CreatorGenreSnsDTO;
import org.eney.domain.GenreVDTO;
import org.eney.domain.MemberSnsVDTO;
import org.springframework.stereotype.Repository;


@Repository
public class CreatorApplyDAOImpl implements CreatorApplyDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.creatorApplyMapper";


	@Override
	public Integer createCreatorApply(Integer creatorNo, String name, String email, String phoneNum, String youtubeAddr,
			String africaAddr, String facebookAddr, String blogAddr, String instaAddr, String otehrSns,
			String applyInfo, String originalFileName, String storedFileName) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_creator_no", creatorNo);
		paramMap.put("cr_name", name);
		paramMap.put("cr_email", email);
		paramMap.put("cr_phone_num", phoneNum);
		paramMap.put("cr_apply_info", applyInfo);
		paramMap.put("cr_is_accepted", false);
		paramMap.put("cr_original_file_name", originalFileName);
		paramMap.put("cr_stored_file_name", storedFileName);
		
		
		System.out.println("저장직전 정보 : " + creatorNo + name + email + phoneNum);
		return sqlSession.insert(namespace+".createCreatorApply", paramMap);
	}


	@Override
	public Integer deleteCreatorApplyCreatorApplyNo(Integer CreatorApplyNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer deleteCreatorApplyByCreatorNo(Integer creatorNo) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CreatorApplyDTO> searchCreatorApplyAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchCreatorApplyAll");
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

/*
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
	public List<CreatorApplyDTO> searchCreatorByApplyInfo(String applyInfo) {
		// TODO Auto-generated method stub
		return null;
	}

*/
	@Override
	public CreatorApplyDTO searchCreatorApplyByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		//cr_creator_no
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_creator_no", memberNo);
		CreatorApplyDTO res = sqlSession.selectOne(namespace+".searchCreatorApplyByMemberNo", paramMap);
		
		return res;
	}


	@Override
	public Integer searchNewApplyId(Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_creator_no", memberNo);
		return sqlSession.selectOne(namespace+".searchNewApplyId", paramMap);
	}


	@Override
	public List<GenreVDTO> searchGenreAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchGenreAll");
	}


	@Override
	public List<MemberSnsVDTO> searchMemberSnsAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchMmeberSnsAll");
	}


	@Override
	public Integer updateApplyAccepted(Integer applyNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_apply_no", applyNo);
		return sqlSession.update(namespace+".updateApplyAccepted", paramMap);
	}


	@Override
	public List<CreatorGenreSnsDTO> searchCreatorByGenre(String genre) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("genre_class_name", genre);
		
		
		return sqlSession.selectList(namespace+".searchCreatorByGenre", paramMap);
	}


	@Override
	public List<String> searchGenreByMemberNo(Integer memberNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_creator_no", memberNo);
		return sqlSession.selectList(namespace+".searchGenreByMemberNo", paramMap);
	}
	
	
	
	
	
}
