package org.eney.domain;

import java.util.Date;

public class MemberDTO {

	private int memberNo;
	private String name;
	private String phoneNum;
	private Date regDate;
	private String email;
	
	public MemberDTO() {
		super();
	}

	public MemberDTO(int memberNo, String name, String phoneNum, Date regDate, String email) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.phoneNum = phoneNum;
		this.regDate = regDate;
		this.email = email;
	}



	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", name=" + name + ", phoneNum=" + phoneNum + ", regDate=" + regDate
				+ ", email=" + email + "]";
	}
	
}
