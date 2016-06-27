package org.eney.dao;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 크리에이터의 지원과 관련하여 Update 시 필요한 기능 명세
 * 
 * 
 * @author eney-pc3
 *
 */

public interface CreatorApplyUpdateDAO {

	/**
	 * 미승인 지원서를 승인된 지원서로 UPDATE 한다
	 * 
	 * @param applyNo	승인하려는 지원서 ID
	 * @return	성공 시  1, 실패 시 -1
	 */
	public Integer updateApplyAccepted(Integer applyNo);
}
