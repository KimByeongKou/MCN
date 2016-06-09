package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberDTO;

public interface MemberRetrieveDAO {

	public List<MemberDTO> searchMemberAll();
	public Integer searchMemberNo(String userId);
	public Integer searchNewId(String userId);
	public MemberDTO searchMemberByMemberNo(Integer memberNo);
	public List<MemberDTO> searchMemberByName(String name);
	public MemberDTO searchMemberByUserId(String userId);
	public MemberDTO searchMemberByAccessToken(String accessToken);
	public Integer searchAdmin(String userId, String name, Integer memberNo);
}
