package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버와 관련하여 DELETE 시 필요한 기능 명세
 * @author eney-pc3
 *
 */
public interface MemberDeleteDAO {

	/**
	 * 멤버 id로 멤버 테이블의 레코드를 삭제하는 메서드.
	 * @param memberNo		멤버 id
	 * @return 성공 여부. 성공 시 양수, 실패 시 음수.
	 */
	public Integer deleteMember(Integer memberNo);
	
}
