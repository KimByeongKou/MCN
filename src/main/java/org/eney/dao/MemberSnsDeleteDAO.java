package org.eney.dao;
/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버의 sns 정보에서 delete와 관련된 기능을 담은 인터페이스.
 * @author eney-pc3
 *
 */
public interface MemberSnsDeleteDAO {

	/**
	 * 
	 * @param snsAddrNo
	 * @return
	 */
	public Integer deleteMemberSnsBySnsAddrNo(Integer snsAddrNo);
	
	/**
	 * 
	 * @param memberNo
	 * @return
	 */
	public Integer deleteMemberSnsByMemberNo(Integer memberNo);
	
	/**
	 * 
	 * @param memberNo
	 * @param snsName
	 * @return
	 */
	public Integer deleteMemberSnsByMemberNoSnsName(Integer memberNo, String snsName);
	
}
