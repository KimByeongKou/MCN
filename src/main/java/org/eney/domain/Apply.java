package org.eney.domain;

import java.util.Date;

/**
 * 지원서 기본 내용들을 가지고 있는 상속을 위한 VO 클래스.
 * @author KimByeongKou
 *
 */
public class Apply {

	protected Integer applyNo;		// 지원서 id
	protected Integer memberNo;		// 멤버 id
	protected String name;			// 멤버 이름.
	protected String email;			// 멤버 이메
	protected String phoneNum;		// 멤버 폰 넘
	protected String applyInfo;		// 지원서 내용.
	protected Date applyTime;		// 지원 시점.
	protected Boolean isAccepted;	// 크리에이터 또는 광고주 수용 여부.
	

	
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
	@Override
	public String toString() {
		return "Apply [applyNo=" + applyNo + ", memberNo=" + memberNo + ", name=" + name + ", email=" + email
				+ ", phoneNum=" + phoneNum + ", applyInfo=" + applyInfo + ", applyTime=" + applyTime + ", isAccepted="
				+ isAccepted + "]";
	}
}
