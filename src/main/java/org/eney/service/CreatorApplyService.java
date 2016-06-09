package org.eney.service;

import java.util.List;

import org.eney.domain.Creator;
import org.eney.domain.CreatorApply;
import org.eney.domain.Result;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface CreatorApplyService {

	public Result createCreatorApplyService(Integer memberNo, String name, String email, String phone, String[] genre, String youtube, String africa, String facebook, String insta, String blog, String otherSns, String applyInfo, String storedFileName, MultipartHttpServletRequest multipartFile);
	public Integer isApplid(Integer memberNo);
	
	
	public Result changeMemberToCreator(Integer memberNo, Integer applyNo);
	
	public List<CreatorApply> searchAllCreatorApply(Boolean isAccepted);

	public List<Creator> searchCreatorByGenre(String genre);
}
