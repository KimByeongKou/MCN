package org.eney.dao;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 크리에이터의 지원과 관련하여 Create 시 필요한 기능 명세
 * 
 * @author eney-pc3
 *
 */
public interface CreatorApplyCreateDAO {

	/**
	 * 멤버가 크리에이터 지원 시 CreatorApply 를 생성하는 기능 인터페이스 메서드.
	 * 
	 * @param creatorNo				지원하는 멤버의 ID
	 * @param name					지원하는 멤버의 이름
	 * @param email					지원하는 멤버의 이메일
	 * @param phoneNum				지원하는 멤버의 전화번호
	 * @param youtubeAddr			지원하는 멤버의 유튜브 ADDR
	 * @param africaAddr			지원하는 멤버의 아프리카 ADDR
	 * @param facebookAddr			지원하는 멤버의 페이스북 ADDR
	 * @param blogAddr				지원하는 멤버의 블로그 ADDR
	 * @param instaAddr				지원하는 멤버의 인스타그램 ADDR
	 * @param otehrSns				지원하는 멤버의 기타 SNS ADDR
	 * @param applyInfo				지원하는 멤버의 지원 내용
	 * @param originalFileName		지원하는 멤버의 사진 파일의 실제 주소/이름
	 * @param storedFileName		지원하는 멤버의 사진의 저장된 파일의 주소/이름
	 * @return	CREATE 성공 시 양수 리턴.
	 */
	public Integer createCreatorApply(Integer creatorNo, String name, String email, String phoneNum, String youtubeAddr, String africaAddr, String facebookAddr, String blogAddr, String instaAddr, String otehrSns, String applyInfo, String originalFileName, String storedFileName);
	
}
