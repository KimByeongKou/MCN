package org.eney.dao;

import java.util.List;

import org.eney.domain.CreatorApplyDTO;
import org.eney.domain.CreatorGenreSnsDTO;
import org.eney.domain.GenreVDTO;
import org.eney.domain.MemberSnsVDTO;

/**
 * DAO 패턴 구현을 위한 DAO 인터페이스 .
 * 크리에이터의 지원과 관련하여 Retrieve 시 필요한 기능 명세
 * 
 * 
 * @author eney-pc3
 *
 */
public interface CreatorApplyRetrieveDAO {

	/**
	 * 모든 크리에이터의 지원서 내용을 리턴
	 * 
	 * @return	List CreatorApplyDTO 	지원서 리스트
	 */
	public List<CreatorApplyDTO> searchCreatorApplyAll();
	
	/**
	 * 지원 id 를 기준으로 지원서 내용을 검색함
	 * 
	 * @param applyNo				지원서 id
	 * @return	CreatorApplyDTO		지원서 내용
	 */
	public CreatorApplyDTO searchCreatorApplyByCreatorApplyNo(Integer applyNo);
	
	/**
	 * 지원자의 이름을 기준으로 지원서를 검색함 
	 * 
	 * @param name						지원자 이름
	 * @return	Listm CreatorApplyDTO	지원서 리스트
	 */
	public List<CreatorApplyDTO> searchCreatorByName(String name);
	
	
	/*
	public List<CreatorApplyDTO> searchCreatorByEmail(String email);
	public List<CreatorApplyDTO> searchCreatorByPhone(String phone);
	public List<CreatorApplyDTO> searchCreatorByApplyInfo(String applyInfo);
	*/
	
	/**
	 * 멤버 id 를 기준으로 지원서를 검색함
	 * 
	 * 
	 * @param memberNoId			멤버 id
	 * @return	CreatorApplyDTO		지원서 내용
	 */
	public CreatorApplyDTO searchCreatorApplyByMemberNo(Integer memberNoId);
	
	/**
	 * 멤버 id를 기준으로, 이미 회원 가입한 이력이 있는지를 확인한다.
	 * 
	 * @param memberNo	멤버 id
	 * @return	Integer	기존 가입자라면 양수, 그렇지 않다면 0 리턴
	 */
	public Integer searchNewApplyId(Integer memberNo);
	
	/**
	 * 모든 Genre View 의 내용을 리턴 
	 * 
	 * @return 	List GenreVDTO  GenrVDTO 의 리스트	
	 */
	public List<GenreVDTO> searchGenreAll();
	
	/**
	 * 
	 * 모든 MemberSnsView 의 내용을 리턴
	 * 
	 * @return	List MemberSnsVDTO   	MemberSnsVDTO 리스트
	 */
	public List<MemberSnsVDTO> searchMemberSnsAll();
	
	/**
	 * 장르를 기준으로 크리에이터를 검색
	 * 
	 * @param genre							장르 이름
	 * @return	List CreatorGenreSnsDTO	CreatorGenreSnsDTO 리스트
	 */
	public List<CreatorGenreSnsDTO> searchCreatorByGenre(String genre);
	
	/**
	 * 회원 ID 를 기준으로 장르를 검색
	 * 
	 * 
	 * @param memberNo			회원 ID
	 * @return	List String	회원이 속한 장르 리스트
	 */
	public List<String> searchGenreByMemberNo(Integer memberNo);
}
