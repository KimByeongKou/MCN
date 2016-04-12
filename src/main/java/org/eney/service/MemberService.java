package org.eney.service;

import java.util.List;

import org.eney.domain.Advertiser;
import org.eney.domain.AdvertiserApply;
import org.eney.domain.Creator;
import org.eney.domain.CreatorApply;
import org.eney.domain.Member;
import org.eney.domain.Result;

public interface MemberService {

	public List<Creator> retrieveCreatorService(String kind, String value);
	public List<Advertiser> retrieveAdvertiserService(String kind, String value);
	public Result updateCreatorService(String memeberNo);
	public Result updateAdvertiserService(String memberNo);
	public CreatorApply getCreatorApply();
	public AdvertiserApply getAdvertiserApply();
	public Member getMemberInfo();
}
