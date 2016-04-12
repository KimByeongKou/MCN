package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberDTO;

public interface MemberRetrieveDAO {

	public MemberDTO searchMemberOverview(Integer memberNo);
	public List<MemberDTO> searchMemberAll();
	
}
