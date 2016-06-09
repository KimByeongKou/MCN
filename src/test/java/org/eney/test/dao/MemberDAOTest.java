package org.eney.test.dao;

import javax.inject.Inject;

import org.eney.dao.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	
	
	
	//@Transactional
	//@Test
	public void testInsertMember()throws Exception{
		
		int newId = dao.createMember("test11", "t3est36444@test.com", "01012341234");
		System.out.println(newId);
		
	}
	
	//@Test
	public void testDeleteMember() throws Exception{
		dao.deleteMember(19);
	}
	
	
	
	@Test
	public void testSearchMember() throws Exception{
		//1714826812139908
		//MemberDTO dto = dao.searchMemberByUserId("1714826812139908");
		//dao.searchMemberAll();
		
		dao.searchMemberByMemberNo(12);

	}
	
	
	//@Test
	public void testUpdate() throws Exception{
		
		dao.updateMemberToCreator(5);
	}

	
	
}


