package org.eney.dao;
/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 크리에이터의 지원과 관련하여 Delete 시 필요한 기능 명세
 * 
 * 
 * @author eney-pc3
 *
 */
public interface CreatorApplyDeleteDAO {

	/**
	 * 지원서 id 를 기준으로 지원서를 삭제함
	 * 
	 * @param CreatorApplyNo	지원서 id
	 * @return	Integer 		삭제 성공 시 1, 실패 시 -1
	 */
	public Integer deleteCreatorApplyCreatorApplyNo(Integer CreatorApplyNo);
	
	/**
	 * 지원서의 회원 id 를 기준으로 지원서를 삭제함
	 * 
	 * @param creatorNo			지원서 멤버 id
	 * @return	Integer			삭제 성공 시 1, 실패 시 -1
	 */
	public Integer deleteCreatorApplyByCreatorNo(Integer creatorNo);
}
