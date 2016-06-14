package org.eney.domain;

public class Member {

	protected Integer memberNo;
	protected String name;
	protected String userId;
	protected String accessToken;
	protected String regDate;
	
	public Member() {
		super();
		memberNo = new Integer(0);
		name = new String();
		userId = new String();
		accessToken = new String();
		regDate = new String();
	}
	
	public Member(Integer memberNo, String name, String userId, String accessToken, String regDate) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.userId = userId;
		this.accessToken = accessToken;
		this.regDate = regDate;
	}
	public Integer getMemberNo() {
		return memberNo;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", name=" + name + ", userId=" + userId + ", accessToken=" + accessToken
				+ ", regDate=" + regDate + "]";
	}

	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
