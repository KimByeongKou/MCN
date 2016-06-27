package org.eney.dao;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 장르와 관련하여 Create 시 필요한 기능 명세
 * 
 * @author eney-pc3
 *
 */
public interface GenreCreateDAO {
	
	/**
	 * 지원서 ID와, 지원자 ID, 그리고 장르 코드를 인자로 하여, 특정 지원서의 특정 회원이 지원한 장르 정보를 CREATE 한다.
	 * 
	 * @param creatorApplyNo	지원서 ID
	 * @param creatorNo			지원자 ID
	 * @param genreClassNo		장르 코드
	 * @return Integer  	성공시 1, 실패 시 0
	 */
	public Integer createGenre(Integer creatorApplyNo, Integer creatorNo, Integer genreClassNo);
	
}
