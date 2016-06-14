package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberSnsVDTO;

public interface MemberSnsRetrieveVDAO {

	public List<MemberSnsVDTO> searchMemberSnsViewByMemberNo(Integer memberNo);
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsAddr(Integer snsAddr);
	public List<MemberSnsVDTO> searchMemberSnsViewBySnsName(String snsName);
	public List<MemberSnsVDTO> searchMemberSnsViewAll();
	
}
