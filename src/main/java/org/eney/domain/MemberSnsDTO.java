package org.eney.domain;

/**
 * tbl_sns_info를 위한 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class MemberSnsDTO {

	private Integer snsAddrNo;		// sns Info Id
	private Integer memberNo;		// member iD
	private String snsAddr;			// SNS Addr
	private String snsName;			// SNS Name
	
	public MemberSnsDTO() {
		super();
	}
	public MemberSnsDTO(Integer snsAddrNo, Integer memberNo, String snsAddr, String snsName) {
		super();
		this.snsAddrNo = snsAddrNo;
		this.memberNo = memberNo;
		this.snsAddr = snsAddr;
		this.snsName = snsName;
	}
	public Integer getSnsAddrNo() {
		return snsAddrNo;
	}
	public void setSnsAddrNo(Integer snsAddrNo) {
		this.snsAddrNo = snsAddrNo;
	}
	public Integer getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Integer memberNo) {
		this.memberNo = memberNo;
	}
	public String getSnsAddr() {
		return snsAddr;
	}
	public void setSnsAddr(String snsAddr) {
		this.snsAddr = snsAddr;
	}
	public String getSnsName() {
		return snsName;
	}
	public void setSnsName(String snsName) {
		this.snsName = snsName;
	}
	
}
