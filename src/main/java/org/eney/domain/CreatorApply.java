package org.eney.domain;

import java.util.ArrayList;
import java.util.List;

public class CreatorApply extends Apply{

	private String profileOriginalFileName;
	private String profileStoredFileName;
	
	private List<String> genreList;
	private List<MemberSns> snsInfo;
	
	public CreatorApply() {
		super();
		profileOriginalFileName = new String();
		profileStoredFileName = new String();
		genreList = new ArrayList<String>();
		snsInfo = new ArrayList<MemberSns>();
	}
	public CreatorApply(String profileOriginalFileName, String profileStoredFileName, List<String> genreList,
			List<MemberSns> snsInfo) {
		super();
		this.profileOriginalFileName = profileOriginalFileName;
		this.profileStoredFileName = profileStoredFileName;
		this.genreList = genreList;
		this.snsInfo = snsInfo;
	}
	public String getProfileOriginalFileName() {
		return profileOriginalFileName;
	}
	public void setProfileOriginalFileName(String profileOriginalFileName) {
		this.profileOriginalFileName = profileOriginalFileName;
	}
	public String getProfileStoredFileName() {
		return profileStoredFileName;
	}
	public void setProfileStoredFileName(String profileStoredFileName) {
		this.profileStoredFileName = profileStoredFileName;
	}
	public List<String> getGenreList() {
		return genreList;
	}
	public void setGenreList(List<String> genreList) {
		this.genreList = genreList;
	}
	public List<MemberSns> getSnsInfo() {
		return snsInfo;
	}
	public void setSnsInfo(List<MemberSns> snsInfo) {
		this.snsInfo = snsInfo;
	}
	@Override
	public String toString() {
		
		return "CreatorApply [profileOriginalFileName=" + profileOriginalFileName + ", profileStoredFileName="
				+ profileStoredFileName + ", genreList=" + genreList + ", snsInfo=" + snsInfo + ", applyNo=" + applyNo
				+ ", memberNo=" + memberNo + ", name=" + name + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", applyInfo=" + applyInfo + ", applyTime=" + applyTime + ", isAccepted=" + isAccepted + "]";
	}
	
	
}
