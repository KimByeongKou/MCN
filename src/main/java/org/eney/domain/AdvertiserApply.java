package org.eney.domain;

import java.util.Date;

public class AdvertiserApply extends Apply{

	private String companyName;
	private String concept;
	private Integer budget;
	
	
	
	public AdvertiserApply() {
		super();
		companyName = new String();
		concept = new String();
		budget = new Integer(0);
		
	}

	public AdvertiserApply(Integer applyNo, Integer memberNo, String name, String email, String phoneNum,
			String applyInfo, Date applyTime, Boolean isAccepted) {
		super(applyNo, memberNo, name, email, phoneNum, applyInfo, applyTime, isAccepted);
	}

	public AdvertiserApply(String companyName, String concept, Integer budget) {
		super();
		this.companyName = companyName;
		this.concept = concept;
		this.budget = budget;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
	
}
