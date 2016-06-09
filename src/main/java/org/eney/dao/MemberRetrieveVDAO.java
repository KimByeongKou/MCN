package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberVDTO;

public interface MemberRetrieveVDAO {

	public List<MemberVDTO> searchMemberViewAll();
	public MemberVDTO searchMemberViewByMemberNo(Integer memberNo);
	public List<MemberVDTO> searchMemberViewByName(String memberName);
	public MemberVDTO searchMemberViewByUserId(String userId);
	public MemberVDTO searchMemberViewByAccessToken(String accessToken);
	
}
