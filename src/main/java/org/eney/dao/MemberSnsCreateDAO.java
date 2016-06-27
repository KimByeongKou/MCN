package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버의 sns info 관련하여 Create 시 필요한 기능 명세
 * @author eney-pc3
 *
 */
public interface MemberSnsCreateDAO {

	/**
	 * 멤버가 크리에이터 지원 시, 멤버의 sns 정보를 따로 저장하는 tbl_sns_info 테이블에 insert하는 impl 메서드.
	 * 
	 * @param memberNo	memberNo
	 * @param snsName	sns이름.
	 * @param snsAddr	sns주소.
	 * @return 성공여부. 성공 시 양수, 실패 시 음수.
	 */
	public Integer createMemberSns(Integer memberNo, String snsName, String snsAddr);
}
