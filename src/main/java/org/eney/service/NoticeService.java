package org.eney.service;

import java.util.List;

import org.eney.domain.Notice;
import org.eney.domain.Result;

public interface NoticeService {

	public List<Notice> getNoticeService(int num, int page);
	public List<Notice> retrieveNoticeService(String kind, String value);
	public Result updateNoticeService(String kind, String value);
	public Result createNoticeService(String title, String info);
	public Result deleteNoticeService(String kind, String value);
}
