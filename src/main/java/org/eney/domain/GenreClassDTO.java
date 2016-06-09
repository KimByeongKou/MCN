package org.eney.domain;

public class GenreClassDTO {

	private Integer genreClassNo;
	private String genreClassName;
	
	public GenreClassDTO() {
		super();
		genreClassName = new String();
		genreClassNo = new Integer(0);
	}

	public GenreClassDTO(Integer genreClassNo, String genreClassName) {
		super();
		this.genreClassNo = genreClassNo;
		this.genreClassName = genreClassName;
	}

	public Integer getGenreClassNo() {
		return genreClassNo;
	}

	public void setGenreClassNo(Integer genreClassNo) {
		this.genreClassNo = genreClassNo;
	}

	public String getGenreClassName() {
		return genreClassName;
	}

	public void setGenreClassName(String genreClassName) {
		this.genreClassName = genreClassName;
	}
	
	
}
