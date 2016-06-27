package org.eney.dao;

import java.util.List;

import org.eney.domain.GenreVDTO;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 장르와 관련하여 Retrieve 시 필요한 기능 명세
 * 
 * @author eney-pc3
 *
 */
public interface GenreRetrieveVDAO {

	/**
	 * 모든 GenreView 테이블의 내용을 검색한다.
	 * @return	GenreViewDTO 리스트
	 */
	public List<GenreVDTO> searchGenreViewAll();
	
	/**
	 * 장르 코드로 GenreView 테이블의 내용을 검색한다.
	 * 
	 * @param genreClassNo	장르 코드
	 * @return	GenreViewDTO 리스트
	 */
	public List<GenreVDTO> searchGenreViewByGenreClassNo(Integer genreClassNo);
	
	
	/**
	 * 
	 * 지원서 id 로 GenreView 테이블을 검색한다.
	 * 
	 * @param creatorApplyNo	지원서 id
	 * @return	GenreViewDTO 리스트
	 */
	public List<GenreVDTO> searchGenreViewByCreatorApplyNo(Integer creatorApplyNo);
	
	
	/**
	 * 
	 * 멤버 id 로 GenreView 테이블을 검색한다
	 * 
	 * @param creatorNo		멤버 id
	 * @return	GenreViewDTO 리스트
	 */
	public List<GenreVDTO> searchGenreViewByCreatorNo(Integer creatorNo);
	
	/**
	 * 
	 * 장르 이름으로 GenreView 테이블을 검색한다.
	 * 
	 * @param genreClassName		장르 이름
	 * @return	GenreViewDTO 리스트
	 */
	public List<GenreVDTO> searchGenreViewByClassName(String genreClassName);
}
