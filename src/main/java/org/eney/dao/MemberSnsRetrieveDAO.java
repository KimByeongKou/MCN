package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberSnsDTO;


/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버의 sns 정보에서 Retrieve와 관련된 기능을 담은 인터페이스.
 * @author eney-pc3
 *
 */
public interface MemberSnsRetrieveDAO {

	/**
	 * 
	 * @return
	 */
	public List<MemberSnsDTO> searchMemberSnsAll();
	
	/**
	 * 
	 * @param memberNo
	 * @return
	 */
	public List<MemberSnsDTO> searchMemberSnsByMemberNo(Integer memberNo);
	
	/**
	 * 
	 * @param snsAddr
	 * @return
	 */
	public List<MemberSnsDTO> searchMemberSnsBySnsAddr(String snsAddr);
	
	/**
	 * 
	 * @param snsName
	 * @return
	 */
	public List<MemberSnsDTO> searchMemberSnsBySnsName(String snsName);
}
