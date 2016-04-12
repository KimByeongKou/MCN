package org.eney.daoimpl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.AdvertiserApplyDAO;
import org.eney.domain.AdvertiserApply;
import org.eney.domain.AdvertiserApplyDTO;
import org.springframework.stereotype.Repository;

@Repository
public class AdvertiserApplyDAOImpl implements AdvertiserApplyDAO{

	
	
	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.advertiserApplyMapper";
	
	
	@Override
	public Integer createAdvertiserApply(Integer memberNo, String companyName, String name, String email, String phone,
			String concept, Integer budget, String applyInf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer createAdvertiserApply(AdvertiserApply apply) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteAdvertiserApply(Integer applyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdvertiserApplyDTO searchAdvertiserApplyByAdvertiserApplyNo(Integer applyNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByCompany(String company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByConcept(String concept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByBudget(int minBudget, int maxBudget) {
		// TODO Auto-generated method stub
		return null;
	}

}
