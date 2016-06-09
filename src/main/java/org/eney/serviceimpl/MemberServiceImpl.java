package org.eney.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.eney.dao.MemberDAO;
import org.eney.domain.Member;
import org.eney.domain.MemberDTO;
import org.eney.service.MemberService;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO dao;
	
	
	
	@Override
	public Integer isMember(String userId) {
		// TODO Auto-generated method stub
		
		MemberDTO dto = dao.searchMemberByUserId(userId);
		
		if(dto == null) return -1;
		return dto.getMemberNo();
	}

	@Override
	public Integer registerMember(String userId, String accessToken, String name) {
		// TODO Auto-generated method stub
		
		return dao.createMember(name, userId, accessToken);
	}

	@Override
	public Integer getMemberNo(String userId) {
		// TODO Auto-generated method stub
		
		return dao.searchMemberNo(userId);
	}

	@Override
	public Integer registerClass(Integer memberNo, String className) {
		// TODO Auto-generated method stub
		
		return 1;//dao.createMemberClass(memberNo, className);
	}

	@Override
	public Integer isAdmin(String userId, String name, Integer memberNo) {
		// TODO Auto-generated method stub
		Integer res = dao.searchAdmin(userId, name, memberNo);
		if(res !=null && res > 0) return 1;
		else return 0;
	}

	@Override
	public List<Member> searchAllMember() {
		// TODO Auto-generated method stub
		List<Member> list = new ArrayList<Member>();
		List<MemberDTO> dtoList = dao.searchMemberAll();
		
		for(MemberDTO dto : dtoList){
			Member member = new Member(dto.getMemberNo(), dto.getName(),  dto.getUserId(), dto.getAccessToken(), dto.getRegDate().toString());
			list.add(member);
		}
		return list;
	}
	
	


}
