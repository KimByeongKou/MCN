package org.eney.domain;

import java.util.List;

public class Creator extends Member{

	private String originalFileName;
	private String storedFileName;
	private List<SNSInfo> snsList;
	private List<String> genreList;
	
	public Creator() {
		super();
	}
	public Creator(String originalFileName, String storedFileName, List<SNSInfo> snsList, List<String> genreList) {
		super();
		this.originalFileName = originalFileName;
		this.storedFileName = storedFileName;
		this.snsList = snsList;
		this.genreList = genreList;
	}
	public String getOriginalFileName() {
		return originalFileName;
	}
	public void setOriginalFileName(String originalFileName) {
		this.originalFileName = originalFileName;
	}
	public String getStoredFileName() {
		return storedFileName;
	}
	public void setStoredFileName(String storedFileName) {
		this.storedFileName = storedFileName;
	}
	public List<SNSInfo> getSnsList() {
		return snsList;
	}
	public void setSnsList(List<SNSInfo> snsList) {
		this.snsList = snsList;
	}
	public List<String> getGenreList() {
		return genreList;
	}
	public void setGenreList(List<String> genreList) {
		this.genreList = genreList;
	}
	@Override
	public String toString() {
		return "Creator [originalFileName=" + originalFileName + ", storedFileName=" + storedFileName + ", snsList="
				+ snsList + ", genreList=" + genreList + "]";
	}
	
	

	
	

	
}
