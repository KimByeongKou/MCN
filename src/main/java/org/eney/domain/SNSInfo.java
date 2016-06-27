package org.eney.domain;

/**
 * 하나의 sns 에 대한 정보를 담는 VO 클래스.
 * @author KimByeongKou
 *
 */
public class SNSInfo {

	private String snsName;		// sns 이름.
	private String snsAddr;		// sns 주소.
	
	public SNSInfo() {
		super();
	}

	public SNSInfo(String snsName, String snsAddr) {
		super();
		this.snsName = snsName;
		this.snsAddr = snsAddr;
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
		return "SNSInfo [snsName=" + snsName + ", snsAddr=" + snsAddr + "]";
	}
	
	
}
