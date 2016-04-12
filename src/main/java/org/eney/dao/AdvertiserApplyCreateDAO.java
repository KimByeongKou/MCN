package org.eney.dao;

import org.eney.domain.AdvertiserApply;

public interface AdvertiserApplyCreateDAO {

	public Integer createAdvertiserApply(Integer memberNo, String companyName, String name, String email, String phone, String concept, Integer budget, String applyInf);
	public Integer createAdvertiserApply(AdvertiserApply apply);
}
