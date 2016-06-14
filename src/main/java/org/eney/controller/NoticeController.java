package org.eney.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.URIDereferencer;

import org.eney.domain.Notice;
import org.eney.domain.NoticeList;
import org.eney.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {


	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);	
	
	private static final Integer NOTICE_CNT = 15; 
	
	@Inject
	private NoticeService service;
	
	@RequestMapping(value = "/showNotice.do", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	public @ResponseBody ModelAndView showNotice(@ModelAttribute("pageNo") String pageNo, HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException{
		
		ModelAndView mav = new ModelAndView();
		
		Integer notiPage = Integer.parseInt(pageNo);
		
		NoticeList notiList = service.getNoticeService(NOTICE_CNT, notiPage, true);
		logger.info(notiList.toString());
		
		
		mav.setViewName("jsonView");
		mav.addObject("notiList", notiList.getNoticeList());
		mav.addObject("sumCnt", (notiList.getSumCnt() / NOTICE_CNT)  + 1);
		
		return mav;
	}
	
	
	//게시글 페이지에 대한 것들
	@RequestMapping(value = "/notice", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	public @ResponseBody ModelAndView showNoticePage(@ModelAttribute("noticeNo") String noticeNo, HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException{
		ModelAndView mav = new ModelAndView();
		
		
		Integer notiNo = Integer.parseInt(noticeNo);
			
		//노티스 조회수 하나 증가시키고
		service.plusNoticeCnt(notiNo);
		
		//노티스 내용 가져오기
		Notice noti = service.getNotice(notiNo,true);
				
		
		logger.info(noti.toString());
		
		mav.setViewName("jsonView");
		mav.addObject("notice", noti);
		
		return mav;
	}
	
		
	//게시글 페이지에 대한 것들
	@RequestMapping(value = "/testEncoding.do" ,method = RequestMethod.GET )
	public @ResponseBody ModelAndView testEncoding() throws UnsupportedEncodingException{
		

		String encodedStr = URLEncoder.encode("안녕 반가워 한글을 보고싶다 ㅠㅠㅠ","UTF-8");
		
		ModelAndView mav = new ModelAndView();
		logger.info("TEST ENCODING");
		
		mav.setViewName("jsonView");
		mav.addObject("result", encodedStr);
		
		return mav;
	}
	
}
