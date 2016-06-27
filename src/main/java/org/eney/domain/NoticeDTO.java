package org.eney.domain;

import java.util.Date;

/**
 * 노티스 테이블과 데이터 교환을 위한 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class NoticeDTO {

	private int noticeNo;				//노티스 id
	private int memberNo;				// 글쓴이 id
	private String title;				// 노티스 타이
	private Date writeDate;				// 노티스 쓴 날짜.
	private int readCnt;				// 노티스 조회수.
	private String noticeInfo;			// 노티스 내용.
	
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
