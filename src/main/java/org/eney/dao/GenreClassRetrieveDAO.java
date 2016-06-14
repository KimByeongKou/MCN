package org.eney.dao;

import java.util.List;

import org.eney.domain.GenreClassDTO;

public interface GenreClassRetrieveDAO {

	public List<GenreClassDTO> searchAllGenreClass();
	public GenreClassDTO searchGenreClassByClassNo(Integer genreClassNo);
}
