package org.eney.domain;

public class Advertiser extends Member{

	private String companyName;

	
	public Advertiser() {
		super();
		companyName = new String();
	}


	public Advertiser(Integer memberNo, String name, String email, String phoneNum, String companyName) {
		this.companyName = companyName;
	}


	public Advertiser(String companyName) {
		super();
		this.companyName = companyName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	
	
}
