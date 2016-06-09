package org.eney.dao;

import java.util.List;

import org.eney.domain.GenreVDTO;

public interface GenreRetrieveVDAO {

	public List<GenreVDTO> searchGenreViewAll();
	public List<GenreVDTO> searchGenreViewByGenreClassNo(Integer genreClassNo);
	public List<GenreVDTO> searchGenreViewByCreatorApplyNo(Integer creatorApplyNo);
	public List<GenreVDTO> searchGenreViewByCreatorNo(Integer creatorNo);
	public List<GenreVDTO> searchGenreViewByClassName(String genreClassName);
}
