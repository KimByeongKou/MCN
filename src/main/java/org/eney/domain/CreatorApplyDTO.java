package org.eney.domain;

import java.util.Date;

public class CreatorApplyDTO {

	private int applyNo;
	private int memberNo;
	private String name;
	private String email;
	private String phoneNum;
	private String otherSns;
	private String facebook;
	private String youtubAfrica;
	private String applyInfo;
	private Date applyTime;
	private boolean isAccepted;
	
	
	public CreatorApplyDTO() {
		super();
	}


	public CreatorApplyDTO(int applyNo, int memberNo, String name, String email, String phoneNum, String otherSns,
			String facebook, String youtubAfrica, String applyInfo, Date applyTime, boolean isAccepted) {
		super();
		this.applyNo = applyNo;
		this.memberNo = memberNo;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.otherSns = otherSns;
		this.facebook = facebook;
		this.youtubAfrica = youtubAfrica;
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


	public String getOtherSns() {
		return otherSns;
	}


	public void setOtherSns(String otherSns) {
		this.otherSns = otherSns;
	}


	public String getFacebook() {
		return facebook;
	}


	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}


	public String getYoutubAfrica() {
		return youtubAfrica;
	}


	public void setYoutubAfrica(String youtubAfrica) {
		this.youtubAfrica = youtubAfrica;
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
