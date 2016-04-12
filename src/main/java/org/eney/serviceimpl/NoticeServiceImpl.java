package org.eney.serviceimpl;

import java.util.List;

import org.eney.domain.Notice;
import org.eney.domain.Result;
import org.eney.service.NoticeService;
import org.springframework.stereotype.Service;


@Service
public class NoticeServiceImpl implements NoticeService{

	@Override
	public List<Notice> getNoticeService(int num, int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notice> retrieveNoticeService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateNoticeService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result createNoticeService(String title, String info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteNoticeService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
