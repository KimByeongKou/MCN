package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버와 관련하여 Create 시 필요한 기능 명세
 * @author eney-pc3
 *
 */
public interface MemberCreateDAO {
	/**
	 * 이름, 페이스북 유저 id, 페이스북 accessToken 으로, 회원 가입을 하는 메서드
	 * 
	 * @param name			유저 이름
	 * @param userId		페이스북 id (이메일 아님)
	 * @param accessToken	로그인 accessToken
	 * @return	Integer 	성공 시 1, 실패 시 0 
	 */
	public Integer createMember(String name, String userId, String accessToken);
}
