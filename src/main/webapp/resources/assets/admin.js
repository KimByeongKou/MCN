/**
 * 
 */

  
	
  function changeMemberToCreator(){
	  var data = $('#changeButton1').attr('class');
	  var mNo = $('#changeButton1').parent().prev().prev().prev().prev().prev().prev().prev().prev().prev().prev().text();

	  
	  
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
  }
  
  

  window.onload = function(){

	//Get the modal
	var modal = document.getElementById('wrtieNoticeModal');
	var modifyModal = document.getElementById('modifyNoticeModal');
	
	// Get the button that opens the modal
	var btn = document.getElementById("writeNotice");
		
	// Get the <span> element that closes the modal
	var span = document.getElementsByClassName("wrtieNoticeClose")[0];
	var modifySpan = document.getElementsByClassName("modifyNoticeClose")[0];
	
	btn.onclick = function() {
		popupCreatorModal();
		
	}
	
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
  
  
  
  
	  