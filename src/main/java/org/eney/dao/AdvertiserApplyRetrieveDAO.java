package org.eney.dao;

import java.util.List;

import org.eney.domain.AdvertiserApplyDTO;

public interface AdvertiserApplyRetrieveDAO {

	public List<AdvertiserApplyDTO> searchAdvertiserApplyAll();
	public AdvertiserApplyDTO 		searchAdvertiserApplyByAdvertiserApplyNo(Integer applyNo);
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByCompany			(String company);
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByEmail			(String email);
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByPhone			(String phone);
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByConcept			(String concept);
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByBudget			(int minBudget, int maxBudget);
}
