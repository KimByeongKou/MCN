package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberVDTO;


/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버와 sns 정보를 가지는 뷰인 view_member 의 정보를 검색하는 기능 명세를 모두 가지는 확장 인터페이스.
 * @author eney-pc3
 *
 */
public interface MemberRetrieveVDAO {

	public List<MemberVDTO> searchMemberViewAll();
	public MemberVDTO searchMemberViewByMemberNo(Integer memberNo);
	public List<MemberVDTO> searchMemberViewByName(String memberName);
	public MemberVDTO searchMemberViewByUserId(String userId);
	public MemberVDTO searchMemberViewByAccessToken(String accessToken);
	
}
