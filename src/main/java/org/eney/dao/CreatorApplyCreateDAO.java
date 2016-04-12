package org.eney.dao;

import org.eney.domain.CreatorApply;

public interface CreatorApplyCreateDAO {

	public Integer createCreatorApply(Integer memberNo, String name, String email, String phone, String youtubeAfrice, String facebook, String otherSns, String applyInfo);
	public Integer createCreatorApply(CreatorApply creatorApply);
	
}
