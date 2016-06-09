package org.eney.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.eney.domain.Notice;
import org.eney.domain.NoticeList;
import org.eney.domain.Result;

public interface NoticeService {

	public NoticeList getNoticeService(int num, int page, boolean isEncoded) throws UnsupportedEncodingException;
	public Notice getNotice(int noticeNo, boolean isEncoded) throws UnsupportedEncodingException;
	public Integer plusNoticeCnt(int noticeNo);
	public Integer updateNotice(Integer noticeNo, String modifiedTitle, String modifiedInfo);
	public Integer deleteNotice(Integer noticeNo);
	
	public List<Notice> retrieveNoticeService(String kind, String value);
	public Result updateNoticeService(String kind, String value);
	public Result createNoticeService(Integer memberNo,String title, String info);
	public Result deleteNoticeService(String kind, String value);
	
	
}
