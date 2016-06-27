package org.eney.domain;

/**
 * 멤버의 sns 정보를 가지는 VO 클래스.
 * @author KimByeongKou
 *
 */
public class MemberSns {

	private String snsName;		// sns 이름.
	private String snsAddr;		// sns 주소.
	public MemberSns(String snsName, String snsAddr) {
		super();
		this.snsName = snsName;
		this.snsAddr = snsAddr;
	}
	public MemberSns() {
		super();
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
		return "MemberSns [snsName=" + snsName + ", snsAddr=" + snsAddr + "]";
	}

	
}
