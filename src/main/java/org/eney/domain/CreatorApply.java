package org.eney.domain;

import java.util.Date;

public class CreatorApply extends Apply{

	private String youtubeAfrica;
	private String facebook;
	private String otherSns;
	
	
	public CreatorApply() {
		super();
		youtubeAfrica = new String();
		facebook = new String();
		otherSns = new String();
	}
	public CreatorApply(Integer applyNo, Integer memberNo, String name, String email, String phoneNum, String applyInfo,
			Date applyTime, Boolean isAccepted, String youtubeAfrica, String facebook, String otherSns) {
		super(applyNo, memberNo, name, email, phoneNum, applyInfo, applyTime, isAccepted);
		this.youtubeAfrica = youtubeAfrica;
		this.facebook = facebook;
		this.otherSns = otherSns;
	}
	public String getYoutubeAfrica() {
		return youtubeAfrica;
	}
	public void setYoutubeAfrica(String youtubeAfrica) {
		this.youtubeAfrica = youtubeAfrica;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getOtherSns() {
		return otherSns;
	}
	public void setOtherSns(String otherSns) {
		this.otherSns = otherSns;
	}
	
}
