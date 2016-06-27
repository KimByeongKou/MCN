package org.eney.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.eney.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * LoginController - SpringFramework의 컨트롤러 클래스
 * 로그인과 관련된 Controller 클래스
 * 
 * 
 * @author eney-pc3
 *
 */
@Controller
public class LoginController {

	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);	
	
	@Inject
	private MemberService service;	// 의존성 주입이 완료된 서비스 클래스
	
	/**
	 * 
	 * 로그인 시 처음 호출되는 로그인 처리 메서드
	 * 
	 * @param userId		유저 id
	 * @param accessToken	로그인 시 facebook accessToken
	 * @param userName		유저 이름
	 * @param session		세션 유지를 위한 세션 파라미터
	 * @return	ModelAndView 리턴. 로그인 결과 메세지를 JSON View 를 사용하여 전달한다.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView facebookLogin(@RequestParam(value="userId",required=true) String userId,
								@RequestParam(value="accessToken",required=true) String accessToken,
								@RequestParam(value="userName",required=true) String userName,
								HttpSession session){
		
		ModelAndView mav = new ModelAndView();
		Integer memberNo = 0;
		
		
		/*
		 * 회원인지 아닌지 검사
		 */
		Integer isMember = service.isMember(userId);
		logger.info("멤버 " + isMember);
		
		
		
		/*
		 * 
		 * 회원이 아니라면 멤버등록 후
		 * 등록에 성공한다면 정보를 세션에 올림.
		 */
		if(isMember == -1){
			service.registerMember(userId, accessToken, userName);
			//새로운 회원의 클래스를 member로 지정하는 것은 트리거로 해결된다.
		}
		else if(isMember == 100){	//관리자 멤버 넘버 필요
			
			
			//관리자일 경우
			//관리자 정보 세션.
			memberNo = service.getMemberNo(userId);
			session.setAttribute("memberNo", memberNo);
			session.setAttribute("userId", userId);
			session.setAttribute("userName", userName);
			
			mav.addObject("result", "admin");
			mav.setViewName("jsonView");
			return mav;
			
			
		}
		
		//일반 멤버일 경우
		
		memberNo = service.getMemberNo(userId);
		session.setAttribute("memberNo", memberNo);
		logger.info("멤버 넘버 : " + memberNo);
		
		
		
		/*
		 * 현재 로그인한 페북 정보 세션에 올림
		 */
		String uid = (String)session.getAttribute("userId");
		String token = (String)session.getAttribute("accessToken");
		String name = (String)session.getAttribute("userName");
		
		if(uid == null || token==null || name==null) 
		{
			logger.info("로그인 안되서 세션 세팅.");
			session.setAttribute("userId", userId);
			session.setAttribute("accessToken", accessToken);	
			session.setAttribute("userName", userName);
		}else{
			logger.info(uid + "  " + token + "  " + name);
		}
		
		
		mav.addObject("result", "member");
		mav.setViewName("jsonView");
		return mav;
	}
	
	
	/**
	 * 
	 * 로그아웃 시 호출되는 메서드
	 * 
	 * @param userId				로그아웃 하려는 페이스북 id
	 * @param accessToken			로그아웃 하려는 로그인 accessToken
	 * @param userName				로그아웃 하려는 유저 네임
	 * @param session				세션에서 로그아웃 한 사용자의 정보 삭제를 위한 파라미터
	 * @return	ModelAndView 리턴 		세션에서 멤버와 관련된 모든 정보를 삭제하고 메인 페이지 (index.jsp 로 포워딩한다)
	 */
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String facebookLogout(@RequestParam(value="userId",required=true) String userId,
			@RequestParam(value="accessToken",required=true) String accessToken,
			@RequestParam(value="userName",required=true) String userName,
			HttpSession session){
	
		//세션 해제
		session.removeAttribute("accessToken");
		session.removeAttribute("userName");
		session.removeAttribute("userId");
		session.removeAttribute("memberNo");
		
		
		//관리자용
		session.removeAttribute("admin");
		
		return "index";
	}
	
	
	
	
	
	
}
