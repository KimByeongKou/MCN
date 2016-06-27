package org.eney.domain;

import java.util.Date;

/**
 * 멤버 테이블과 데이터 교환을 위한 멤버 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class MemberDTO {

	private Integer memberNo;			//멤버 id	
	private String name;				//멤버 이름.
	private String userId;				//멤버 userId
	private String accessToken;			//멤버 accessToken.
	private Date regDate;				//회원가입시점.
	
	public MemberDTO() {
		super();
		memberNo = new Integer(0);
		name = new String();
		userId = new String();
		accessToken = new String();
		regDate = new Date();
	}

	public MemberDTO(Integer memberNo, String name, String userId, String accessToken, Date regDate) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.userId = userId;
		this.accessToken = accessToken;
		this.regDate = regDate;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [memberNo=" + memberNo + ", name=" + name + ", userId=" + userId + ", accessToken="
				+ accessToken + ", regDate=" + regDate + "]";
	}
	
	
	
}
