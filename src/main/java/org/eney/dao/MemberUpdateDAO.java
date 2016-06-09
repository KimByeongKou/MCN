package org.eney.dao;

public interface MemberUpdateDAO {

	public int updateMemberToCreator(Integer memberNo);
	public Integer updateCreatorToMember(String memberNo);
}
