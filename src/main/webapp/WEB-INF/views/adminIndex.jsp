<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/assets/style.css" rel="stylesheet">
<link href="resources/assets/admin.css" rel="stylesheet">


<script src="//code.jquery.com/jquery.min.js"></script>
<script src="resources/assets/admin.js"></script>




<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:if test="${sessionScope.admin eq 'adminPwd'}">
	<a href="/controller"> 메인 화면으로 </a>
</c:if>

<br/>


<%-- Member --%>
<h3>전체 회원 리스트</h3>
<div class="datagrid">
	<table>
		<thead>
			<tr>
			<th>MemberNo</th>
			<th>Name</th>
			<th>UserId</th>
			<th>Recent Access Token</th>
			<th>RegDate</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${memberList}" var="list">
				<tr>
					<th>${list.memberNo} </th>
					<th>${list.name} </th>
					<th>${list.userId }</th>
					<th>${list.accessToken } </th>
					<th> ${list.regDate } </th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>





<%-- DisApproved --%>
<h3>미승인 크리에이터 리스트</h3>
<div class="datagrid">
	<table>
		<thead>
			<tr>
			<th>ApplyNo</th>
			<th>MemberNo</th>
			<th>Name</th>
			<th>Email</th>
			<th>PhoneNum</th>
			<th>originalFileName</th>
			<th>storedFileName</th>
			<th>genre</th>
			<th>SNS</th>
			<th>ApplyInfo</th>
			<th>ApplyTime</th>
			<th>ChangeButton</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${disApprovalApplyList}" var="list">
				<tr>
					<th>${list.applyNo }</th>
					<th>${list.memberNo } </th>
					<th>${list.name }</th>
					<th>${list.email }</th>
					<th>${list.phoneNum }</th>
					<th>${list.profileOriginalFileName }</th>
					<th>${list.profileStoredFileName } </th>
					<th>
					<c:forEach items="${list.genreList}" var="genre">
						${genre }, 
					</c:forEach>
					</th>
					<th>
					<c:forEach items="${list.snsInfo}" var="sns">
						${sns.snsName } : ${sns.snsAddr } <br/> 
					</c:forEach>
					</th>
					<th>${list.applyInfo }</th>
					<th>${list.applyTime } </th>
					<th><button onclick="changeMemberToCreator()" id="changeButton1" class="${list.applyNo }">체인지</button></th>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</div>





<h3>승인 크리에이터 리스트</h3>
<%-- Approved --%>
<div class="datagrid">
	<table>
		<thead>
			<tr>
			<th>ApplyNo</th>
			<th>MemberNo</th>
			<th>Name</th>
			<th>Email</th>
			<th>PhoneNum</th>
			<th>originalFileName</th>
			<th>storedFileName</th>
			<th>genre</th>
			<th>SNS</th>
			<th>ApplyInfo</th>
			<th>ApplyTime</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${approvalApplyList}" var="list">
				<tr>
					<th>${list.applyNo }</th>
					<th>${list.memberNo } </th>
					<th>${list.name }</th>
					<th>${list.email }</th>
					<th>${list.phoneNum }</th>
					<th>${list.profileOriginalFileName }</th>
					<th>${list.profileStoredFileName } </th>
					<th>
					<c:forEach items="${list.genreList}" var="genre">
						${genre }, 
					</c:forEach>
					</th>
					<th>
					<c:forEach items="${list.snsInfo}" var="sns">
						${sns.snsName } : ${sns.snsAddr } <br/> 
					</c:forEach>
					</th>
					<th>${list.applyInfo }</th>
					<th>${list.applyTime } </th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>




<h3>전체 게시글 리스트</h3>
<button id="writeNotice" onclick="writeNotice()">글쓰기</button> 
<br/><br/><br/>

<%-- Notice --%>
<div class="datagrid">
	<table>
		<thead>
			<tr>
			<th>글번호</th>
			<th>관리자 번호</th>
			<th>글쓴이</th>
			<th>날짜</th>
			<th>조회수</th>
			<th>제목</th>
			<th>내용</th>
			<th>삭제</th>
			<th>수정</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${noticeList}" var="list">
				<tr>
					<th>${list.noticeNo }</th>
					<th>${list.writerId }</th>
					<th>관리자</th>
					<th>${list.writeDate }</th>
					<th>${list.readCnt }</th>
					<th>${list.title }</th>
					<th>${list.noticeInfo }</th>
					<th><button class='deleteBtn' value="${list.noticeNo }">삭제</button></th>
					<th><button class='modifyBtn' value="${list.noticeNo }">수정</button></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>



<!-- 글쓰기 모달 -->
<div id="wrtieNoticeModal" class="modal">
  <!-- Modal content -->
  <div class="modal-content">
    <span class="wrtieNoticeClose">close</span>
    <br/>
    
   	<!-- 글쓰기 폼 --> 
   	<form action="" method="post" class="white-pink">
    <h1>게시판 공지 글쓰기
        <span>공지 사항 쓰기</span>
    </h1>
    <label>
        <span>글 제목 :</span>
        <input id="noticeTitle" type="text" name="noticeTitle" placeholder="제목" />
    </label>
    
    
    <label>
        <span>글 내용 :</span>
        <textarea id="noticeInfo" name="noticeInfo" placeholder="글 내용"></textarea>
    </label> 
    
     <label>
        <span>&nbsp;</span> 
        <input onclick="requestWriteNotice()" type="button" class="button" value="Send" /> 
    </label>    
	</form>
   </div>
</div>




<!-- 글 수정하기 모달 -->
<div id="modifyNoticeModal" class="modal">
  <!-- Modal content -->
  <div class="modal-content">
    <span class="modifyNoticeClose">close</span>
    <br/>
    
	<!-- 글 수정 폼 --> 
   	<form action="" method="post" class="white-pink">
	    <h1>게시판 수정하기
	        <span>공지 수정</span>
	    </h1>
	    
	    <label>
	        <span>글 번호 :</span>
	        <input id="modifyNoticeNo" type="text" readonly="readonly" name="modifyNoticeNo" disabled="disabled" />
	    </label>
	    
	    <label>
	        <span>글쓴이 :</span>
	        <input id="modifyNoticeWriter" type="text" name="modifyNoticeWriter" disabled="disabled" />
	    </label>
	    
	    <label>
	        <span>날짜 :</span>
	        <input id="modifyNoticeDate" type="text" name="modifyNoticeDate" disabled="disabled" />
	    </label>
	    
	    <label>
	        <span>조회수 :</span>
	        <input id="modifyNoticeReadCnt" type="text" name="modifyNoticeReadCnt" disabled="disabled" />
	    </label>
	    
	    <label>
	        <span>글 제목 :</span>
	        <input id="modifyNoticeTitle" type="text" name="noticeTitle" placeholder="제목" />
	    </label>
	    
	    <label>
	        <span>글 내용 :</span>
	        <textarea id="modifyNoticeInfo" name="noticeInfo" placeholder="글 내용"></textarea>
	    </label> 
	    
	     <label>
	        <span>&nbsp;</span> 
	        <input id="modifyNoticeBtn" type="button" class="button" value="Send" /> 
	    </label>    
	
	</form>
   </div>
</div>






<br/>

</body>
</html>