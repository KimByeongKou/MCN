package org.eney.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eney.domain.CreatorApply;
import org.eney.domain.Member;
import org.eney.domain.NoticeList;
import org.eney.service.CreatorApplyService;
import org.eney.service.MemberService;
import org.eney.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

private static final Logger logger = LoggerFactory.getLogger(AdminController.class);	
	
	@Inject
	private MemberService service;
	
	@Inject
	private CreatorApplyService creatorService;
	
	@Inject
	private NoticeService noticeService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminLogin(HttpSession session) throws UnsupportedEncodingException{
		logger.info("admin!");
		
		ModelAndView mav = new ModelAndView();
		
		if(authAdmin(session)<0){
			mav.setViewName("error");
		}else{
				
			session.setAttribute("admin", "adminPwd");
			
			//전체 멤버 정보
			List<Member> memberList = service.searchAllMember();
			mav.addObject("memberList", memberList);
			
			
			//크리에이터 어플라이 정보 (미승인) + 장르, SNS 
			List<CreatorApply> applyList = creatorService.searchAllCreatorApply(false);
			mav.addObject("disApprovalApplyList", applyList);
			
			
			//크리에이터 어플라이 정보 (승인)   + 장르, SNS
			List<CreatorApply> applyList2 = creatorService.searchAllCreatorApply(true);
			mav.addObject("approvalApplyList", applyList2);

			
			//노티스 정보
			//관리자는 페이지와 한페이지에서 보이는 숫자 의미없음. 더미 데이터.
			NoticeList noticeList = noticeService.getNoticeService(15, 1, false);
			
			//전체 노티스 다 가져오기
			noticeList = noticeService.getNoticeService(noticeList.getSumCnt(), 1, false);
			mav.addObject("noticeList", noticeList.getNoticeList());
			mav.addObject("noticeSumCnt", noticeList.getSumCnt());
			
			mav.setViewName("adminIndex");
			
		}
		//모두 맞으면 
		return mav;
	}
	
	//changeMemberToCreator
	@RequestMapping(value = "/changeMemberToCreator.do", method = RequestMethod.POST)
	public ModelAndView changeMemberToCreator(HttpServletRequest request,  HttpServletResponse response, HttpSession session){
		
		ModelAndView mav = new ModelAndView();
		
		Integer applyNo = Integer.parseInt((String)request.getParameter("applyNo").trim());
		Integer memberNo = Integer.parseInt((String)request.getParameter("memberNo").trim());
		logger.info(applyNo.toString());
		logger.info(applyNo + "  " + memberNo);
		
		
		
		creatorService.changeMemberToCreator(memberNo, applyNo);
		///////
		
		mav.addObject("result", "success");
		mav.setViewName("jsonView");
		
		return mav;
	}
	
	
	@RequestMapping(value = "/writeNotice.do", method = RequestMethod.POST)
	public ModelAndView writeNotice(HttpServletRequest request,  HttpServletResponse response, HttpSession session){
		
		ModelAndView mav = new ModelAndView();
		
		String noticeTitle = ((String)request.getParameter("noticeTitle"));
		String noticeInfo = ((String)request.getParameter("noticeInfo"));
		
		
		logger.info(noticeTitle + "  " + noticeInfo);
		noticeService.createNoticeService((Integer)session.getAttribute("memberNo"), noticeTitle, noticeInfo);
		
		
		mav.setViewName("jsonView");
		mav.addObject("result", "success");
		return mav;
	}
	
	
	private Integer authAdmin(HttpSession session){
		//세션과 유저 아이디 등을 어드민과 비교 검증
		//관리자 정보
		String uid = (String)session.getAttribute("userId");
		Integer memberNo = (Integer)session.getAttribute("memberNo");
		String name = (String)session.getAttribute("userName");
		
	
		logger.info(uid + memberNo + name);
		
		
		//인증에 실패하면 에러페이지 
		if(uid == null || memberNo==null || name==null) {
			return -1;
		}else{
			Integer isAdmin = service.isAdmin(uid, name , memberNo);
			if(isAdmin > 0){
				return 1;
			}else
				return -1;
		}
	}
	
	
	
	//게시글 수정
	@RequestMapping(value = "/modifyNotice.do", method = RequestMethod.POST)
	public ModelAndView modifyNotice(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		ModelAndView mav = new ModelAndView();
		
		String noticeNo = ((String)request.getParameter("noticeNo"));
		String modifiedNoticeTitle = ((String)request.getParameter("modifiedTitle"));
		String modifyNoticeInfo = ((String)request.getParameter("modifiedInfo"));
		
		logger.info(noticeNo + "  " + modifiedNoticeTitle + "  " + modifyNoticeInfo);
		
		if(authAdmin(session)<0){
			mav.setViewName("error");
		}else{
			
			noticeService.updateNotice(Integer.parseInt(noticeNo), modifiedNoticeTitle, modifyNoticeInfo);
			mav.setViewName("jsonView");
			mav.addObject("result", "success");
		}
		
		
		return mav;
	}
	
	//게시글 삭제
	@RequestMapping(value = "/deleteNotice.do", method = RequestMethod.POST)
	public ModelAndView deleteNotice(HttpServletRequest request, HttpServletResponse response, HttpSession session){
		ModelAndView mav = new ModelAndView();
		
		String noticeNo = ((String)request.getParameter("noticeNo"));
		if(authAdmin(session)<0){
			mav.setViewName("error");
		}else{
			
			noticeService.deleteNotice(Integer.parseInt(noticeNo));
			mav.setViewName("jsonView");
			mav.addObject("result", "success");
		}
		
		
		return mav;
	}
}
