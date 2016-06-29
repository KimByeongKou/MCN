package org.eney.service;

/**
 * 문의 하기와 관련된 기능 인터페이스
 * 
 * @author eney-pc3
 *
 */
public interface GetInTouchService {

	/**
	 * 문의 하기를 실행하는 메서드
	 * 
	 * @param name		문의자 이름
	 * @param email		문의자 이메일
	 * @param phone		문의자 폰넘버
	 * @param message	문의 내용
	 * @return	성공 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer createGetInTouch(String name, String email, String phone, String message);
}
