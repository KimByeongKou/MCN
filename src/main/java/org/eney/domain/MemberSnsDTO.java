package org.eney.domain;

public class MemberSnsDTO {

	private Integer snsAddrNo;
	private Integer memberNo;
	private String snsAddr;
	
	
	public MemberSnsDTO() {
		super();
	}
	public MemberSnsDTO(Integer snsAddrNo, Integer memberNo, String snsAddr) {
		super();
		this.snsAddrNo = snsAddrNo;
		this.memberNo = memberNo;
		this.snsAddr = snsAddr;
	}
	public Integer getSnsAddrNo() {
		return snsAddrNo;
	}
	public void setSnsAddrNo(Integer snsAddrNo) {
		this.snsAddrNo = snsAddrNo;
	}
	public Integer getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}
	public String getSnsAddr() {
		return snsAddr;
	}
	public void setSnsAddr(String snsAddr) {
		this.snsAddr = snsAddr;
	}
	
}
