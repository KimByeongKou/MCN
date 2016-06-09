package org.eney.domain;

import java.util.Calendar;
import java.util.Date;

public class Notice {

	private Integer writerId;
	private Integer noticeNo;
	private String title;
	private String writeDate;
	private Integer readCnt;
	private String noticeInfo;
	
	
	public Notice() {
		super();
		writerId = new Integer(0);
		noticeNo = new Integer(0);
		title = new String();
		writeDate = new String();
		readCnt = new Integer(0);
		noticeInfo = new String();
	}
	
	
	public Notice(Integer writerId, Integer noticeNo, String title, String writeDate, Integer readCnt,
			String noticeInfo) {
		super();
		this.writerId = writerId;
		this.noticeNo = noticeNo;
		this.title = title;
		this.writeDate = writeDate;
		this.readCnt = readCnt;
		this.noticeInfo = noticeInfo;
	}
	public Integer getWriterId() {
		return writerId;
	}
	public void setWriterId(Integer writerId) {
		this.writerId = writerId;
	}
	public Integer getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(Integer noticeNo) {
		this.noticeNo = noticeNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(writeDate);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		this.writeDate = "" + year + "-" + month + "-" + day;
	}
	public Integer getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(Integer readCnt) {
		this.readCnt = readCnt;
	}
	public String getNoticeInfo() {
		return noticeInfo;
	}
	public void setNoticeInfo(String noticeInfo) {
		this.noticeInfo = noticeInfo;
	}


	@Override
	public String toString() {
		return "Notice [writerId=" + writerId + ", noticeNo=" + noticeNo + ", title=" + title + ", writeDate="
				+ writeDate + ", readCnt=" + readCnt + ", noticeInfo=" + noticeInfo + "]";
	}
	
	
}
