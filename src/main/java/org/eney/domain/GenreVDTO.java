package org.eney.domain;

public class GenreVDTO {

	private Integer creatorApplyNo;
	private Integer creatorNo;
	private Integer genreClassNo;
	private String genreClassName;
	
	public GenreVDTO() {
		super();
		creatorApplyNo = new Integer(0);
		creatorNo = new Integer(0);
		genreClassNo = new Integer(0);
		genreClassName = new String();
	}

	public GenreVDTO(Integer creatorApplyNo, Integer creatorNo, Integer genreClassNo,
			String genreClassName) {
		super();
		this.creatorApplyNo = creatorApplyNo;
		this.creatorNo = creatorNo;
		this.genreClassNo = genreClassNo;
		this.genreClassName = genreClassName;
	}



	public Integer getCreatorApplyNo() {
		return creatorApplyNo;
	}

	public void setCreatorApplyNo(Integer creatorApplyNo) {
		this.creatorApplyNo = creatorApplyNo;
	}

	public Integer getCreatorNo() {
		return creatorNo;
	}

	public void setCreatorNo(Integer creatorNo) {
		this.creatorNo = creatorNo;
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

	@Override
	public String toString() {
		return "GenreVDTO [creatorApplyNo=" + creatorApplyNo + ", creatorNo=" + creatorNo
				+ ", genreClassNo=" + genreClassNo + ", genreClassName=" + genreClassName + "]";
	}
	
	
}
