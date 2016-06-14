package org.eney.service;

import java.util.List;

import org.eney.domain.Member;

public interface MemberService {

	public Integer isMember(String accessToken);
	public Integer registerMember(String userId, String accessToken, String name);
	public Integer getMemberNo(String userId);
	public Integer registerClass(Integer memberNo, String className);
	public Integer isAdmin (String userId, String name, Integer memberNo);
	
	public List<Member> searchAllMember();
}
