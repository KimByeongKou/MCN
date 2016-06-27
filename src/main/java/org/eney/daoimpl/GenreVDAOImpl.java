package org.eney.daoimpl;

import java.util.List;

import org.eney.dao.GenreVDAO;
import org.eney.domain.GenreVDTO;
import org.springframework.stereotype.Repository;


/**
 * GenreVDAO를 구현하는 구체 클래스 Repository
 * @author KimByeongKou
 *
 */
@Repository
public class GenreVDAOImpl implements GenreVDAO{

	@Override
	public List<GenreVDTO> searchGenreViewAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GenreVDTO> searchGenreViewByGenreClassNo(Integer genreClassNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GenreVDTO> searchGenreViewByCreatorApplyNo(Integer creatorApplyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GenreVDTO> searchGenreViewByCreatorNo(Integer creatorNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GenreVDTO> searchGenreViewByClassName(String genreClassName) {
		// TODO Auto-generated method stub
		return null;
	}

}
