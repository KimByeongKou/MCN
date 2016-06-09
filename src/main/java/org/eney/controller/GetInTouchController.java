package org.eney.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eney.service.GetInTouchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GetInTouchController {

private static final Logger logger = LoggerFactory.getLogger(GetInTouchController.class);	
	
	@Inject
	private GetInTouchService service;
	
	@RequestMapping(value = "/getInTouch.do", method = RequestMethod.POST)
	public ModelAndView getInTouch(HttpServletRequest request, HttpServletResponse response, HttpSession session) 
	{
		ModelAndView mav = new ModelAndView();
		
		String name = request.getParameter("name");
		String email =  request.getParameter("email");
		String phone =  request.getParameter("phone");
		String message =  request.getParameter("message");
		
		
		
		int res = service.createGetInTouch(name, email, phone, message);
		if(res>0){
			mav.addObject("result", "요청성공");
			mav.setViewName("jsonView");
		}
		
		return mav;
	}
}
