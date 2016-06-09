package org.eney.domain;

public class SNSInfo {

	private String snsName;
	private String snsAddr;
	
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
