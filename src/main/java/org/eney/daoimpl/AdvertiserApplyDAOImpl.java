package org.eney.daoimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_member_no", memberNo);
		paramMap.put("ad_company_name", companyName);
		paramMap.put("ad_name", name);
		paramMap.put("ad_email", email);
		paramMap.put("ad_phone_num", phone);
		paramMap.put("ad_concept", concept);
		paramMap.put("ad_budget", budget);
		paramMap.put("ad_apply_info", applyInf);
		sqlSession.insert(namespace+".createAdvertiserApply", paramMap);
		
		
		return sqlSession.selectOne(namespace+".searchNewId", paramMap);
	}

	@Override
	public Integer createAdvertiserApply(AdvertiserApply apply) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("m_member_no", apply.getMemberNo());
		paramMap.put("ad_company_name", apply.getCompanyName());
		paramMap.put("ad_name", apply.getName());
		paramMap.put("ad_email", apply.getEmail());
		paramMap.put("ad_phone_num", apply.getPhoneNum());
		paramMap.put("ad_concept", apply.getConcept());
		paramMap.put("ad_budget", apply.getBudget());
		paramMap.put("ad_apply_info", apply.getApplyInfo());
		
		sqlSession.insert(namespace+".createAdvertiserApply", paramMap);
		return sqlSession.selectOne(namespace+".searchNewId", paramMap);
	}

	@Override
	public Integer deleteAdvertiserApply(Integer applyNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_apply_no", applyNo);
		
		return sqlSession.delete(namespace+".deleteAdvertiserApply", paramMap);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchAdvertiserApplyAll");
	}

	@Override
	public AdvertiserApplyDTO searchAdvertiserApplyByAdvertiserApplyNo(Integer applyNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_apply_no", applyNo);
		return sqlSession.selectOne(namespace+".searchAdvertiserApplyByAdvertiserApplyNo", paramMap);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByCompany(String company) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_company_name", company);
		return sqlSession.selectList(namespace+".searchAdvertiserApplyByCompany", paramMap);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByEmail(String email) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_email", email);
		
		return sqlSession.selectList(namespace+".searchAdvertiserApplyByEmail", paramMap);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByPhone(String phone) {
		// TODO Auto-generated method stub
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_phone_num", phone);
		
		return sqlSession.selectList(namespace+".searchAdvertiserApplyByPhone", phone);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByConcept(String concept) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("ad_concept", concept);
		return sqlSession.selectList(namespace+".searchAdvertiserApplyByConcept", concept);
	}

	@Override
	public List<AdvertiserApplyDTO> searchAdvertiserApplyByBudget(int minBudget, int maxBudget) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("min_budget", minBudget);
		paramMap.put("max_budget", maxBudget);
		
		return sqlSession.selectList(namespace+".searchAdvertiserApplyByBudget", paramMap);
	}

}
