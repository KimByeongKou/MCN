package org.eney.dao;

import java.util.List;

import org.eney.domain.CreatorApplyDTO;

public interface CreatorApplyRetrieveDAO {

	public List<CreatorApplyDTO> searchCreatorApplyAll();
	public CreatorApplyDTO searchCreatorApplyByCreatorApplyNo(Integer applyNo);
	public List<CreatorApplyDTO> searchCreatorByName(String name);
	public List<CreatorApplyDTO> searchCreatorByEmail(String email);
	public List<CreatorApplyDTO> searchCreatorByPhone(String phone);
	public List<CreatorApplyDTO> searchCreatorByYoutubeAfrica(String youtubeAfrica);
	public List<CreatorApplyDTO> searchCreatorByFacebook(String facebook);
	public List<CreatorApplyDTO> searchCreatorByOtherSns(String otherSns);
	
}
