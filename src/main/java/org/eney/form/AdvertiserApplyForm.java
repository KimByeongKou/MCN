package org.eney.form;

import org.slf4j.Logger;

public class AdvertiserApplyForm {

	private String adCompany;
	private String adName;
	private String adEmail;
	private String adPhoneNum;
	private String adConcept;
	private String adBudget;
	private String adApplyInfo;
	
	
	public AdvertiserApplyForm() {
		super();
		adCompany = new String();
		adName = new String();
		adEmail = new String();
		adPhoneNum = new String();
		adConcept = new String();
		adBudget = new String();
		adApplyInfo = new String();
	}


	public AdvertiserApplyForm(String adCompany, String adName, String adEmail, String adPhoneNum, String adConcept,
			String adBudget, String adApplyInfo) {
		super();
		this.adCompany = adCompany;
		this.adName = adName;
		this.adEmail = adEmail;
		this.adPhoneNum = adPhoneNum;
		this.adConcept = adConcept;
		this.adBudget = adBudget;
		this.adApplyInfo = adApplyInfo;
	}


	public String getAdCompany() {
		return adCompany;
	}


	public void setAdCompany(String adCompany) {
		this.adCompany = adCompany;
	}


	public String getAdName() {
		return adName;
	}


	public void setAdName(String adName) {
		this.adName = adName;
	}


	public String getAdEmail() {
		return adEmail;
	}


	public void setAdEmail(String adEmail) {
		this.adEmail = adEmail;
	}


	public String getAdPhoneNum() {
		return adPhoneNum;
	}


	public void setAdPhoneNum(String adPhoneNum) {
		this.adPhoneNum = adPhoneNum;
	}


	public String getAdConcept() {
		return adConcept;
	}


	public void setAdConcept(String adConcept) {
		this.adConcept = adConcept;
	}


	public String getAdBudget() {
		return adBudget;
	}


	public void setAdBudget(String adBudget) {
		this.adBudget = adBudget;
	}


	public String getAdApplyInfo() {
		return adApplyInfo;
	}


	public void setAdApplyInfo(String adApplyInfo) {
		this.adApplyInfo = adApplyInfo;
	}
	
	

	public boolean validate(Logger logger){
	
		return false;
	}		

}