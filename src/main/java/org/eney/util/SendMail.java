package org.eney.util;

import org.eney.domain.AdvertiserApply;
import org.eney.domain.CreatorApply;

public class SendMail {

	private String adminMail;

	
	public SendMail() {
		super();
	}


	public SendMail(String adminMail) {
		super();
		this.adminMail = adminMail;
	}


	public String getAdminMail() {
		return adminMail;
	}


	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	
	public Integer sendMail(CreatorApply apply){
		
		return 0;
	}
	
	public Integer sendMail(AdvertiserApply apply){
		
		return 0;
	}
	
	
	
}
