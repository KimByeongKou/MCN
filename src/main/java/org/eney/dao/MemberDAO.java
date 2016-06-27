package org.eney.dao;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버와 관련된 모든 DAO를 상속받은 확장 인터페이스.
 * @author eney-pc3
 *
 */
public interface MemberDAO extends MemberCreateDAO, MemberUpdateDAO, MemberRetrieveDAO, MemberDeleteDAO{
	
}
