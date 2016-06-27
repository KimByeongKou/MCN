package org.eney.dao;


/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 게시판 정보에서 Create와 관련된 기능을 담은 인터페이스.
 * @author eney-pc3
 *
 */
public interface NoticeCreateDAO {
	
	/**
	 * 노티스를 추가하는 메서드.
	 * @param memberNo	관리자 memberNo
	 * @param title		노티스 타이틀.
	 * @param info		노티스 인포.
	 * @return	성공 여부.
	 */
	public Integer createNotice(String memberNo, String title, String info);
	
}
