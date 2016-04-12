package org.eney.test.dao;

import javax.inject.Inject;

import org.eney.dao.NoticeDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class NoticeDAOTest {

	@Inject
	private NoticeDAO dao;
	
	
	
	//@Test
	public void testCreateNotice() throws Exception{
		
		dao.createNotice("22", "testTitle", "test Info");
	}
	
	//@Test
	public void testUpdateTitle() throws Exception{
		dao.updateTitle(1, "modified Title");
	}
	
	
	//@Test
	public void testSearchNoticeAll() throws Exception{
		dao.searchNoticeAll();
	}
	
	@Test
	public void testDeleteNotice() throws Exception{
		dao.deleteNotice(3);
	}
	
}


