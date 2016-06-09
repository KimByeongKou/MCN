package org.eney.serviceimpl;

import javax.inject.Inject;

import org.eney.dao.GenreDAO;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl {

	@Inject
	private GenreDAO dao;
	
	
}
