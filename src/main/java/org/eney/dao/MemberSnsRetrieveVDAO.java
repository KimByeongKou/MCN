package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberSnsVDTO;

public interface MemberSnsRetrieveVDAO {

	public List<MemberSnsVDTO> searchMemberSnsViewByMemberNo(Integer memberNo);
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsAddrNo(Integer addrNo);
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsAddr(String snsAddr);
	public List<MemberSnsVDTO> searchMemberSnsViewAll();
	
}
