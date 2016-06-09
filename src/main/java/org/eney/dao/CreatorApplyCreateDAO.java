package org.eney.dao;

import java.io.InputStream;

public interface CreatorApplyCreateDAO {

	public Integer createCreatorApply(Integer creatorNo, String name, String email, String phoneNum, String youtubeAddr, String africaAddr, String facebookAddr, String blogAddr, String instaAddr, String otehrSns, String applyInfo, String originalFileName, String storedFileName);
	
}
