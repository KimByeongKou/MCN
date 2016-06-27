package org.eney.domain;

import java.util.List;

/**
 * 
 * 노티스 정보와 전체 노티스의 수를 멤버로 가지는 VO 클래스.
 * 페이지 리스팅을 위한 클래스.
 * @author KimByeongKou
 *
 */
public class NoticeList {

	private List<Notice> noticeList;		// 노티스 리스트.
	private Integer sumCnt;					// 전체 노티스의 개수.
	
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
