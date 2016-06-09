package org.eney.dao;

public interface GenreUpdateDAO {

	public Integer updateGenreByCreatorNo(Integer creatorNo, Integer oldGenreClassNo, String newGenreClassNo);
	
}
