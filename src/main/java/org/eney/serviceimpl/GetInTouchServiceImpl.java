package org.eney.serviceimpl;

import javax.inject.Inject;

import org.eney.dao.GetInTouchDAO;
import org.eney.service.GetInTouchService;
import org.eney.util.SendMail;
import org.springframework.stereotype.Service;

@Service
public class GetInTouchServiceImpl  implements GetInTouchService{

	
	@Inject
	private GetInTouchDAO dao;
	
	@Override
	public Integer createGetInTouch(String name, String email, String phone, String message) {
		// TODO Auto-generated method stub
		Integer result = dao.createGetInTouch(name, phone, email, message);
		String str = new String();
		if(result>0){
			str = new String(name + "  " + email + "  " + phone + "  " + message);
			SendMail mailService = new SendMail();
			mailService.sendMail(str);
			return 1;
		}else{
			return 0;
		}
		
	}

}
