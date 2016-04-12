package org.eney.domain;

import java.util.Date;

public class Apply {

	private Integer applyNo;
	private Integer memberNo;
	private String name;
	private String email;
	private String phoneNum;
	private String applyInfo;
	private Date applyTime;
	private Boolean isAccepted;
	

	
	public Apply() {
		super();
		applyNo = new Integer(0);
		memberNo = new Integer(0);
		name = new String();
		email = new String();
		phoneNum = new String();
		applyInfo = new String();
		applyTime = new Date();
		isAccepted = new Boolean(false);
	}
	public Apply(Integer applyNo, Integer memberNo, String name, String email, String phoneNum, String applyInfo,
			Date applyTime, Boolean isAccepted) {
		super();
		this.applyNo = applyNo;
		this.memberNo = memberNo;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.applyInfo = applyInfo;
		this.applyTime = applyTime;
		this.isAccepted = isAccepted;
	}
	public Integer getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(Integer applyNo) {
		this.applyNo = applyNo;
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
	public String getApplyInfo() {
		return applyInfo;
	}
	public void setApplyInfo(String applyInfo) {
		this.applyInfo = applyInfo;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Boolean getIsAccepted() {
		return isAccepted;
	}
	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
	
}
