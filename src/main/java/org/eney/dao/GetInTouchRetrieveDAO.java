package org.eney.dao;

import java.util.List;

import org.eney.domain.GetInTouchDTO;

public interface GetInTouchRetrieveDAO {
	public List<GetInTouchDTO> searchAllGetInTouch();
	public GetInTouchDTO searchGetInTouchByTouchNo(Integer touchNo);
	public List<GetInTouchDTO> searchGetInTouchByName(String name);
	public List<GetInTouchDTO> searchGetInTouchByPhone(String phoneNum);
	public List<GetInTouchDTO> searchGetInTouchByEmail(String email);
	public List<GetInTouchDTO> searchGetInTouchByTouchInfo(String touchInfo);
}
