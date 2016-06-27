package org.eney.daoimpl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.GenreDAO;
import org.springframework.stereotype.Repository;

@Repository
public class GenreDAOImpl  implements GenreDAO{

	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.GenreMapper";
	
	
	@Override
	public Integer createGenre(Integer creatorApplyNo, Integer creatorNo, Integer genreClassNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("cr_apply_no", creatorApplyNo);
		paramMap.put("cr_creator_no", creatorNo);
		paramMap.put("genre_class_no", genreClassNo);
		return sqlSession.insert(namespace+".createGenre", paramMap);
	}
/*
	@Override
	public Integer deleteGenreByGenreNo(Integer genreNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteGenreByCreatorNo(Integer creatorNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GenreDTO> searchGenreAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenreDTO searchGenreByGenreNo(Integer genreNo) {
		// TODO Auto-generated method stub	
		return null;
	}

	@Override
	public List<GenreDTO> searchGenreByCreatorNo(Integer creatorNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateGenreByCreatorNo(Integer creatorNo, Integer oldGenreClassNo, String newGenreClassNo) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
