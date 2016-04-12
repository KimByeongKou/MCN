package org.eney.serviceimpl;

import java.util.List;

import org.eney.domain.AdvertiserApply;
import org.eney.domain.Result;
import org.eney.service.AdvertiserApplyService;
import org.springframework.stereotype.Service;

@Service
public class AdvertiserApplyServiceImpl implements AdvertiserApplyService{

	@Override
	public Result createAdApplyService(String company, String name, String email, String phone, String concept,
			Integer budget) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApply> retrieveAdApplyService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
