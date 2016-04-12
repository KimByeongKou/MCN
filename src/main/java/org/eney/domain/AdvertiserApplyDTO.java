package org.eney.domain;

import java.util.Date;

public class AdvertiserApplyDTO {

	private int applyNo;
	private int memberNo;
	private String name;
	private String companyName;
	private String email;
	private String phoneNum;
	private String concept;
	private int budget;
	private String applyInfo;
	private Date applyTime;
	private boolean isAccepted;
	
	
	
	public AdvertiserApplyDTO() {
		super();
	}
	public AdvertiserApplyDTO(int applyNo, int memberNo, String name, String companyName, String email, String phoneNum,
			String concept, int budget, String applyInfo, Date applyTime, boolean isAccepted) {
		super();
		this.applyNo = applyNo;
		this.memberNo = memberNo;
		this.name = name;
		this.companyName = companyName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.concept = concept;
		this.budget = budget;
		this.applyInfo = applyInfo;
		this.applyTime = applyTime;
		this.isAccepted = isAccepted;
	}
	public int getApplyNo() {
		return applyNo;
	}
	public void setApplyNo(int applyNo) {
		this.applyNo = applyNo;
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
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getConcept() {
		return concept;
	}
	public void setConcept(String concept) {
		this.concept = concept;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
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
	public boolean isAccepted() {
		return isAccepted;
	}
	public void setAccepted(boolean isAccepted) {
		this.isAccepted = isAccepted;
	}
}
