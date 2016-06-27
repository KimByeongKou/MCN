package org.eney.domain;

import java.util.Date;

/**
 *	문의 사항에 대한 정보를 가지는 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class GetInTouchDTO {

	private Integer touchNo;		// 문의 사항 id
	private Date touchTime;			// 문의 시점.
	private String phoneNum;		// 문의자 폰넘버.
	private String email;			// 문의자 이메일.
	private String info;			// 문의 내
	
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
