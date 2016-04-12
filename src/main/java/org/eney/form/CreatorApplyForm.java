package org.eney.form;

import org.slf4j.Logger;

public class CreatorApplyForm {

	
	private String crName;
	private String crEmail;
	private String crPhone;
	private String crYoutubeAfrica;
	private String crFacebook;
	private String crOtherSns;
	private String crApplyInfo;
	
	public CreatorApplyForm() {
		super();
		crName = new String();
		crEmail = new String();
		crPhone = new String();
		crYoutubeAfrica = new String();
		crFacebook = new String();
		crOtherSns = new String();
		crApplyInfo = new String();
	}

	public CreatorApplyForm(String crName, String crEmail, String crPhone, String crYoutubeAfrica, String crFacebook,
			String crOtherSns, String crApplyInfo) {
		super();
		this.crName = crName;
		this.crEmail = crEmail;
		this.crPhone = crPhone;
		this.crYoutubeAfrica = crYoutubeAfrica;
		this.crFacebook = crFacebook;
		this.crOtherSns = crOtherSns;
		this.crApplyInfo = crApplyInfo;
	}

	public String getCrName() {
		return crName;
	}

	public void setCrName(String crName) {
		this.crName = crName;
	}

	public String getCrEmail() {
		return crEmail;
	}

	public void setCrEmail(String crEmail) {
		this.crEmail = crEmail;
	}

	public String getCrPhone() {
		return crPhone;
	}

	public void setCrPhone(String crPhone) {
		this.crPhone = crPhone;
	}

	public String getCrYoutubeAfrica() {
		return crYoutubeAfrica;
	}

	public void setCrYoutubeAfrica(String crYoutubeAfrica) {
		this.crYoutubeAfrica = crYoutubeAfrica;
	}

	public String getCrFacebook() {
		return crFacebook;
	}

	public void setCrFacebook(String crFacebook) {
		this.crFacebook = crFacebook;
	}

	public String getCrOtherSns() {
		return crOtherSns;
	}

	public void setCrOtherSns(String crOtherSns) {
		this.crOtherSns = crOtherSns;
	}

	public String getCrApplyInfo() {
		return crApplyInfo;
	}

	public void setCrApplyInfo(String crApplyInfo) {
		this.crApplyInfo = crApplyInfo;
	}
	
	
	
	
	public boolean validate(Logger logger){
		
		
		
		return true;
	}
	
}
