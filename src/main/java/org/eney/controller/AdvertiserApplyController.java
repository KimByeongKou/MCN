package org.eney.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/advertiserApply")
public class AdvertiserApplyController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdvertiserApplyController.class);

	

	/*
	 *  /advertiserApply
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public JSONPObject createAdApply(@ModelAttribute("company") String company, @ModelAttribute("name") String name
			, @ModelAttribute("email") String email, @ModelAttribute("phone") String phoneNum, @ModelAttribute("concept") String concept
			, @ModelAttribute("budget") String budget,  HttpSession session, Model model) {
		
		
		
		logger.info("called createAdApply!");
		logger.info(company + " || " + name + " || " + email + " || " + phoneNum + " || " + concept + " || " + budget);
		
		
		
		
		return new JSONPObject("a", "A");
	}
	
	
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public JSONPObject retrieveAdApply(Locale locale, Model model) {
		
		
		logger.info("called retrieveAdApply!");
				
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return new JSONPObject("a", "A");
	}
	
}
