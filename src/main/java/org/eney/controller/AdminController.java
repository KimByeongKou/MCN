package org.eney.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.eney.domain.CreatorApply;
import org.eney.domain.Member;
import org.eney.domain.NoticeList;
import org.eney.domain.Result;
import org.eney.service.CreatorApplyService;
import org.eney.service.MemberService;
import org.eney.service.NoticeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * AdminController - SpringFramework의 컨트롤러 클래스
 * 관리자 기능과 관련된 Controller 클래스
 * 
 * @author eney-pc3
 *
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class); 	//로깅을 위한 로거 클래스	
	
	@Inject
	private MemberService service;					// 의존성 주입이 완료된 멤버 서비스 클래스
	
	@Inject
	private CreatorApplyService creatorService;		// 의존성 주입이 완료된 크리에이터 서비스 클래스
	
	@Inject
	private NoticeService noticeService;			// 의존성 주입이 완료된 노티스 서비스 클래스
	
	/**
	 * 
	 * Admin 로그인 시 LoginController에서 리다이렉트
	 * 
	 * @param session	admin 인증 후, 세션에 속성 셋팅을 위한 파라미터
	 * @return ModelAndView admin 초기 페이지를 view 로 설정 / 인증 실패 시 error.jsp 포워딩
	 * @throws UnsupportedEncodingException	인코딩 실패 시 익셉션 발생
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminLogin(HttpSession session) throws UnsupportedEncodingException{
		logger.info("adminPage");
		
		ModelAndView mav = new ModelAndView();
		
		//admin 인증
		if(authAdmin(session)<0){
			mav.setViewName("error");
		}else{
			//admin 인증에 성공한다면
			
			//세션에 admin 속성을 셋팅
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
	
	/**
	 * 일반 member를 승인된 creator로 바꿈
	 * 이 때, 메인 장르 검색화면에 나타나게 됨
	 * 
	 * @param request	요청 인자를 얻기 위한 리퀘스트 파라미터
	 * @return ModelAndView 형태로 리턴 / 
	 */
	@RequestMapping(value = "/changeMemberToCreator.do", method = RequestMethod.POST)
	public ModelAndView changeMemberToCreator(HttpServletRequest request){
		logger.info("changeMemberToCreator");
		ModelAndView mav = new ModelAndView();
		Result result;
		
		//어플라이 넘버
		Integer applyNo = Integer.parseInt((String)request.getParameter("applyNo").trim());
		
		//멤버 넘버
		Integer memberNo = Integer.parseInt((String)request.getParameter("memberNo").trim());
		
		
		//해당 멤버 넘버와 어플라이 넘버에 일치하는 CreatorApply 지원서를 승인함
		result = creatorService.changeMemberToCreator(memberNo, applyNo);

		
		
		//jsonView 를 사용하여 JSON 형태의 객체로 리턴
		mav.addObject("result", result.getMsg());
		mav.setViewName("jsonView");
		
		return mav;
	}
	
	
	/**
	 * 글쓰기 메서드. 
	 * 
	 * @param request	요청 인자를 얻기 위한 리퀘스트 파라미터
	 * @param session	세션에 올라간 멤버 넘버 확인을 위한 세션 파라미터	
	 * @return ModelAndView 형태로 리턴
	 */
	@RequestMapping(value = "/writeNotice.do", method = RequestMethod.POST)
	public ModelAndView writeNotice(HttpServletRequest request, HttpSession session){
		logger.info("writeNotice");
		ModelAndView mav = new ModelAndView();
		
		//새로운 게시글을 위한 제목
		String noticeTitle = ((String)request.getParameter("noticeTitle"));
		
		//새로운 게시글을 위한 내용
		String noticeInfo = ((String)request.getParameter("noticeInfo"));
		
		
		//세션에서 멤버 넘버를 가져와, 게시글을 작성함 
		noticeService.createNoticeService((Integer)session.getAttribute("memberNo"), noticeTitle, noticeInfo);
		
		//jsonView 를 사용하여 JSON 형태의 객체로 리턴
		mav.setViewName("jsonView");
		mav.addObject("result", "success");
		return mav;
	}
	
	
	/**
	 * 관리자 인증을 위한 메서드.
	 * 관리자의 회원 넘버, 이름, 클래스 등을 확인한다.
	 * 
	 * @param session	ADMIN 인증을 위한 세션 파라미터
	 * @return admin 인증에 성공 시 1, 실패 시 -1 리턴
	 */
	private Integer authAdmin(HttpSession session){
		
		//세션과 유저 아이디 등을 어드민과 비교 검증
		String uid = (String)session.getAttribute("userId");
		Integer memberNo = (Integer)session.getAttribute("memberNo");
		String name = (String)session.getAttribute("userName");
		
	
		
		
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
	
	
	
	/**
	 * 
	 * 게시글 수정 메서드.
	 * 
	 * @param request	수정 내용 인자를 받기 위한 REQUEST
	 * @param session	ADMIN 인증을 위한 세션
	 * @return ModelAndView 형태로 리턴
	 */
	//게시글 수정
	@RequestMapping(value = "/modifyNotice.do", method = RequestMethod.POST)
	public ModelAndView modifyNotice(HttpServletRequest request, HttpSession session){
		logger.info("modifyNotice");

		ModelAndView mav = new ModelAndView();
		
		//노티스 넘버
		String noticeNo = ((String)request.getParameter("noticeNo"));
		
		//수정하려는 게시글 제목
		String modifiedNoticeTitle = ((String)request.getParameter("modifiedTitle"));
		
		//수정하려는 게시글 내용
		String modifyNoticeInfo = ((String)request.getParameter("modifiedInfo"));
		
		
		//관리자 인증
		if(authAdmin(session)<0){
			//실패 시 에러페이지
			mav.setViewName("error");
		}else{
			//성공 시 게시글 내용 바꾸고, 결과 값 JSON 형태로 리턴
			noticeService.updateNotice(Integer.parseInt(noticeNo), modifiedNoticeTitle, modifyNoticeInfo);
			mav.setViewName("jsonView");
			mav.addObject("result", "success");
		}
		
		
		return mav;
	}
	
	/**
	 * 
	 * 게시글 삭제 메서드.
	 * 
	 * @param request	삭제를 위한 게시글 넘버를 받음
	 * @param session	ADMIN 인증을 위한 세션 파라미터
	 * @return ModelAndView 형태로 리턴
	 */
	@RequestMapping(value = "/deleteNotice.do", method = RequestMethod.POST)
	public ModelAndView deleteNotice(HttpServletRequest request, HttpSession session){
		logger.info("deleteNotice");

		ModelAndView mav = new ModelAndView();
		
		//삭제하려는 게시글 노티스 넘버
		String noticeNo = ((String)request.getParameter("noticeNo"));
		
		//어드민 인증
		if(authAdmin(session)<0){
			//실패하면 에러페이지
			mav.setViewName("error");
		}else{
			//성공하면 게시글 삭제 후 결과 값 JSON 형태로 리턴
			noticeService.deleteNotice(Integer.parseInt(noticeNo));
			mav.setViewName("jsonView");
			mav.addObject("result", "success");
		}
		
		
		return mav;
	}
}
