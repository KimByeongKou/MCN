package org.eney.domain;

import java.util.Date;

public class MemberDTO {

	private Integer memberNo;
	private String name;
	private String userId;
	private String accessToken;
	private Date regDate;
	
	public MemberDTO() {
		super();
		memberNo = new Integer(0);
		name = new String();
		userId = new String();
		accessToken = new String();
		regDate = new Date();
	}

	public MemberDTO(Integer memberNo, String name, String userId, String accessToken, Date regDate) {
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", name=" + name + ", userId=" + userId + ", accessToken="
				+ accessToken + ", regDate=" + regDate + "]";
	}
	
	
	
}
