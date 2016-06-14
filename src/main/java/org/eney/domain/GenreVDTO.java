package org.eney.domain;

public class GenreVDTO {

	private Integer genreNo;
	private Integer creatorApplyNo;
	private Integer creatorNo;
	private Integer genreClassNo;
	private String genreClassName;
	
	public GenreVDTO() {
		super();
		genreNo = new Integer(0);
		creatorApplyNo = new Integer(0);
		creatorNo = new Integer(0);
		genreClassNo = new Integer(0);
		genreClassName = new String();
	}

	public GenreVDTO(Integer genreNo, Integer creatorApplyNo, Integer creatorNo, Integer genreClassNo,
			String genreClassName) {
		super();
		this.genreNo = genreNo;
		this.creatorApplyNo = creatorApplyNo;
		this.creatorNo = creatorNo;
		this.genreClassNo = genreClassNo;
		this.genreClassName = genreClassName;
	}

	public Integer getGenreNo() {
		return genreNo;
	}

	public void setGenreNo(Integer genreNo) {
		this.genreNo = genreNo;
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
		return "GenreVDTO [genreNo=" + genreNo + ", creatorApplyNo=" + creatorApplyNo + ", creatorNo=" + creatorNo
				+ ", genreClassNo=" + genreClassNo + ", genreClassName=" + genreClassName + "]";
	}
	
	
}
