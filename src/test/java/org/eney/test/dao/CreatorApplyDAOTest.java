package org.eney.test.dao;

import javax.inject.Inject;

import org.eney.dao.CreatorApplyDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class CreatorApplyDAOTest {
	
	@Inject
	private CreatorApplyDAO dao;
	
	
	@Test
	public void testCreateCreatorApply() throws Exception{
	
		
	}
	
}
