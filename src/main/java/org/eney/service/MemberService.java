package org.eney.service;

import java.util.List;

import org.eney.domain.Member;

/**
 * 멤버와 관련된 기능 인터페이스
 * @author eney-pc3
 *
 */
public interface MemberService {

	/**
	 * 유저 id 로 이미 멤버인지를 판단하는 메서드
	 * 
	 * @param userId	판별하려는 userId
	 * @return	판단 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer isMember(String userId);
	
	/**
	 * 회원 가입이 안되었을 시, 새롭게 회원을 등록하는 메서드
	 * 
	 * @param userId		등록 유저 id
	 * @param accessToken	등록 accessToken
	 * @param name			등록 유저 이름
	 * @return	성공 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer registerMember(String userId, String accessToken, String name);
	
	/**
	 * 유저 id(페이스북 사용자 고유 id) 로 어플리케이션의 멤버 id를 얻는다.
	 * 
	 * @param userId	유저 id
	 * @return	멤버 id 값
	 */
	public Integer getMemberNo(String userId);
	
	/**
	 * 특정 멤버에 대해 클래스를 새로 부여한다 ( member, creator, advertiser, ... )
	 * 
	 * @param memberNo	멤버 id
	 * @param className	클래스 이름.
	 * @return	성공 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer registerClass(Integer memberNo, String className);
	
	/**
	 * 해당 사용자가 관리자 인지를 판별하는 메서드
	 * 
	 * @param userId		유저 id
	 * @param name			유저 이름
	 * @param memberNo		멤버 id
	 * @return	판별 결과. 어드민이라면 양수, 아니라면 0
	 */
	public Integer isAdmin (String userId, String name, Integer memberNo);
	
	/**
	 * 모든 멤버 정보 리턴
	 * @return	멤버 리스트
	 */
	public List<Member> searchAllMember();
}
