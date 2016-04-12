package org.eney.domain;

public class Member {

	private Integer memberNo;
	private String name;
	private String email;
	private String phoneNum;
	
	
	public Member() {
		super();
		memberNo = new Integer(0);
		name = new String();
		email = new String();
		phoneNum = new String();
	}
	public Member(Integer memberNo, String name, String email, String phoneNum) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
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
	
}
