package org.eney.service;

import java.util.List;

import org.eney.domain.CreatorApply;
import org.eney.domain.Result;

public interface CreatorApplyService {

	public Result createCreatorApplyService(String name, String email, String phone, String youtubeAfrica, String facebook, String otherSns);
	public List<CreatorApply> retrieveCreatorApplyService(String kind, String value);
}
