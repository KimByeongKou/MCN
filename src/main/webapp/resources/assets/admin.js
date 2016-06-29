/**
 * 
 */

  
/**
 * 멤버를 크리에이터로 바꾸는 ajax 요청 함수
 */
  
  $('.changeButton1').click(function(){
	  var data = $(this).attr('value');
	  var mNo = $(this).parent().prev().prev().prev().prev().prev().prev().prev().prev().prev().prev().text();

	  $.ajax({
		  url: './changeMemberToCreator.do',
	      type: "post",
	      dataType: "text",
	      data : {"applyNo" : data, "memberNo" : mNo},
	      success: function(responseData) {
	          var data = JSON.parse(responseData);
	          alert("요청 성공");
	          
	          location.href="/controller/admin";
	          }, error: function(jqXHR, textStatus, errorThrown) {}
	      });

  });
  
  
  

  /**
   * 페이지 load 시 호출.
   */
  window.onload = function(){

	//Get the modal
	var modal = document.getElementById('wrtieNoticeModal');
	var modifyModal = document.getElementById('modifyNoticeModal');
	
	// Get the button that opens the modal
	var btn = document.getElementById("writeNotice");
		
	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("wrtieNoticeClose")[0];
	var modifySpan = document.getElementsByClassName("modifyNoticeClose")[0];
	
	
	/**
	 * 게시글 쓰기 모달 관련 코드
	 */
	//게시글 쓰기 클릭 이벤트
	btn.onclick = function() {
		popupCreatorModal();	
	}
	
	//게시글 쓰기 모달 나타나는 함수
	function popupCreatorModal(){
		modal.style.display = "block";
	}
	
	// When the user clicks on <span> (x), close the modal
	span.onclick = function() {
	    modal.style.display = "none";
	}
	
	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == modal) {
	        modal.style.display = "none";
	    }
	}

	
	/**
	 * 노티스 수정 모달 관련 이벤트
	 */
	// When the user clicks on <span> (x), close the modal
	modifySpan.onclick = function() {
		modifyModal.style.display = "none";
	}
	
	
	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == modifyModal) {
	    	modifyModal.style.display = "none";
	    }
	}
	
	

	/**
	 * 노티스 삭제 AJAX 요청 함수
	 */
	$('.deleteBtn').click(function(){
		if(confirm("정말 삭제하시겠습니까?")){
			var noticeNo = this.value;
			$.ajax({
			  url: './deleteNotice.do',
	          type: "post",
	          dataType: "text",
	          data : {"noticeNo" : noticeNo},
	          success: function(responseData) {
	              var data = JSON.parse(responseData);
	              alert("요청 성공");
	              location.href="/controller/admin";
	          }, error: function(jqXHR, textStatus, errorThrown) {}
			});
	    }
	    else{
	    	alert("삭제 작업이 취소 되었습니다.")
	    }
	});
	
	
	
	/**
	 * 노티스 수정 모달 팝업 이벤트
	 */
	$('.modifyBtn').click(function(){
		 
		  var noticeNo = this.value;
		  var writer = $(this).parent().prev().prev().prev().prev().prev().prev().text();
		  var regDate = $(this).parent().prev().prev().prev().prev().prev().text();
		  var readCnt = $(this).parent().prev().prev().prev().prev().text();
		  var title = $(this).parent().prev().prev().prev().text();
		  var info = $(this).parent().prev().prev().text();
		  
		  $('#modifyNoticeTitle').val(title);
		  $('#modifyNoticeInfo').val(info);
		  $('#modifyNoticeNo').val(noticeNo);
		  $('#modifyNoticeWriter').val(writer);
		  $('#modifyNoticeDate').val(regDate);
		  $('#modifyNoticeReadCnt').val(readCnt);
		  
		  modifyModal.style.display = "block";
	});
	
	
	
	/**
	 * 노티스 수정 AJAX 요청 함수
	 */
	$('#modifyNoticeBtn').click(function(){
		var modifiedTitle = $('#modifyNoticeTitle').val();
		var modifiedInfo = $('#modifyNoticeInfo').val();
		var noticeNo = $('#modifyNoticeNo').val();
		
		
		$.ajax({
		  url: './modifyNotice.do',
          type: "post",
          dataType: "text",
          data : {"noticeNo" : noticeNo, "modifiedTitle" : modifiedTitle, "modifiedInfo" : modifiedInfo },
          success: function(responseData) {
              var data = JSON.parse(responseData);
              alert("요청 성공");
              location.href="/controller/admin";
              
          }, error: function(jqXHR, textStatus, errorThrown) {}
		});
		
	});
  }

  
  
  /**
   * 노티스 추가 AJAX 요청 함수
   */
  function requestWriteNotice(){
	  var noticeTitle = $('#noticeTitle').val();
	  var noticeInfo = $('#noticeInfo').val();
	  
	  alert(noticeTitle + " \n" + noticeInfo);
	  
	  $.ajax({
		  url: './writeNotice.do',
          type: "post",
          dataType: "text",
          data : {"noticeTitle" : noticeTitle, "noticeInfo" : noticeInfo },
          success: function(responseData) {
              var data = JSON.parse(responseData);
              alert("요청 성공");
              
              location.href="/controller/admin";
          }, error: function(jqXHR, textStatus, errorThrown) {}
      });
  }
  
  
  
  
	  