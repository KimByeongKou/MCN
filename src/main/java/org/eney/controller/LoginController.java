package org.eney.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.eney.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);	
	
	@Inject
	private MemberService service;
	
	/*
	 * 
	 * 이미 있는 회원인지 검사해서
	 * 
	 * 회원이 아니면 등록하고 세션 올리고 
	 * 
	 * 회원이라면 그냥 바로 세션에 올린다.
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
		else if(isMember == 38){	//현재 44가 관리자;;
			
			
			//관리자일 경우
			//관리자 정보 세션.
			memberNo = service.getMemberNo(userId);
			session.setAttribute("memberNo", memberNo);
			session.setAttribute("userId", userId);
			session.setAttribute("userName", userName);
			
			mav.addObject("result", "admin");
			mav.setViewName("jsonView");
			return mav;
			
			
		}else{
			//일반 회원일 경우
		}
		
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
			logger.info("로그인 안되서 세션 세팅함.");
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
	
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String facebookLogout(@RequestParam(value="userId",required=true) String userId,
			@RequestParam(value="accessToken",required=true) String accessToken,
			@RequestParam(value="userName",required=true) String userName,
			HttpSession session,
			Model model){
	
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
