
package org.eney.dao;

import java.util.Date;
import java.util.List;

import org.eney.domain.NoticeDTO;

/**
 * DAO 패턴 구현을 위한  DAO 인터페이스 .
 * 노티스 테이블에서 retrieve 와 관련된 기능을 담은 인터페이스.
 * @author eney-pc3
 *
 */
public interface NoticeRertrieveDAO {

	/**
	 * 모든 노티스의 정보를 리턴.
	 * 
	 * @return  List NoticeDTO
	 */
	public List<NoticeDTO> searchNoticeAll();
	
	/**
	 *  노티스 테이블을 검색함.
	 * @param noticeNo 검색하고자 하는 노티스의 noticeNo
	 * @return	NoticeDTO
	 */
	public NoticeDTO searchNoticeByNoticeNo(Integer noticeNo);
	
	/**
	 * 노티스 테이블을 검색한다.
	 * @param title  검색하고자 하는 노티스의 타이틀
	 * @return List NoticeDTO	해당 타이틀의 글자가 들어간 노티스 리스트.
	 */
	public List<NoticeDTO> searchNoticeByNoticeTitle(String title);
	
	/**
	 *	노티스 테이블을 검색한다.
	 *
	 * @param writerNo	검색하고자 하는 노티스 글쓴이의 memberId
	 * @return  List NoticeDTO.
	 */
	public List<NoticeDTO> searchNoticeByWriterNo(Integer writerNo);
	
	/**
	 * 노티스 테이블을 검색한다.
	 * @param noticeInfo	검색하고자 하는 노티스 인포 스트링
	 * @return List NoticeDTO	검색 문자열이 하나라도 포함되어 있으면, 검색 결과값에 포함된다.
	 */
	public List<NoticeDTO> searchNoticeByNoticeInfo(String noticeInfo);
	
	/**
	 * 
	 * 게시 시점으로 노티스 테이블을 검색한다.
	 * @param start	 게시글 시작 날짜.
	 * @param end	게시글 끝 날짜.
	 * @return List NoticeDTO
	 */
	public List<NoticeDTO> searchNoticeByRegDate(Date start, Date end);
	
}
