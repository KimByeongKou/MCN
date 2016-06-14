
package org.eney.dao;

import java.util.Date;
import java.util.List;

import org.eney.domain.NoticeDTO;

public interface NoticeRertrieveDAO {

	public List<NoticeDTO> searchNoticeAll();
	public NoticeDTO searchNoticeByNoticeNo(Integer noticeNo);
	public List<NoticeDTO> searchNoticeByNoticeTitle(String title);
	public List<NoticeDTO> searchNoticeByWriterNo(Integer writerNo);
	public List<NoticeDTO> searchNoticeByNoticeInfo(String noticeInfo);
	public List<NoticeDTO> searchNoticeByRegDate(Date start, Date end);
	
}
