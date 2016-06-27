package org.eney.domain;

import java.util.List;

/**
 * Creator 기본 내용들을 가지고 있는 VO 클래스.
 * @author KimByeongKou
 *
 */
public class Creator extends Member{

	private String originalFileName;		//지원서 사진이 저장된 원본 파일이름.
	private String storedFileName;			//지원서 사진이 저장된 서버의 파일 이름.카페24.
	private List<SNSInfo> snsList;			//지원의 sns 정보.
	private List<String> genreList;			//지원서의 genre 정보.
	
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
