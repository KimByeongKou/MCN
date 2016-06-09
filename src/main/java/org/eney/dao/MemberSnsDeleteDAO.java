package org.eney.dao;

public interface MemberSnsDeleteDAO {

	public Integer deleteMemberSnsBySnsAddrNo(Integer snsAddrNo);
	public Integer deleteMemberSnsByMemberNo(Integer memberNo);
	public Integer deleteMemberSnsByMemberNoSnsName(Integer memberNo, String snsName);
	
}
