package org.eney.domain;

public class MemberSnsVDTO {


	private Integer snsAddrNo;
	private int memberNo;
	private String email;
	private String name;
	private String snsAddr;
	
	
	public MemberSnsVDTO() {
		super();
	}



	public MemberSnsVDTO(Integer snsAddrNo, int memberNo, String email, String name, String snsAddr) {
		super();
		this.snsAddrNo = snsAddrNo;
		this.memberNo = memberNo;
		this.email = email;
		this.name = name;
		this.snsAddr = snsAddr;
	}


	public int getMemberNo() {
		return memberNo;
	}


	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSnsAddr() {
		return snsAddr;
	}


	public void setSnsAddr(String snsAddr) {
		this.snsAddr = snsAddr;
	}

	public Integer getSnsAddrNo() {
		return snsAddrNo;
	}


	public void setSnsAddrNo(Integer snsAddrNo) {
		this.snsAddrNo = snsAddrNo;
	}

	
	
	
	
	
	
}
