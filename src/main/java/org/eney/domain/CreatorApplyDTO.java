package org.eney.domain;

import java.util.Date;

public class CreatorApplyDTO {

	private Integer creatorApplyNo;
	private Integer creatorNo;
	private String name;
	private String email;
	private String phoneNum;
	private String applyInfo;
	private Date applyTime;
	private Boolean isAccepted;
	private String originalFileName;
	private String storedFileName;
	
	public CreatorApplyDTO() {
		super();
		creatorApplyNo = new Integer(0);
		creatorNo = new Integer(0);
		name = new String();
		email = new String();
		phoneNum = new String();
		applyInfo = new String();
		applyTime = new Date();
		isAccepted = new Boolean(false);
		originalFileName = new String();
		storedFileName = new String();
	}
	public CreatorApplyDTO(Integer creatorApplyNo, Integer creatorNo, String name, String email, String phoneNum,
			String applyInfo, Date applyTime, Boolean isAccepted, String originalFileName, String storedFileName) {
		super();
		this.creatorApplyNo = creatorApplyNo;
		this.creatorNo = creatorNo;
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
		this.applyInfo = applyInfo;
		this.applyTime = applyTime;
		this.isAccepted = isAccepted;
		this.originalFileName = originalFileName;
		this.storedFileName = storedFileName;
	}
	public Integer getCreatorApplyNo() {
		return creatorApplyNo;
	}
	public void setCreatorApplyNo(Integer creatorApplyNo) {
		this.creatorApplyNo = creatorApplyNo;
	}
	public Integer getCreatorNo() {
		return creatorNo;
	}
	public void setCreatorNo(Integer creatorNo) {
		this.creatorNo = creatorNo;
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
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getStoredFileName() {
		return storedFileName;
	}
	public void setStoredFileName(String storedFileName) {
		this.storedFileName = storedFileName;
	}
	@Override
	public String toString() {
		return "CreatorApplyDTO [creatorApplyNo=" + creatorApplyNo + ", creatorNo=" + creatorNo + ", name=" + name
				+ ", email=" + email + ", phoneNum=" + phoneNum + ", applyInfo=" + applyInfo + ", applyTime="
				+ applyTime + ", isAccepted=" + isAccepted + ", originalFileName=" + originalFileName
				+ ", storedFileName=" + storedFileName + "]";
	}
	
	
}
