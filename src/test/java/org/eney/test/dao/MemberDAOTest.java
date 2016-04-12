package org.eney.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.eney.dao.MemberDAO;
import org.eney.domain.MemberDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	
	
	
	//@Transactional
	//@Test
	public void testInsertMember()throws Exception{
		
		dao.createMember("test3", "test36@test.com", "01012341234");
		
	}
	
	//@Test
	public void testDeleteMember() throws Exception{
		dao.deleteMember(5);
	}
	
	
	
	@Test
	public void testSearchMember() throws Exception{
		List<MemberDTO> dtoList = dao.searchMemberAll();
		System.out.println(dtoList);
	}
	
	
	//@Test
	public void testUpdate() throws Exception{
		
		dao.updateMemberToCreator(5);
	}

	
	
}


