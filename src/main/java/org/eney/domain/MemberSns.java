package org.eney.domain;

public class MemberSns {

	private String snsName;
	private String snsAddr;
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
