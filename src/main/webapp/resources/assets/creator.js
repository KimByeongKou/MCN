/**
 * 
 */

window.onload = function(){

	//Get the modal
	var creatorModal = document.getElementById('creatorModal');
	
	
	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
	    if (event.target == creatorModal) {
	    	$('#creatorModalClose')[0].click();
	    }
	}
	

	$('.creatorListModal').click(function(){
		var genre = $(this).parent().attr('id');
		var creatorListHtml='';
		
		
		$.ajax({
			  url: './getCreator.do',
	          type: "get",
	          dataType: "text",
	          data : {"genre" : genre},
	          success: function(responseData) {
	        	  var data = JSON.parse(responseData);
	        	  creatorListHtml = creatorListHtml + '<table border="2" cellpadding="0" cellspacing="0" width="920" width="500">';
	        	
	        	  
	        	  
	        	  for(var i = 0; i<data.creatorList.length; i++){
	        		  
	        		  
	        		  creatorListHtml = creatorListHtml + "<tr><td width='12%' rowspan='5'>";
	        		  
	        		  //data.creatorList[i].originalFileName	// 사진 파일 부를 때
	        		  //data.creatorList[i].storedFileName
	        		  
	        		  creatorListHtml = creatorListHtml + "<img src='resources/images/people_logo.png' width='40px' height='50px'/> <br/> 사진/이름</td></tr>"
	        		  creatorListHtml = creatorListHtml + "<tr><td colspan='6'> 정보 : " + data.creatorList[i].regDate + "등록" + "</td></tr>";
	        		  creatorListHtml = creatorListHtml + "<tr><td colspan='6'> 이름 : " + urldecode(data.creatorList[i].name) +"</td></tr>";
	        		  
	        		  //data.creatorList[i].memberNo
	        		  
	        		  creatorListHtml = creatorListHtml + "<tr><td colspan='6'> 장르 : ";
	        		  
	        		  for(var j=0; j<data.creatorList[i].genreList.length; j++){
	        			  creatorListHtml = creatorListHtml + data.creatorList[i].genreList[j] + ", &nbsp";
	        		  }
	        		  
	        		  creatorListHtml = creatorListHtml + "</td></tr>";
	        		  
	        		  
	        		  
	        		  creatorListHtml = creatorListHtml + "<tr>"
	        		  
	        		  for(var j = 0; j<data.creatorList[i].snsList.length; j++){
	        			  creatorListHtml = creatorListHtml + "<td>"
	        			  
	        			  creatorListHtml = creatorListHtml + "<a href='" + data.creatorList[i].snsList[j].snsAddr + "'>";
	        			  
	        			  if(data.creatorList[i].snsList[j].snsName == 'africa'){
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/africa_logo.png' width='100px' height='50px'/>";
	        			  } else if(data.creatorList[i].snsList[j].snsName == 'facebook'){
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/facebook_logo.png' width='100px' height='50px'/>";
	        			  } else if(data.creatorList[i].snsList[j].snsName == 'insta'){
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/insta_logo.png' width='100px' height='50px'/>";
	        			  } else if(data.creatorList[i].snsList[j].snsName == 'blog'){
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/blog_logo.png' width='100px' height='50px'/>";
	        			  } else if(data.creatorList[i].snsList[j].snsName == 'youtube'){
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/youtube_logo.png' width='100px' height='50px'/>";
	        			  } else{
	        				  creatorListHtml = creatorListHtml + "<img src='resources/images/guitar_logo.png' width='100px' height='50px'/>";
	        			  }
	        			  
	        			  
	        			  creatorListHtml = creatorListHtml + "</a>";
	        			  
	        			  creatorListHtml = creatorListHtml + "</td>"
	        		  }
	        		  
	        		  creatorListHtml = creatorListHtml + "</tr>"
	        	  }
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  creatorListHtml = creatorListHtml + '</table>';
	        	  $('#creatorList').html(creatorListHtml);
	          }, error: function(jqXHR, textStatus, errorThrown) {}
        });
		
	});
}



function urldecode (str) {  
	  return decodeURIComponent((str + '').replace(/\+/g, '%20'));  // 공백 문자인 + 를 처리하기 위해 +('%20') 을 공백으로 치환
}


