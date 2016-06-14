package org.eney.domain;

public class GenreDTO {

	private Integer genreNo;
	private Integer creatorApplyNo;
	private Integer creatorNo;
	private Integer genreClassNo;
	
	public GenreDTO() {
		super();
		genreNo = new Integer(0);
		creatorApplyNo = new Integer(0);
		creatorNo = new Integer(0);
		genreClassNo = new Integer(0);
	}

	public GenreDTO(Integer genreNo, Integer creatorApplyNo, Integer creatorNo, Integer genreClassNo) {
		super();
		this.genreNo = genreNo;
		this.creatorApplyNo = creatorApplyNo;
		this.creatorNo = creatorNo;
		this.genreClassNo = genreClassNo;
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
	
	
}
