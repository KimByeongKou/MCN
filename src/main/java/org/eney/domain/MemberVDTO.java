package org.eney.domain;

public class MemberVDTO {

	private int memberNo;
	private String name;
	private String email;
	private String phoneNum;
	private String regDate;
	private String className;
	
	public MemberVDTO() {
		super();
	}

	public MemberVDTO(int memberNo, String name, String email, String phoneNum, String regDate, String className) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.regDate = regDate;
		this.className = className;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}
