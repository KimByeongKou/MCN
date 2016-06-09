package org.eney.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eney.domain.Creator;
import org.eney.domain.Result;
import org.eney.service.CreatorApplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CreatorApplyController extends MultiActionController{
	
	private static final Logger logger = LoggerFactory.getLogger(CreatorApplyController.class);	
	
	@Inject
	private CreatorApplyService service;
	
	@RequestMapping(value = "/applyCreator.do", headers = "content-type=multipart/*", method = RequestMethod.POST)
	public ModelAndView applyCreator(MultipartHttpServletRequest request, HttpServletResponse response, HttpSession session) 
	{
		Result result = new Result();
		ModelAndView mav = new ModelAndView();
		
		String name = request.getParameter("creatorName");
		String email = request.getParameter("creatorEmail");
		String phone = request.getParameter("creatorPhone");
		String[] genre = request.getParameterValues("creatorGenre");
		String youtube = request.getParameter("creatorYoutube");
		String africa = request.getParameter("creatorAfrica");
		String facebook = request.getParameter("creatorFacebook");
		String insta = request.getParameter("creatorInstagram");
		String blog = request.getParameter("creatorBlog");
		String otherSns = request.getParameter("creatorOtherSns");
		String applyInfo = request.getParameter("creatorApplyInfo");
		//logger.info("정보 : " + name + email + phone + genre[0] + youtube + africa);
		
		 /* 
		 * 일단 세션 확인해서 유효한지 확인
		 */
		//세션이 유효하지 않음
		String userId = (String)session.getAttribute("userId");
		Integer memberNo = (Integer) session.getAttribute("memberNo");
		logger.info("멤버 넘버 : " + memberNo);
		if(userId == null){
			 /* 
			 * 유효하지 않다면, 만료 메세지 + 로그인 다시 요구
			 */
			result.setIsSuccess(false);
			result.setMsg("Session Invalidate!");
			//
			mav.addObject("result", result);
			mav.setViewName("jsonView");
			return mav;
		}else{
			//유효하다면 계속 진행
		}
		
		
		/**
		 * 
		 * 유효하다면 이전에 지원 한 기록이 있는지 검사
		 * 
		 **/
		Integer userIdExist = service.isApplid(memberNo);
		
		
		if(userIdExist>0){
			//이미 지원한 이력이 있다면 
			//MyPage 에서 지원서 삭제 후 다시 지원 해줘 라는 메세지~
			result.setIsSuccess(false);
			result.setMsg("Already Apply Exist!");
			mav.addObject("result", result);
			mav.setViewName("jsonView");
		}else{
			// 처음 지원하는 경우라면, ////지원서 디비 올리고 + 장르 처리하고 + sns 처리하고 + 관리자에게 메일 보내주기
			//저장하는 파일 이름은
			//userId_name_phone.jpg
			service.createCreatorApplyService(memberNo, name, email, phone, genre, youtube, africa, facebook, insta, blog, otherSns, applyInfo, userId+"_"+name+"_"+ phone +".jpg", request);
			result.setIsSuccess(true);
			result.setMsg("Successful apply!");
			mav.addObject("result", result);
			mav.setViewName("jsonView");
		}
		
		
		return mav;
	}
	
	
	@RequestMapping(value = "/getCreator.do", method = RequestMethod.GET)
	public ModelAndView getGenreCreator(HttpServletRequest request, HttpServletResponse response, HttpSession session) 
	{
		logger.info("getCreator.do");
		ModelAndView mav = new ModelAndView();

		String genre = request.getParameter("genre");
		
		List<Creator> creatorList = service.searchCreatorByGenre(genre);
		
		mav.addObject("creatorList", creatorList);
		mav.setViewName("jsonView");
		return mav;
	}

}
