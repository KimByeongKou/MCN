package org.eney.domain;

/**
 * 장르와 크리에이터 지원서 정보를 가지는 DTO 클래스.
 * @author KimByeongKou
 *
 */
public class GenreVDTO {

	private Integer creatorApplyNo;		// 지원서 id
	private Integer creatorNo;			// 지원서 멤버 id
	private Integer genreClassNo;		// 장르의 클래스 id
	private String genreClassName;		// 장르 이름.
	
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
