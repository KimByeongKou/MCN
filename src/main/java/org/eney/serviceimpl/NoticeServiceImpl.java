package org.eney.serviceimpl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eney.dao.NoticeDAO;
import org.eney.domain.Notice;
import org.eney.domain.NoticeDTO;
import org.eney.domain.NoticeList;
import org.eney.domain.Result;
import org.eney.service.NoticeService;
import org.springframework.stereotype.Service;


@Service
public class NoticeServiceImpl implements NoticeService{

	
	
	@Inject 
	private NoticeDAO dao;
	
	@Override
	public NoticeList getNoticeService(int num, int page, boolean isEncoded) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		
		NoticeList noticeList = new NoticeList();
		
		List<NoticeDTO> dtoList = dao.searchNoticeAll();
		List<Notice> notiList = new ArrayList<Notice>();
		
		
		Integer start=0, end = 0;
		Integer notiNum = dtoList.size();
		
		
		
		
		//기존 개수보다 같거나 더 많은 개수의 게시글을 요구하면
		if(notiNum <= num){
			start = 0;
			end = notiNum;
		}
		else if(notiNum > num){
			//요구하는 게시 글이 기존의 것보다 적다면
			start = (page-1)*(num);
			end = (page*num) -1;
		}
		
		
		
		for(int i=0; i<notiNum; i++){
		
			if(i < start) continue;
			NoticeDTO dto = dtoList.get(i);
			
			Notice no = new Notice();
			
			if(isEncoded){
				no.setTitle(URLEncoder.encode(dto.getTitle(), "UTF-8"));
				no.setNoticeInfo(URLEncoder.encode(dto.getNoticeInfo(), "UTF-8"));
			}else{
				no.setTitle(dto.getTitle());
				no.setNoticeInfo(dto.getNoticeInfo());
			}
			no.setNoticeNo(dto.getNoticeNo());
			no.setReadCnt(dto.getReadCnt());
			
			no.setWriteDate(dto.getWriteDate());
			no.setWriterId(dto.getMemberNo());
			
			System.out.println(no.toString());
			notiList.add(no);
			
		
			if(i == end) break;
		}
		
		
		
		noticeList.setNoticeList(notiList);
		noticeList.setSumCnt(notiNum);
		
		return noticeList;
	}


	@Override
	public Result createNoticeService(Integer memberNo, String title, String info) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setNewId(dao.createNotice(memberNo+"", title, info));
		
		return result; 
	}


	@Override
	public Notice getNotice(int noticeNo, boolean isEncoded)  {
		// TODO Auto-generated method stub
		
		NoticeDTO dto = dao.searchNoticeByNoticeNo(noticeNo);
		Notice notice = new Notice();
		
		notice.setNoticeNo(dto.getNoticeNo());
		notice.setReadCnt(dto.getReadCnt());
		if(isEncoded){
			try {
				notice.setTitle(URLEncoder.encode(dto.getTitle(), "UTF-8"));
				notice.setNoticeInfo(URLEncoder.encode(dto.getNoticeInfo(), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			notice.setTitle(dto.getTitle());
			notice.setNoticeInfo(dto.getNoticeInfo());
		}
		notice.setWriteDate(dto.getWriteDate());
		notice.setWriterId(dto.getMemberNo());
		return notice;
	}

	@Override
	public Integer plusNoticeCnt(int noticeNo) {
		// TODO Auto-generated method stub
		
		return dao.updateNoticeCnt(noticeNo);
	}

	@Override
	public Integer updateNotice(Integer noticeNo, String modifiedTitle, String modifiedInfo) {
		// TODO Auto-generated method stub

		int res;
		
		res = dao.updateInfo(noticeNo, modifiedInfo);
		if(res <= 0) return -1;
		
		res = dao.updateTitle(noticeNo, modifiedTitle);
		if(res <= 0) return -1;
		
		return res;
	}

	@Override
	public Integer deleteNotice(Integer noticeNo) {
		// TODO Auto-generated method stub
		
		return dao.deleteNotice(noticeNo);
	}

}
