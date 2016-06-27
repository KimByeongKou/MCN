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
 * CreatorApplyController - SpringFramework의 컨트롤러 클래스
 * 크리에이터 지원과 관련된 Controller 클래스
 * 
 * @author eney-pc3
 *
 */
@Controller
public class CreatorApplyController extends MultiActionController{
	
	private static final Logger logger = LoggerFactory.getLogger(CreatorApplyController.class);		//로깅을 위한 로거 클래스	
	
	@Inject
	private CreatorApplyService service;			// 의존성 주입이 완료된 크리레이터 서비스 클래스
	
	/**
	 * 
	 * 크리에이터 지원 시 호출되는 메서드 
	 * 멀티파트 리퀘스트 사용
	 * 
	 * @param request 	크리에이터 지원을 위한 정보를 받기 위한 멀티파트 리퀘스트 
	 * @param session	유효 세션 확인을 위한 세션 파라미터
	 * @return ModelAndView 형태로 리턴
	 */
	@RequestMapping(value = "/applyCreator.do", headers = "content-type=multipart/*", method = RequestMethod.POST)
	public ModelAndView applyCreator(MultipartHttpServletRequest request, HttpSession session) 
	{
		logger.info("applyCreator");

		//결과 값 객체 
		Result result = new Result();
		ModelAndView mav = new ModelAndView();
		
		//어플라이 내용
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
		
		
		/*
		 *  유효 세션 여부를 확인
		 */
		
		String userId = (String)session.getAttribute("userId");
		Integer memberNo = (Integer) session.getAttribute("memberNo");

		//유효하지 않은 세션
		if(userId == null){
			 /* 
			 * 유효하지 않다면, 만료 메세지 + 로그인 다시 요구
			 */
			result.setIsSuccess(false);
			result.setMsg("Session Invalidate!");
			
			// JSON 형태로 결과 값 리턴
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
			// 처음 지원하는 경우라면
			// 저장하는 파일 이름은 userId_name_phone.jpg
			service.createCreatorApplyService(memberNo, name, email, phone, genre, youtube, africa, facebook, insta, blog, otherSns, applyInfo, userId+"_"+name+"_"+ phone +".jpg", request);
			
			//결과값 설정
			result.setIsSuccess(true);
			result.setMsg("Successful apply!");
			
			//JSON 형태 리턴
			mav.addObject("result", result);
			mav.setViewName("jsonView");
		}
		
		return mav;
	}
	
	/**
	 * 
	 * 메인 페이지의 각 장르 선택 시, 장르에 해당하는 크리에이터 리스트를 리턴한다.
	 * 
	 * @param request	장르를 받기 위한 REQUEST 파라미터
	 * @return ModelAndView 형태로 리턴
	 */
	@RequestMapping(value = "/getCreator.do", method = RequestMethod.GET)
	public ModelAndView getGenreCreator(HttpServletRequest request)
	{
		logger.info("getCreator");

		ModelAndView mav = new ModelAndView();

		// 요청한 장르를 받음
		String genre = request.getParameter("genre");
		
		//해당 장르에 대한 크리에이터 리스트 리턴
		List<Creator> creatorList = service.searchCreatorByGenre(genre);
		
		
		//JSON 형태로 크리에이터 리스트 리턴
		mav.addObject("creatorList", creatorList);
		mav.setViewName("jsonView");
		return mav;
	}

}
