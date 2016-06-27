package org.eney.controller;

import java.io.UnsupportedEncodingException;

import javax.inject.Inject;

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


/**
 * 
 * NoticeController - SpringFramework의 컨트롤러 클래스
 * 게시판과 관련된 Controller 클래스
 * 
 * 
 * @author eney-pc3
 *
 */
@Controller
public class NoticeController {

	
	//로깅 처리를 위한 로거 클래스
	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);	
	
	//한 페이지 당 게시판 글 개수
	private static final Integer NOTICE_CNT = 15; 
	
	@Inject
	private NoticeService service;			//의존성 주입이 완료된 서비스 클래스
	
	/**
	 * 
	 * 초기 화면 로딩 시, 게시판의 첫 페이지를 리턴한다.
	 * 인코딩 하여 리턴하므로, Front-end 에서 utf-8 디코딩이 필요하다.
	 * 
	 * @param pageNo							원하는 게시판의 페이지 넘버
	 * @return	ModelAndView 리턴. 				요청에 대한 게시판 클래스의 정보가 리턴된다.
	 * @throws UnsupportedEncodingException		인코딩 실패 시 throws exception
	 */
	@RequestMapping(value = "/showNotice.do", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	public @ResponseBody ModelAndView showNotice(@ModelAttribute("pageNo") String pageNo) throws UnsupportedEncodingException{
		
		ModelAndView mav = new ModelAndView();
		
		//요청된 pageNo
		Integer notiPage = Integer.parseInt(pageNo);
		
		//해당 페이지 No 에 대해 한 페이지 당 NOTICE_CNT 만큼의 게시판 클래스 정보를 받음. 시간 순 정렬
		//예를 들면, 100개의 글에서 3페이지에서 10개의 글을 가져오고 싶다면 71~80 번 게시글의 정보가 리턴된다.
		NoticeList notiList = service.getNoticeService(NOTICE_CNT, notiPage, true);
		logger.info(notiList.toString());
		
		
		//json View 를 사용한 json 형태 객체 리턴
		mav.setViewName("jsonView");
		mav.addObject("notiList", notiList.getNoticeList());				//실제 게시글의 내용
		mav.addObject("sumCnt", (notiList.getSumCnt() / NOTICE_CNT)  + 1);	//전체 게시판 글 내용의 개수
		
		return mav;
	}
	
	
	/**
	 * 
	 * 특정 게시판의 게시글 내용을 리턴한다.
	 * 인코딩 하여 리턴하므로, Front-end 에서 utf-8 디코딩이 필요하다.
	 * 
	 * @param noticeNo				특정 게시글의 ID
	 * @return	ModelAndView 리턴.	특정 게시글의 내용을 리턴한다.
	 * @throws UnsupportedEncodingException		인코딩 시 예외 발생하면 throw exception
	 */
	@RequestMapping(value = "/notice", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	public @ResponseBody ModelAndView showNoticePage(@ModelAttribute("noticeNo") String noticeNo) throws UnsupportedEncodingException{
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
	
		
	
}
