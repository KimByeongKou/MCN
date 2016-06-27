package org.eney.dao;

import java.util.List;

import org.eney.domain.MemberDTO;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 멤버와 관련하여 Retrieve 시 필요한 기능 명세
 * @author eney-pc3
 *
 */
public interface MemberRetrieveDAO {

	/**
	 * 모든멤버 테이블의 정보 리턴.
	 * @return List MemberDTO  전체 멤버 리스
	 */
	public List<MemberDTO> searchMemberAll();
	
	/**
	 * userId로 멤버 id를 검색
	 * @param userId  유저 id
	 * @return  memberNo
	 */
	public Integer searchMemberNo(String userId);
	
	/**
	 * 전에 로그인 이력이 없는 유저가 로그인 시 사용.
	 * 새로운 유저 id 를 사용하여 새롭게 생성된 멤버 id 를 리턴.
	 * 
	 * @param userId  로그인 이력이 없는 userId
	 * @return 새롭게 할당된 memberId
	 */
	public Integer searchNewId(String userId);
	
	/**
	 * memberiD를 인자로 멤버 테이블의 정보를 리
	 * @param memberNo 	멤버 id
	 * @return	MemberDTO
	 */
	public MemberDTO searchMemberByMemberNo(Integer memberNo);
	
	/**
	 * userName을 인자로 멤버 테이블을 검색함. 
	 * 인자의 글자가 하나라도 포함되어 있으면 결과 리스트에 포함.
	 * @param name  유저 이
	 * @return List MemberDTO  멤버 리스트.
	 */
	public List<MemberDTO> searchMemberByName(String name);
	
	/**
	 *	userId를 사용하여 멤버 테이블을 검색.
	 * @param userId 유저id
	 * @return Memberdto
	 */
	public MemberDTO searchMemberByUserId(String userId);
	
	
	//public MemberDTO searchMemberByAccessToken(String accessToken);
	
	/**
	 * useriD, Name, MemberNo를 인자로 하여 admin인지를 검사.
	 * 맞다면 양수, 아니면 음수.
	 * @param userId	검사하려는 유저  id
	 * @param name		검사하려는 name
	 * @param memberNo	검사하려는  membernO
	 * @return  Result값. 참이면 양수, 거짓이면 음수.
	 */
	public Integer searchAdmin(String userId, String name, Integer memberNo);
}
