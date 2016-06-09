package org.eney.dao;

import java.util.List;

import org.eney.domain.GenreDTO;

public interface GenreRetrieveDAO {

	public List<GenreDTO> searchGenreAll();
	public GenreDTO searchGenreByGenreNo(Integer genreNo);
	public List<GenreDTO> searchGenreByCreatorNo(Integer creatorNo);
}
