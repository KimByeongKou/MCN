package org.eney.domain;

import java.util.Date;

/**
 * 크리에이터, 장르, sns 정보를 교환하기 위한 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class CreatorGenreSnsDTO {

	private Integer creatorApplyNo;		// 크리에이터 지원서 id	
	private Integer creatorNo;			// 크리에이터 멤버 id.
	private String name;				// 크리에이터 네임.
	private String email;				// 크리에이터 이메일.
	private String phoneNum;			//크리에이터 폰 넘버.
	private String applyInfo;			//크리에이터 지원서 내용.
	private Date applyTime;				//크리에이터 지원 시점.
	private Boolean isAccepted;			//크리에이터 수용 여부.
	private String originalFileName;	//크리에이터 프로필 사진 원본 이름.
	private String storedFileName;		//크리에이터 프로필 사진 저장소 파일 이름.
	private String snsName;				//크리에이터 sns 이름.
	private String snsAddr;				//크리에이터 sns addr.
	
	
	public CreatorGenreSnsDTO() {
		super();
	}
	public CreatorGenreSnsDTO(Integer creatorApplyNo, Integer creatorNo, String name, String email, String phoneNum,
			String applyInfo, Date applyTime, Boolean isAccepted, String originalFileName, String storedFileName,
			String snsName, String snsAddr) {
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
		this.snsName = snsName;
		this.snsAddr = snsAddr;
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
	public String getSnsName() {
		return snsName;
	}
	public void setSnsName(String snsName) {
		this.snsName = snsName;
	}
	public String getSnsAddr() {
		return snsAddr;
	}
	public void setSnsAddr(String snsAddr) {
		this.snsAddr = snsAddr;
	}
	@Override
	public String toString() {
		return "CreatorGenreSnsDTO [creatorApplyNo=" + creatorApplyNo + ", creatorNo=" + creatorNo + ", name=" + name
				+ ", email=" + email + ", phoneNum=" + phoneNum + ", applyInfo=" + applyInfo + ", applyTime="
				+ applyTime + ", isAccepted=" + isAccepted + ", originalFileName=" + originalFileName
				+ ", storedFileName=" + storedFileName + ", snsName=" + snsName + ", snsAddr=" + snsAddr + "]";
	}
	
	
}
