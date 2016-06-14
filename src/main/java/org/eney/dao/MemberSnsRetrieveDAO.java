package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberSnsDTO;

public interface MemberSnsRetrieveDAO {

	public List<MemberSnsDTO> searchMemberSnsAll();
	public List<MemberSnsDTO> searchMemberSnsByMemberNo(Integer memberNo);
	public List<MemberSnsDTO> searchMemberSnsBySnsAddr(String snsAddr);
	public List<MemberSnsDTO> searchMemberSnsBySnsName(String snsName);
}
