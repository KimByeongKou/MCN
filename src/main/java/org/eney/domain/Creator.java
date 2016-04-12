package org.eney.domain;

import java.util.ArrayList;
import java.util.List;

public class Creator extends Member{

	private String youtubeAfrica;
	private String facebook;
	private List<String> otherSns;
	
	public Creator() {
		super();
		youtubeAfrica = new String();
		facebook = new String();
		otherSns = new ArrayList<String>();
	}

	
	public Creator(Integer memberNo, String name, String email, String phoneNum, String youtubeAfrica, String facebook,
			List<String> otherSns) {
		super(memberNo, name, email, phoneNum);
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


	public List<String> getOtherSns() {
		return otherSns;
	}


	public void setOtherSns(List<String> otherSns) {
		this.otherSns = otherSns;
	}

	
}
