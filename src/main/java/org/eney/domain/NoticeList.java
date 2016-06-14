package org.eney.domain;

import java.util.List;

public class NoticeList {

	private List<Notice> noticeList;
	private Integer sumCnt;
	
	public NoticeList() {
		super();
		
	}
	public NoticeList(List<Notice> noticeList, Integer sumCnt) {
		super();
		this.noticeList = noticeList;
		this.sumCnt = sumCnt;
	}
	public List<Notice> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	public Integer getSumCnt() {
		return sumCnt;
	}
	public void setSumCnt(Integer sumCnt) {
		this.sumCnt = sumCnt;
	}
}
