package org.eney.dao;

public interface MemberUpdateVDAO {

	public Integer updateMemberToCreator(String memberNo);
	public Integer updateCreatorToMember(String memberNo);
	public Integer updateMemberToAdvertiser(String memberNo);
	public Integer updateAdvertiserToMember(String memberNo);
}
