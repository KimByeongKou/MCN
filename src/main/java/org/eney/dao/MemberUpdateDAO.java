package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버 테이블에서 Update와 관련된 기능을 담은 인터페이스.
 * @author eney-pc3
 *
 */
public interface MemberUpdateDAO {

	/**
	 * 일반 멤버를 크리에이터로 승격시키는 메서드.
	 * @param memberNo 승격시키려는 memberNo
	 * @return 성공 여부.
	 */
	public int updateMemberToCreator(Integer memberNo);
	
	/**
	 * 
	 * @param memberNo
	 * @return
	 */
	public Integer updateCreatorToMember(String memberNo);
}
