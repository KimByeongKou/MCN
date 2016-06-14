package org.eney.dao;

import java.util.List;

import org.eney.domain.CreatorApplyDTO;
import org.eney.domain.CreatorGenreSnsDTO;
import org.eney.domain.GenreVDTO;
import org.eney.domain.MemberSnsVDTO;

public interface CreatorApplyRetrieveDAO {

	public List<CreatorApplyDTO> searchCreatorApplyAll();
	public CreatorApplyDTO searchCreatorApplyByCreatorApplyNo(Integer applyNo);
	public List<CreatorApplyDTO> searchCreatorByName(String name);
	public List<CreatorApplyDTO> searchCreatorByEmail(String email);
	public List<CreatorApplyDTO> searchCreatorByPhone(String phone);
	public List<CreatorApplyDTO> searchCreatorByApplyInfo(String applyInfo);
	public CreatorApplyDTO searchCreatorApplyByMemberNo(Integer memberNoId);
	public Integer searchNewApplyId(Integer memberNo);
	public List<GenreVDTO> searchGenreAll();
	public List<MemberSnsVDTO> searchMemberSnsAll();
	public List<CreatorGenreSnsDTO> searchCreatorByGenre(String genre);
	public List<String> searchGenreByMemberNo(Integer memberNo);
}
