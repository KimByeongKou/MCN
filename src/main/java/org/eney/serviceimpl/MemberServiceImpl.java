package org.eney.serviceimpl;

import java.util.List;

import org.eney.domain.Advertiser;
import org.eney.domain.AdvertiserApply;
import org.eney.domain.Creator;
import org.eney.domain.CreatorApply;
import org.eney.domain.Member;
import org.eney.domain.Result;
import org.eney.service.MemberService;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService{

	@Override
	public List<Creator> retrieveCreatorService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Advertiser> retrieveAdvertiserService(String kind, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateCreatorService(String memeberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateAdvertiserService(String memberNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CreatorApply getCreatorApply() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdvertiserApply getAdvertiserApply() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMemberInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
