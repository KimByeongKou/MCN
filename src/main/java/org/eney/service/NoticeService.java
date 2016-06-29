package org.eney.service;

import java.io.UnsupportedEncodingException;

import org.eney.domain.Notice;
import org.eney.domain.NoticeList;
import org.eney.domain.Result;

/**
 * 노티스와 관련된 기능 인터페이스
 * 
 * @author eney-pc3
 *
 */
public interface NoticeService {

	/**
	 * 노티스 정보를 가져오는 메서드
	 * 
	 * @param num			가져오려는 노티스 개수
	 * @param page			해당 개수에 따라 페이징 되었을 때, 원하는 페이지 no
	 * @param isEncoded		인코딩  필요 여부
	 * @return	노티스 리스트
	 * @throws UnsupportedEncodingException		인코딩 익셉션
	 */
	public NoticeList getNoticeService(int num, int page, boolean isEncoded) throws UnsupportedEncodingException;
	
	
	/**
	 * 특정 노티스의 정보를 가져오는 메서드
	 * 
	 * @param noticeNo		가져오려는 노티스 id
	 * @param isEncoded		인코딩 필요 여부
	 * @return	노티스
	 * @throws UnsupportedEncodingException		인코딩 익셉션
	 */
	public Notice getNotice(int noticeNo, boolean isEncoded) throws UnsupportedEncodingException;
	
	/**
	 * 특정 노티스의 조회수를 1 증가시키는 메서드
	 * 
	 * @param noticeNo	노티스 id
	 * @return	성공 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer plusNoticeCnt(int noticeNo);
	
	/**
	 * 특정 노티스의 정보를 수정하는 메서드
	 * 
	 * @param noticeNo			수정하려는 노티스 id
	 * @param modifiedTitle		수정하려는 노티스 제목
	 * @param modifiedInfo		수정하려는 노티스 내용
	 * @return	성공 여부. 성공 시 양수, 실패 시 음수
	 */
	public Integer updateNotice(Integer noticeNo, String modifiedTitle, String modifiedInfo);
	
	/**
	 * 노티스를 삭제하는 메서드
	 * 
	 * @param noticeNo	노티스 id
	 * @return	성공 여부. 성공 시 양수, 실패 시 0
	 */
	public Integer deleteNotice(Integer noticeNo);


	/**
	 * 노티스를 생성하는 메서드
	 * 
	 * @param memberNo	글쓴이 멤버 id
	 * @param title		노티스 제목
	 * @param info		노티스 인포
	 * @return	Result 결과 값
	 */
	public Result createNoticeService(Integer memberNo,String title, String info);
	
	
}
