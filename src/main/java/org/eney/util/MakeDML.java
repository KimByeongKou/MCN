package org.eney.util;

import java.io.FileOutputStream;

public class MakeDML {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\eney-pc3\\Desktop\\out.txt");
		
		String sql;
		
		//멤버 추가
		for(int i=1; i<100; i++) {
			sql = "insert into tbl_member (m_name, m_user_id, m_access_token)" + " values (\'"+ "테스트이름" + i + "\'," + i + ", 1);\n";
			
			output.write(sql.getBytes());
        }
		
		
		//노티스 추가
		for(int i=1; i<400; i++) {
			sql = "insert into tbl_notice(noti_writer_no, noti_title, noti_notice_info)"
			+ "values (1, 'helloㅇ 안녕', '어ㅏㅇㅁ나ㅓ유마늉');\n";

			output.write(sql.getBytes());
        }
		
		
		//장르 클래스 추가
		String[] genre = {"pet", "art", "animation", "music", "destiny philosophy", "technology maker",
				"education", "fashion beauty", "sports", "ar/vr/360", "travel", "performing arts"};
		
		
		sql="";
		for(int i=0; i<12; i++) {
			sql = "insert into tbl_genre_class (genre_class_name) values (\'" + genre[i] + "\');\n";
			output.write(sql.getBytes());
        }
		
		
		//크리에이터 어플라이 2명씩 건너서
		for(int i=1; i<100; i+=2) {
			sql = "insert into tbl_creator_apply (cr_creator_no, cr_name, cr_email, cr_phone_num, cr_apply_info, cr_original_file_name, cr_stored_file_name)"
					+ "values (" + i +  ", \'크리에이터 지원이름\'," + "\'지원" + i + "@이메일.com\',"  +  "\'010-3333-0000\', \'테스트 어플라이 내용\', \'원본 파일 이름', '저장 파일 이름\');\n";
					
			output.write(sql.getBytes());
		}
		
		
		//장르
		for(int i=1; i<=50; i++) {
			 // 0 ~ 9까지 랜덤 숫자 구하기
            int genreNo = (int) (Math.random() * 12) + 1; 
			sql = "insert into tbl_genre (cr_apply_no, cr_creator_no, genre_class_no) values (" + i + ", " + (2*(i-1)+1) + ", " 
					+ genreNo + ");\n";
			output.write(sql.getBytes());
        }
		
		
		//sns
		for(int i=1; i<=50; i++) {
			sql = "insert into tbl_sns_info (m_member_no, m_sns_name, m_sns_addr)"
					+ "values (" + (2*(i-1)+1) + ", \'youtube\', \'http://www.youtube.com/hello\');\n";
			sql = sql + "insert into tbl_sns_info (m_member_no, m_sns_name, m_sns_addr)"
					+ "values (" + (2*(i-1)+1) + ", \'insta\', \'http://www.youtube.com/hello\');\n";
			sql = sql + "insert into tbl_sns_info (m_member_no, m_sns_name, m_sns_addr)"
					+ "values (" + (2*(i-1)+1) + ", \'facebook\', \'http://www.youtube.com/hello\');\n";
			sql = sql + "insert into tbl_sns_info (m_member_no, m_sns_name, m_sns_addr)"
					+ "values (" + (2*(i-1)+1) + ", \'blog\', \'http://blog.naver.com/hello\');\n";
			sql = sql + "insert into tbl_sns_info (m_member_no, m_sns_name, m_sns_addr)"
					+ "values (" + (2*(i-1)+1) + ", \'othersns\', \'http://www.othersns.com/hello\');\n";
			
			
			
			output.write(sql.getBytes());
       }
		
		
        output.close();
		
	}
}
