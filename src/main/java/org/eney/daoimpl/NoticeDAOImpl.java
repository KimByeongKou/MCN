package org.eney.daoimpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eney.dao.NoticeDAO;
import org.eney.domain.NoticeDTO;
import org.springframework.stereotype.Repository;


@Repository
public class NoticeDAOImpl implements NoticeDAO{


	@Inject
	private SqlSession sqlSession;
	
	
	private static final String namespace =
			"org.eney.mapper.noticeMapper";
	
	
	
	@Override
	public Integer createNotice(String memberNo, String title, String info) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_title", title);
		paramMap.put("noti_notice_info", info);
		
		//세션 id
		paramMap.put("noti_writer_no", Integer.parseInt(memberNo));
		
		
		sqlSession.insert(namespace+".createNotice", paramMap);
		return  sqlSession.selectOne(namespace+".searchNewId", paramMap);
	}

	@Override
	public Integer deleteNotice(Integer noticeNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_no", noticeNo);
		return sqlSession.delete(namespace+".deleteNotice", paramMap);
	}

	@Override
	public List<NoticeDTO> searchNoticeAll() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+".searchNoticeAll");
	}

	@Override
	public NoticeDTO searchNoticeByNoticeNo(Integer noticeNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_no", noticeNo);
		return sqlSession.selectOne(namespace+".searchNoticeByNoticeNo", paramMap);
	}

	@Override
	public List<NoticeDTO> searchNoticeByNoticeTitle(String title) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_title", title);
		return sqlSession.selectList(namespace+".searchNoticeByNoticeTitle", paramMap);
	}

	@Override
	public List<NoticeDTO> searchNoticeByWriterNo(Integer writerNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_member_no", writerNo);
		return sqlSession.selectList(namespace+".searchNoticeByWriterNo", paramMap);
	}

	@Override
	public List<NoticeDTO> searchNoticeByNoticeInfo(String noticeInfo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_info", noticeInfo);
		return sqlSession.selectList(namespace+".searchNoticeByNoticeInfo", paramMap);
	}

	@Override
	public List<NoticeDTO> searchNoticeByRegDate(Date start, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateTitle(Integer noticeNo, String title) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_no", noticeNo);
		paramMap.put("noti_title", title);
		
		return sqlSession.update(namespace+".updateTitle", paramMap);
	}

	@Override
	public Integer updateInfo(Integer noticeNo, String info) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_no", noticeNo);
		paramMap.put("noti_notice_info", info);
		return sqlSession.update(namespace+".updateInfo", paramMap);
	}

	@Override
	public Integer updateNoticeCnt(Integer noticeNo) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("noti_notice_no", noticeNo);
		return sqlSession.update(namespace+".updateNoticeCnt", paramMap);
	}

}
