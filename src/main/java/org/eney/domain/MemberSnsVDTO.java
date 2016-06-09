package org.eney.domain;

public class MemberSnsVDTO {


	private Integer memberNo;
	private String userId;
	private String accessToken;
	private String name;
	private String snsAddr;
	private String snsName;
	
	public MemberSnsVDTO() {
		super();
		memberNo = new Integer(0);
		userId = new String();
		accessToken = new String();
		name = new String();
		snsAddr = new String();
		snsName = new String();
	}

	public MemberSnsVDTO(Integer memberNo, String userId, String accessToken, String name, String snsAddr,
			String snsName) {
		super();
		this.memberNo = memberNo;
		this.userId = userId;
		this.accessToken = accessToken;
		this.name = name;
		this.snsAddr = snsAddr;
		this.snsName = snsName;
	}

	public Integer getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
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

	public String getSnsName() {
		return snsName;
	}

	public void setSnsName(String snsName) {
		this.snsName = snsName;
	}
	
	
}
