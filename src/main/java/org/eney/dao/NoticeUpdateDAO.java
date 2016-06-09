package org.eney.dao;

public interface NoticeUpdateDAO {

	public Integer updateTitle(Integer noticeNo, String title);
	public Integer updateInfo(Integer noticeNo, String info);
	public Integer updateNoticeCnt(Integer noticeNo);
}
