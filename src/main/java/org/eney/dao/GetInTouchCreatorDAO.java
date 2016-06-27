package org.eney.dao;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * GetInTouch 기능과 관련하여 Create 시 필요한 기능 명세
 * 
 * @author eney-pc3
 *
 */
public interface GetInTouchCreatorDAO {

	/**
	 * GetInTouch 레코드를 Create 한다.
	 * 
	 * @param name			문의자 이름
	 * @param phoneNum		문의자 번호
	 * @param email			문의자 이메일
	 * @param info			문의자 문의 내용
	 * @return	Integer		성공 시 1, 실패 시 0
	 */
	public Integer createGetInTouch(String name, String phoneNum, String email, String info);
	
}
