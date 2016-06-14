package org.eney.domain;

import java.util.Date;

public class NoticeDTO {

	private int noticeNo;
	private int memberNo;
	private String title;
	private Date writeDate;
	private int readCnt;
	private String noticeInfo;
	
	public NoticeDTO() {
		super();
	}

	public NoticeDTO(int noticeNo, int memberNo, String title, Date writeDate, int readCnt, String noticeInfo) {
		super();
		this.noticeNo = noticeNo;
		this.memberNo = memberNo;
		this.title = title;
		this.writeDate = writeDate;
		this.readCnt = readCnt;
		this.noticeInfo = noticeInfo;
	}

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public int getReadCnt() {
		return readCnt;
	}

	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}

	public String getNoticeInfo() {
		return noticeInfo;
	}

	public void setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
	}
	
	
}
