package org.eney.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.eney.service.GetInTouchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * GetInTouchController - SpringFramework의 컨트롤러 클래스
 * GetInTouch 기능과 관련된 Controller 클래스
 * 
 * @author eney-pc3
 *
 */
@Controller
public class GetInTouchController {

	private static final Logger logger = LoggerFactory.getLogger(GetInTouchController.class); 	//로깅을 위한 로거 클래스	
	
	@Inject
	private GetInTouchService service;		//의존성 주입이 완료된 GetInTouch 서비스 클래스
	
	/**
	 * 
	 * GetInTouch 요청 시 호출되는 메서드
	 * 
	 * @param request	GetInTouch 내용을 받기 위한 REQUEST 파라미터
	 * @return ModelAndView 형태로 리턴
	 */
	@RequestMapping(value = "/getInTouch.do", method = RequestMethod.POST)
	public ModelAndView getInTouch(HttpServletRequest request) 
	{
		logger.info("getInTouch");

		ModelAndView mav = new ModelAndView();
		
		//GetInTouch 내용 받기
		String name = request.getParameter("name");
		String email =  request.getParameter("email");
		String phone =  request.getParameter("phone");
		String message =  request.getParameter("message");
		
		
		
		//GetInTouch 등록
		int res = service.createGetInTouch(name, email, phone, message);
		if(res>0){
			//등록에 대한 결과 값 JSON 형태 리턴
			mav.addObject("result", "요청성공");
			mav.setViewName("jsonView");
		}
		
		return mav;
	}
}
