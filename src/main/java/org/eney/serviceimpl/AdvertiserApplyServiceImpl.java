package org.eney.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import org.eney.dao.AdvertiserApplyDAO;
import org.eney.domain.AdvertiserApply;
import org.eney.domain.Result;
import org.eney.service.AdvertiserApplyService;
import org.springframework.stereotype.Service;

@Service
public class AdvertiserApplyServiceImpl implements AdvertiserApplyService{

	
	 @Inject
	 private AdvertiserApplyDAO dao;
	
	@Override
	public Result createAdApplyService(Integer memberNo, String company, String name, String email, String phone, String concept,
			Integer budget, String applyInfo) {
		// TODO Auto-generated method stub
		Integer res = dao.createAdvertiserApply(memberNo, company, name, email, phone, concept, budget, applyInfo);
		if(res > 0){
			return null;// Result("success", true, newId)
		}
		return null;
	}

	@Override
	public List<AdvertiserApply> retrieveAdApplyService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
