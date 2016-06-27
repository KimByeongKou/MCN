package org.eney.serviceimpl;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.eney.dao.CreatorApplyDAO;
import org.eney.dao.GenreDAO;
import org.eney.dao.MemberDAO;
import org.eney.dao.MemberSnsDAO;
import org.eney.domain.Creator;
import org.eney.domain.CreatorApply;
import org.eney.domain.CreatorApplyDTO;
import org.eney.domain.CreatorGenreSnsDTO;
import org.eney.domain.GenreVDTO;
import org.eney.domain.MemberSns;
import org.eney.domain.MemberSnsVDTO;
import org.eney.domain.Result;
import org.eney.domain.SNSInfo;
import org.eney.service.CreatorApplyService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Service
public class CreatorApplyServiceImpl implements CreatorApplyService{

	@Inject
	private CreatorApplyDAO creatorApplydao;
	
	@Inject
	private GenreDAO genreDao;
	
	@Inject
	private MemberSnsDAO memberSnsDao;
	
	@Inject 
	private MemberDAO mDao;
	
	
	
	
	@Override
	public Result createCreatorApplyService(Integer memberNo, String name, String email, String phone, String[] genre, String youtube, String africa,
			String facebook, String insta, String blog, String otherSns, String applyInfo, 
			String storedFileName, MultipartHttpServletRequest multipartFile) {
		
		
		
		//파일 저장하고
		boolean isSuccess = false;
		String uploadPath = "c:/testFile/";
		File dir = new File(uploadPath);

		if (!dir.isDirectory()) {
			dir.mkdirs();
		}

		
		
		String originalFileName = null;
		Iterator<String> iter = multipartFile.getFileNames();
		while(iter.hasNext()) {
			String uploadFileName = iter.next();
			MultipartFile mFile = multipartFile.getFile(uploadFileName);
			
			originalFileName = mFile.getOriginalFilename();
			String saveFileName = storedFileName;	//저장하기 위한 파일 이름은 따로 저장해준다.

			
			if(saveFileName != null && !saveFileName.equals("")) {
				if(new File(uploadPath + saveFileName).exists()) {
					saveFileName = saveFileName + "_" + System.currentTimeMillis();
				}
				try {
					mFile.transferTo(new File(uploadPath + saveFileName));	//파일 쓰는 부분.
					isSuccess = true;				
				} catch (IllegalStateException e) {
					e.printStackTrace();
					isSuccess = false;
				} catch (IOException e) {
					e.printStackTrace();
					isSuccess = false;
				}

			} // if end
		} // while end

		
		System.out.println("파일쓰기 성공 / 실패 : " + isSuccess);
		System.out.println("저장할 정보 : " + memberNo + name + email + phone + genre[2] + youtube + africa);
		
		
		
		//어플라이 올리고
		creatorApplydao.createCreatorApply(memberNo, name, email, phone, youtube, africa, facebook, blog, insta, otherSns, applyInfo, originalFileName, storedFileName);
		
		
		//새로운 번호 가져와야함!!
		Integer newApplyNo = creatorApplydao.searchNewApplyId(memberNo);
		
		
		
		//sns 정리해서 올리고
		memberSnsDao.createMemberSns(memberNo, "youtube", youtube);
		memberSnsDao.createMemberSns(memberNo, "facebook", facebook);
		memberSnsDao.createMemberSns(memberNo, "insta", insta);
		memberSnsDao.createMemberSns(memberNo, "blog", blog);
		memberSnsDao.createMemberSns(memberNo, "othersns", otherSns);
		
		
		
		
		
		//장르 정리해서 올리고
		for(String genreStr : genre){
			Integer genreClassNo = getGenreClassNo(genreStr);
			genreDao.createGenre(newApplyNo, memberNo, genreClassNo);
		}
		
		
		
		//관리자에게 메일 보내주기		
		//SendMail mailService = new SendMail();
		System.out.println("메일 보내기!!");

		
		return null;
	}
	
	
	private Integer getGenreClassNo(String genreStr) {
		// TODO Auto-generated method stub
		
		int resNo=0;
		
		switch(genreStr){
		
		case "Pet":
			resNo=1;
			break;
		case "Art":
			resNo=2;
			break;
		case "Animation":
			resNo=3;
			break;
		case "Music":
			resNo=4;
			break;
		case "Destiny Philosophy":
			resNo=5;
			break;
		case "Technology Maker":
			resNo=6;
			break;
		case "Education":
			resNo=7;
			break;
		case "Fashion Beauty":
			resNo=8;
			break;
		case "Sports":
			resNo=9;
			break;
		case "AR/VR/360":
			resNo=10;
			break;
		case "Travel":
			resNo=11;
			break;
		case "Performing Arts":
			resNo=12;
			break;
		default:
			resNo = -1;
		}
		
		return resNo;
	}

	@Override
	public Integer isApplid(Integer memberNo) {
		// TODO Auto-generated method stub
		CreatorApplyDTO dto = creatorApplydao.searchCreatorApplyByMemberNo(memberNo);

		//아직 지원을 안함
		if(dto == null){
			System.out.println("아직 지원 안함");
			return -1;
		}
		else {
			//이미 지원함
			System.out.println("이미 지원함");
			return 1;
		}
	}


	@Override
	public List<CreatorApply> searchAllCreatorApply(Boolean isAccepted) {
		// TODO Auto-generated method stub
		List<CreatorApply> applyList = new ArrayList<CreatorApply>();
		
		
		List<CreatorApplyDTO> cr_dtoList = creatorApplydao.searchCreatorApplyAll();
		List<GenreVDTO> ge_dtoList = creatorApplydao.searchGenreAll();
		List<MemberSnsVDTO> sns_dtoList = creatorApplydao.searchMemberSnsAll();
		
		
		
		for(CreatorApplyDTO dto : cr_dtoList){
			
			if(isAccepted == dto.getIsAccepted()){
				CreatorApply apply = new CreatorApply();
				apply.setApplyInfo(dto.getApplyInfo());
				apply.setApplyNo(dto.getCreatorApplyNo());
				apply.setApplyTime(dto.getApplyTime());
				apply.setEmail(dto.getEmail());
				apply.setIsAccepted(dto.getIsAccepted());
				apply.setMemberNo(dto.getCreatorNo());
				apply.setName(dto.getName());
				apply.setPhoneNum(dto.getPhoneNum());
				apply.setProfileOriginalFileName(dto.getOriginalFileName());
				apply.setProfileStoredFileName(dto.getStoredFileName());
				
				
	
				//장르 세팅
				List<String> genreList = new ArrayList<String>();
				for(GenreVDTO genreDto : ge_dtoList){
					//System.out.println(genreDto + " : " + dto.getCreatorApplyNo());
					if(genreDto.getCreatorApplyNo() == dto.getCreatorApplyNo()){
						genreList.add(genreDto.getGenreClassName());
					//	System.out.println(genreDto.getGenreClassName());
					}
				}
				apply.setGenreList(genreList);
				
				
				//sns 세팅
				//apply.getSnsInfo()
				List<MemberSns> snsInfo = new ArrayList<MemberSns>();
				for(MemberSnsVDTO snsDto : sns_dtoList){
					MemberSns sns = new MemberSns();
					if(snsDto.getMemberNo() == dto.getCreatorNo()){
						sns.setSnsAddr(snsDto.getSnsAddr());
						sns.setSnsName(snsDto.getSnsName());
						snsInfo.add(sns);
					}
				}
				apply.setSnsInfo(snsInfo);
				
				
				applyList.add(apply);
				//System.out.println(apply.toString());
			}
		}
		return applyList;
	}


	@Override
	public Result changeMemberToCreator(Integer memberNo, Integer applyNo) {
		// TODO Auto-generated method stub
		int resCode=0;
		
		
		//멤버 클래스를 크리에이터로 바꾸고
		resCode = mDao.updateMemberToCreator(memberNo);
		if(resCode != 1) return new Result("changeMemberToCreator Fail", false, -1); 
		
		//크리에이터 어플라이를 승인으로 바꿔준다.
		resCode = creatorApplydao.updateApplyAccepted(applyNo);
		if(resCode != 1) return new Result("updateApply Fail", false, -1);
		
		return new Result("changeMemberToCreator Success", true, 1);
	}


	@Override
	public List<Creator> searchCreatorByGenre(String genre) {
		// TODO Auto-generated method stub
		
		
		List<CreatorGenreSnsDTO> dtoList = creatorApplydao.searchCreatorByGenre(genre);
		
		List<Creator> creatorList = new ArrayList<Creator>();
		
		
		Integer tmpCreatorNo = 0;
		//전체 가져온 결과를 순회하며
		for(CreatorGenreSnsDTO dto : dtoList){
			
			//이전 것과 크리에이터 넘버 같은지 체크.
			if(tmpCreatorNo == dto.getCreatorNo()){
				//같으면 같은 새로운 크리에이터 생성 x, 최근 집어넣은 크리에이터에다가 SNS 리스트에 추가 저장.
				creatorList.get(creatorList.size()-1).getSnsList().add(new SNSInfo(dto.getSnsName(), dto.getSnsAddr()));
				
			}else{
				//다르면 새로운 크리에이터 생성 후 크리에이터 리스트에 추가
				Creator creator = new Creator();
				creator.setRegDate(dto.getApplyTime().toString());
				creator.setMemberNo(dto.getCreatorNo());
				
				try {
					creator.setName(URLEncoder.encode(dto.getName(), "UTF-8"));
					creator.setOriginalFileName(URLEncoder.encode(dto.getOriginalFileName(), "UTF-8"));
					creator.setStoredFileName(URLEncoder.encode(dto.getStoredFileName(), "UTF-8"));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				List<SNSInfo> snsList = new ArrayList<SNSInfo>();
				snsList.add(new SNSInfo(dto.getSnsName(), dto.getSnsAddr()));
				creator.setSnsList(snsList);
				
				
				creator.setGenreList(creatorApplydao.searchGenreByMemberNo(dto.getCreatorNo()));
				System.out.println("장르 리스트 : " + creatorApplydao.searchGenreByMemberNo(dto.getCreatorNo()).toString());
				
				creatorList.add(creator);
				System.out.println(creator.toString());
			}
			tmpCreatorNo = dto.getCreatorNo();	
		}
		
		
		//이름, 각 sns 주소, 정보, 사진, 설명
		System.out.println(creatorList.toString());
		
		return creatorList;
	}




}
