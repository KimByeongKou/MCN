package org.eney.dao;

public interface MemberCreateDAO {

	public Integer createMember(String name, String userId, String accessToken);
	//public Integer createMemberClass(Integer memberNo, String className);
}
