package org.eney.serviceimpl;

import java.util.List;

import org.eney.domain.CreatorApply;
import org.eney.domain.Result;
import org.eney.service.CreatorApplyService;
import org.springframework.stereotype.Service;


@Service
public class CreatorApplyServiceImpl implements CreatorApplyService{

	@Override
	public Result createCreatorApplyService(String name, String email, String phone, String youtubeAfrica,
			String facebook, String otherSns) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreatorApply> retrieveCreatorApplyService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

}
