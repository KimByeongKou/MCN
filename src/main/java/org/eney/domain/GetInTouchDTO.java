package org.eney.domain;

import java.util.Date;

public class GetInTouchDTO {

	private Integer touchNo;
	private Date touchTime;
	private String phoneNum;
	private String email;
	private String info;
	
	public GetInTouchDTO() {
		super();
	}

	public GetInTouchDTO(Integer touchNo, Date touchTime, String phoneNum, String email, String info) {
		super();
		this.touchNo = touchNo;
		this.touchTime = touchTime;
		this.phoneNum = phoneNum;
		this.email = email;
		this.info = info;
	}

	public Integer getTouchNo() {
		return touchNo;
	}

	public void setTouchNo(Integer touchNo) {
		this.touchNo = touchNo;
	}

	public Date getTouchTime() {
		return touchTime;
	}

	public void setTouchTime(Date touchTime) {
		this.touchTime = touchTime;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
