package org.eney.service;

import java.util.List;

import org.eney.domain.AdvertiserApply;
import org.eney.domain.Result;

public interface AdvertiserApplyService {

	public Result createAdApplyService(Integer memberNo, String company, String name, String email, String phone, String concept, Integer budget, String applyInfo);
	public List<AdvertiserApply> retrieveAdApplyService(String kind, String value);
}
