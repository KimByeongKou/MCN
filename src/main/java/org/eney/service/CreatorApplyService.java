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
	 * 
	 * @param memberNo
	 * @param name
	 * @param email
	 * @param phone
	 * @param genre
	 * @param youtube
	 * @param africa
	 * @param facebook
	 * @param insta
	 * @param blog
	 * @param otherSns
	 * @param applyInfo
	 * @param storedFileName
	 * @param multipartFile
	 * @return
	 */
	public Result createCreatorApplyService(Integer memberNo, String name, String email, String phone, String[] genre, String youtube, String africa, String facebook, String insta, String blog, String otherSns, String applyInfo, String storedFileName, MultipartHttpServletRequest multipartFile);
	
	/**
	 * 
	 * @param memberNo
	 * @return
	 */
	public Integer isApplid(Integer memberNo);
	
	/**
	 * 
	 * @param memberNo
	 * @param applyNo
	 * @return
	 */
	public Result changeMemberToCreator(Integer memberNo, Integer applyNo);
	
	/**
	 * 
	 * @param isAccepted
	 * @return
	 */
	public List<CreatorApply> searchAllCreatorApply(Boolean isAccepted);

	/**
	 * 
	 * @param genre
	 * @return
	 */
	public List<Creator> searchCreatorByGenre(String genre);
}
