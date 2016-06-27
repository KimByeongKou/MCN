package org.eney.domain;

import java.util.Date;

/**
 * view_member 테이블과 데이터 교환을 위한 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class MemberVDTO {

	private Integer memberNo;		//멤버 id
	private String name;			//멤버 이름.
	private String userId;			//user id
	private String accessToken;		//accesstoken
	private Date regDate;			//회원 가입시점.
	private String className;		//회원의 클래스 이름.(일반 멤버, 크리에이터, 광고주, ...)
	
	public MemberVDTO() {
		super();
		memberNo = new Integer(0);
		name = new String();
		userId = new String();
		accessToken = new String();
		regDate = new Date();
		className = new String();
	}

	public MemberVDTO(Integer memberNo, String name, String userId, String accessToken, Date regDate, String className) {
		super();
		this.memberNo = memberNo;
		this.name = name;
		this.userId = userId;
		this.accessToken = accessToken;
		this.regDate = regDate;
		this.setClassName(className);
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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}
