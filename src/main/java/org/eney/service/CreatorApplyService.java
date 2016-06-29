package org.eney.service;

import java.util.List;

import org.eney.domain.Creator;
import org.eney.domain.CreatorApply;
import org.eney.domain.Result;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * CreatorApply에 관련된 서비스 인터페이스.
 * @author KimByeongKou
 *
 */
public interface CreatorApplyService {

	/**
	 * 크리에이터 지원 역할 서비스 메서드.
	 * 
	 * @param memberNo			멤버 id
	 * @param name				멤버 이름
	 * @param email				멤버 이메일
	 * @param phone				멤버 폰넘버 
	 * @param genre				멤버 장르 리스트 
	 * @param youtube			멤버 유튜브 주소
	 * @param africa			멤버 아프리카 주소
	 * @param facebook			멤버 페북 주소
	 * @param insta				멤버 인스타 주소
	 * @param blog				멤버 블로그 주소
	 * @param otherSns			멤버 기타 sns 주소
	 * @param applyInfo			멤버 지원 내용
	 * @param storedFileName	프로필 사진 저장소 주소
	 * @param multipartFile		사진 파일이 포함된 멀티파트 
	 * @return	Result 결과 객체
	 */
	public Result createCreatorApplyService(Integer memberNo, String name, String email, String phone, String[] genre, String youtube, String africa, String facebook, String insta, String blog, String otherSns, String applyInfo, String storedFileName, MultipartHttpServletRequest multipartFile);
	
	/**
	 * 이미 지원 하였는지 검사하는 메서드
	 * 
	 * @param memberNo	멤버 id	
	 * @return	이미 지원 되어 있다면 양수, 그렇지 않으면 음수
	 */
	public Integer isApplid(Integer memberNo);
	
	/**
	 * 멤버를 크리에이터로 바꾸는 메서드
	 * 
	 * @param memberNo		멤버 id
	 * @param applyNo		크리에이터 지원서 id
	 * @return	Result 결과 객체
	 */
	public Result changeMemberToCreator(Integer memberNo, Integer applyNo);
	
	/**
	 * 지원서 리스트를 검색한다.
	 * 
	 * @param isAccepted	검색하려는 지원서의 지원 여부 boolean 값.
	 * @return	지원서 리스트
	 */
	public List<CreatorApply> searchAllCreatorApply(Boolean isAccepted);

	/**
	 * 장르로 크리에이터를 검색한다.
	 * 
	 * @param genre	장르 string
	 * @return	크리에이터 리스트
	 */
	public List<Creator> searchCreatorByGenre(String genre);
}
