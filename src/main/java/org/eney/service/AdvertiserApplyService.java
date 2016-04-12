package org.eney.service;

import java.util.List;

import org.eney.domain.AdvertiserApply;
import org.eney.domain.Result;

public interface AdvertiserApplyService {

	public Result createAdApplyService(String company, String name, String email, String phone, String concept, Integer budget);
	public List<AdvertiserApply> retrieveAdApplyService(String kind, String value);
}
