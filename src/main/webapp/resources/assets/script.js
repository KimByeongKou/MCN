 jQuery(document).ready(function($) {
 
    $(".scroll a, .navbar-brand, .gototop").click(function(event){   
    event.preventDefault();
    $('html,body').animate({scrollTop:$(this.hash).offset().top}, 600,'swing');
    $(".scroll li").removeClass('active');
    $(this).parents('li').toggleClass('active');
    });
});






var wow = new WOW(
  {
    boxClass:     'wowload',      // animated element css class (default is wow)
    animateClass: 'animated', // animation css class (default is animated)
    offset:       0,          // distance to the element when triggering the animation (default is 0)
    mobile:       true,       // trigger animations on mobile devices (default is true)
    live:         true        // act on asynchronously loaded content (default is true)
  }
);
wow.init();




$('.carousel').swipe( {
     swipeLeft: function() {
         $(this).carousel('next');
     },
     swipeRight: function() {
         $(this).carousel('prev');
     },
     allowPageScroll: 'vertical'
 });








//Get the modal
var modal = document.getElementById('beCreatorModal');

// Get the button that opens the modal
var btn = document.getElementById("beCreatorBtn");

// Get the <span> element that closes the modal
var span = document.getElementsByClassName("beCreatorClose")[0];

// When the user clicks the button, open the modal 
/*
btn.onclick = function() {
	alert('${sessionScope.accessToken }');
	
}
*/
function popupCreatorModal(accessToken){
	
	if(accessToken == ''){
		alert("먼저 로그인 해주세요");
	}
	else
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







// This is called with the results from from FB.getLoginStatus().
function statusChangeCallback(response) {
  console.log('statusChangeCallback');
  console.log(response);
  
  // The response object is returned with a status field that lets the
  // app know the current login status of the person.
  // Full docs on the response object can be found in the documentation
  // for FB.getLoginStatus().
  if (response.status === 'connected') {
    // Logged into your app and Facebook.
    testAPI(response);
  } else if (response.status === 'not_authorized') {
    // The person is logged into Facebook, but not your app.
    document.getElementById('loginStatus').innerHTML = 'Please log ' +
      'into this app.';
  } else {
    // The person is not logged into Facebook, so we're not sure if
    // they are logged into this app or not.
    document.getElementById('loginStatus').innerHTML = 'Please log ' +
      'into Facebook.';
  }
}


//This function is called when someone finishes with the Login
// Button.  See the onlogin handler attached to it in the sample
// code below.
var accessToken;
function checkLoginState() {
	
  FB.getLoginStatus(function(response) {
    statusChangeCallback(response);
    
    
  });
  
  
  
}



window.fbAsyncInit = function() {
    FB.init({
      appId      : '1770552643166268',
      cookie     : true,  // enable cookies to allow the server to access // the session
      xfbml      : true,
      version    : 'v2.6'
    });

  };

  
  
  
  
  
  (function(d, s, id){
     var js, fjs = d.getElementsByTagName(s)[0];
     if (d.getElementById(id)) {return;}
     js = d.createElement(s); js.id = id;
     js.src = "//connect.facebook.net/en_US/sdk.js";
     fjs.parentNode.insertBefore(js, fjs);
   }(document, 'script', 'facebook-jssdk'));
  
  
  // Here we run a very simple test of the Graph API after login is
  // successful.  See statusChangeCallback() for when this call is made.
  function testAPI(response) {
	  accessToken = response.authResponse.accessToken;
	  
    console.log('Welcome!  Fetching your information.... ' + accessToken);
    FB.api('/me', function(response) {
      console.log('info!');
      console.log(JSON.stringify(response) +"   " + accessToken);
      
      
      $.ajax({
          url:'/controller/login',
          type:'post',
          data:{"accessToken":accessToken, "userId":response.id, "userName":response.name},
          success:function(data){
        	  var res = data.result;
        	  alert(res);
        	  if(res=='member'){
        		  location.href='/controller';
        	  }else{
        		 location.replace("./admin");
        	  }
        	  
          }
      })
    });
    
    FB.getLoginStatus(function(response) {
  	  if (response.status === 'connected') {
  	    console.log(response.authResponse.accessToken);
  	  }
  	});
  }
  
  
  
  function logout(accessToken, userId, userName){
	  
	  FB.logout(function(response) {
		});
	  $.ajax({
          url:'/controller/logout',
          type:'post',
          data:{"accessToken":accessToken, "userId":userId, "userName":userName},
          success:function(data){
        	  location.href='/controller';
          }
      })
  }
  
  
  
  
  /*
   * 
   * 요기서 jpg 파일만 받을 수 있도록 처리해주어야함!
   * 
   * 
   */
  $(document).ready(function(){
	  $('#imageInput').change(function() { 
		  readURL(this); 
	 }); 
	});
  
  
  function readURL(input) { 
      if (input.files && input.files[0]) { 
          var reader = new FileReader(); //파일을 읽기 위한 FileReader객체 생성 
          reader.onload = function (e) { 
          //파일 읽어들이기를 성공했을때 호출되는 이벤트 핸들러 
              $('#profileImg').attr('src', e.target.result); 
              $('#profileImg').attr('style', "width:100px; height:130px;"); 
          }                    
          reader.readAsDataURL(input.files[0]); 
          //File내용을 읽어 dataURL형식의 문자열로 저장 
      } 
  }
  
  
  
  
 
  
  
  $('#submitBtn').click(function() {
	  var form = document.forms.namedItem("creatorForm"); 
	  var oData = new FormData(form);
	  
	  var $form = $('#creatorForm');
	  var $button = $form.find('button');
	  $button.attr('disabled', true);
	  
	  
	  if(validateCreatorForm()){
		  $.ajax({
	          url: './applyCreator.do',
	          type: "post",
	          dataType: "text",
	          data : oData,
	          processData: false,
	          contentType: false,
	          success: function(responseData) {
	              var data = JSON.parse(responseData);
	              alert(data.result.msg);
	              $button.attr('disabled', false);
	              location.href='/controller';
	          }, error: function(jqXHR, textStatus, errorThrown) {
	        	  $button.attr('disabled', false);
	          }
	      });
	  }else{
		  $button.attr('disabled', false);
	  }
	  
      
      
  });
  
  
  
  
  $(window).load(function(){
	  showNotice();
	  
	  $('#touchBtn').click(function(){
		  
		  $('#touchBtn').attr("disabled", true);
		  
		  
		  var name = $('#touchName').val();
		  var email = $('#touchEmail').val();
		  var phone = $('#touchPhone').val();
		  var message = $('#touchMessage').val();
		  
		  if(validateGetInTouchForm()){
			  $('#touchBtn').text('잠시만 기다려주세요...');
			  $.ajax({
		          url: './getInTouch.do',
		          type: "post",
		          dataType: "text",
		          data : {"name":name, "email":email, "phone":phone, "message":message},
		          success: function(responseData) {
		              var data = JSON.parse(responseData);
		              alert("접수되었습니다. 곧 연락드리도록 하겠습니다.");
		              
		              $('#touchBtn').attr("disabled", false);
		              $('#touchBtn').html('<i class="fa fa-paper-plane"></i> Send');
		          }, error: function(jqXHR, textStatus, errorThrown) {
		        	  $('#touchBtn').attr("disabled", false);
		              $('#touchBtn').html('<i class="fa fa-paper-plane"></i> Send');
		          }
		      });
		  }else{
			  $('#touchBtn').attr("disabled", false);
              $('#touchBtn').html('<i class="fa fa-paper-plane"></i> Send');
		  }
		  
		  
		  
	  });
	  
	  
	  
	  
	});
  
  
  
  
  
  
  var msg = ''; //상태표시줄에 넣을 메세지
  function hideURL() {
  window.status = msg;
  timerID= setTimeout("hideURL()", 0);
  }
  hideURL();
  
  
  
  function showNotice(){
	  
	  var startPage = 1;
	  //노티스 첫페이지
	  $.ajax({
		  url: './showNotice.do',
          type: "get",
          dataType: "text",
          data : {"pageNo" : startPage},
          success: function(responseData) {
              var data = JSON.parse(responseData);
              
              var noticeHtml = "<table id='noticeTable' class='wowload center pure-table'>";
              noticeHtml = noticeHtml + '<thead>';
              noticeHtml = noticeHtml + '<tr>';
        	  
        	  noticeHtml = noticeHtml + '<th>';
        	  noticeHtml = noticeHtml + '글번호';
        	  noticeHtml = noticeHtml + '</th>';
        	  
        	  noticeHtml = noticeHtml + '<th>';
        	  noticeHtml = noticeHtml + '글쓴이';
        	  noticeHtml = noticeHtml + '</th>';
        	  
        	  noticeHtml = noticeHtml + '<th>';
        	  noticeHtml = noticeHtml + '제목';
        	  noticeHtml = noticeHtml + '</th>';
        	  
        	  noticeHtml = noticeHtml + '<th>';
        	  noticeHtml = noticeHtml + '작성일';
        	  noticeHtml = noticeHtml + '</th>';
        	  
        	  noticeHtml = noticeHtml + '<th>';
        	  noticeHtml = noticeHtml + '조회수';
        	  noticeHtml = noticeHtml + '</th>';
        	  
        	  
        	  noticeHtml = noticeHtml + '</tr>';
        	  noticeHtml = noticeHtml + '</thead>';
              
        	  noticeHtml = noticeHtml + '<tbody>';
        	  
        	  
              for(var i = 0; i<data.notiList.length; i++) {
            	  noticeHtml = noticeHtml + '<tr>';
            	  
            	  noticeHtml = noticeHtml + '<th>';
            	  noticeHtml = noticeHtml +  data.notiList[i].noticeNo;
            	  noticeHtml = noticeHtml + '</th>';
            	  
            	  noticeHtml = noticeHtml + '<th>';
            	  noticeHtml = noticeHtml + '관리자';
            	  noticeHtml = noticeHtml + '</th>';
            	  
            	  noticeHtml = noticeHtml + '<th>';
            	  noticeHtml = noticeHtml + "<a class='noticeTitle' onclick = 'popupNoticeModal()'>";
            	  noticeHtml = noticeHtml + urldecode(data.notiList[i].title);
            	  noticeHtml = noticeHtml + '</a>';
            	  noticeHtml = noticeHtml + '</th>';
            	  
            	  noticeHtml = noticeHtml + '<th>';
            	  noticeHtml = noticeHtml + data.notiList[i].writeDate;
            	  noticeHtml = noticeHtml + '</th>';
            	  
            	  noticeHtml = noticeHtml + '<th>';
            	  noticeHtml = noticeHtml + data.notiList[i].readCnt;
            	  noticeHtml = noticeHtml + '</th>';
            	  
            	  
            	  noticeHtml = noticeHtml + '</tr>';
            	  
              }
              noticeHtml = noticeHtml + '</tbody>';
              noticeHtml = noticeHtml + '</table>';
              noticeHtml = noticeHtml + '<br/>';
              
              
              
              for(var i=0; i<data.sumCnt; i++){
            	  noticeHtml = noticeHtml + "<a value='" + (i+1) + "' class='noticePage'>";
            	  if(i==0) 
                	  noticeHtml = noticeHtml + "<strong>";

            	  noticeHtml = noticeHtml + (i+1);
            	  
            	  if(i==0) 
                	  noticeHtml = noticeHtml + "</strong>";
            	  noticeHtml = noticeHtml + '</a>';
            	  noticeHtml = noticeHtml + '&nbsp&nbsp';
            	  
            	  if(i==9) break;
              }
              
              if(data.sumCnt > 9){
            	  noticeHtml = noticeHtml + "<a value='11' class='noticePage'> ▶ </a>";
              }
              
              
              $('#notice').html(noticeHtml);
              
              $('.noticePage').click(function(){
            	 
            	  var pageNo = $(this).attr('value');
            	  
            	  $.ajax({
					  url: './showNotice.do',
			          type: "get",
			          dataType: "text",
			          data : {"pageNo" : pageNo},
			          success: function(responseData) {
			        	  noticeRenew(responseData, pageNo);
			          }, error: function(jqXHR, textStatus, errorThrown) {}
		          });
            	  
              });
              
              
              
              $('.noticeTitle').click(function(){
            	  var noticeNo = $(this).parent().prev().prev().text();
            	  $.ajax({
					  url: './notice.do',
			          type: "get",
			          dataType: "text",
			          data : {"noticeNo" : noticeNo},
			          success: function(responseData) {
			        	 var data = JSON.parse(responseData);
			             var notice = data.notice;
			        	 var noticeOneHtml = "<table id='noticeOneTable' class='center'>";
			        	 noticeOneHtml = noticeOneHtml + '<thead>';
			        	 noticeOneHtml = noticeOneHtml + '<tr>';
			        	
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '글쓴이 : ' + '관리자';
			        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	  
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '날짜 : ' + notice.writeDate;
			        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	  
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '조회수 : '+  notice.readCnt;
			        	 noticeOneHtml = noticeOneHtml + '</th>';
			        	
		        	  
			        	 noticeOneHtml = noticeOneHtml + '</tr>';
			        	 noticeOneHtml = noticeOneHtml + '</thead>';
			        	 
			        	 
			        	 noticeOneHtml = noticeOneHtml + '<tbody>';
			        	 noticeOneHtml = noticeOneHtml + '<tr>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '글번호 : ' + notice.noticeNo;
			        	 noticeOneHtml = noticeOneHtml + '</th>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '제목 : ' + urldecode(notice.title);
			        	 noticeOneHtml = noticeOneHtml + '</th>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '</tr>';
			        	 noticeOneHtml = noticeOneHtml + '</tbody>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '<tfoot>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '<tr>';
			        	 noticeOneHtml = noticeOneHtml + '<th>';
			        	 noticeOneHtml = noticeOneHtml + '내용 : ' + urldecode(notice.noticeInfo);
			        	 noticeOneHtml = noticeOneHtml + '</th>';
			        	 noticeOneHtml = noticeOneHtml + '</tr>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '</tfoot>';
			        	 
			        	 noticeOneHtml = noticeOneHtml + '</table>';
			             
			             $('#noticeOne').html(noticeOneHtml);
			          }, error: function(jqXHR, textStatus, errorThrown) {}
		          });
            	  
              });
              
              
              
          }, error: function(jqXHR, textStatus, errorThrown) {}
      });
  }
  
  
  
  
  function noticeRenew(responseData, pageNo){
	  var data = JSON.parse(responseData);
      
      var noticeHtml = "<table id='noticeTable' class='wowload center pure-table'>";
      noticeHtml = noticeHtml + '<thead>';
      noticeHtml = noticeHtml + '<tr>';
	  
	  noticeHtml = noticeHtml + '<th>';
	  noticeHtml = noticeHtml + '글번호';
	  noticeHtml = noticeHtml + '</th>';
	  
	  noticeHtml = noticeHtml + '<th>';
	  noticeHtml = noticeHtml + '글쓴이';
	  noticeHtml = noticeHtml + '</th>';
	  
	  noticeHtml = noticeHtml + '<th>';
	  noticeHtml = noticeHtml + '제목';
	  noticeHtml = noticeHtml + '</th>';
	  
	  noticeHtml = noticeHtml + '<th>';
	  noticeHtml = noticeHtml + '작성일';
	  noticeHtml = noticeHtml + '</th>';
	  
	  noticeHtml = noticeHtml + '<th>';
	  noticeHtml = noticeHtml + '조회수';
	  noticeHtml = noticeHtml + '</th>';
	  
	  
	  noticeHtml = noticeHtml + '</tr>';
	  noticeHtml = noticeHtml + '</thead>';
      
	  
	  noticeHtml = noticeHtml + '<tbody>';
      for(var i = 0; i<data.notiList.length; i++) {
    	  noticeHtml = noticeHtml + '<tr>';
    	  
    	  noticeHtml = noticeHtml + '<th>';
    	  noticeHtml = noticeHtml +  data.notiList[i].noticeNo;
    	  noticeHtml = noticeHtml + '</th>';
    	  
    	  noticeHtml = noticeHtml + '<th>';
    	  noticeHtml = noticeHtml + '관리자';
    	  noticeHtml = noticeHtml + '</th>';
    	  
    	  noticeHtml = noticeHtml + '<th>';
    	  noticeHtml = noticeHtml + "<a class='noticeTitle' onclick = 'popupNoticeModal()'>";
    	  noticeHtml = noticeHtml + urldecode(data.notiList[i].title);
    	  noticeHtml = noticeHtml + '</a>';
    	  noticeHtml = noticeHtml + '</th>';
    	  
    	  noticeHtml = noticeHtml + '<th>';
    	  noticeHtml = noticeHtml + data.notiList[i].writeDate;
    	  noticeHtml = noticeHtml + '</th>';
    	  
    	  noticeHtml = noticeHtml + '<th>';
    	  noticeHtml = noticeHtml + data.notiList[i].readCnt;
    	  noticeHtml = noticeHtml + '</th>';
    	  
    	  
    	  noticeHtml = noticeHtml + '</tr>';
    	  
      }
      noticeHtml = noticeHtml + '</tbody>';
      noticeHtml = noticeHtml + '</table>';
      
      noticeHtml = noticeHtml + '<br/>';
      
      
      
      
      
      var minPage = (10 * Math.floor(pageNo / 10)) + 1;
      if(pageNo % 10 == 0) minPage = minPage - 10;
      
      if(minPage > 10){
    	  noticeHtml = noticeHtml + "<a value='" + (minPage - 10)+  "' class='noticePage'>◀  </a>";
      }
      
      
      for(var i=minPage; i<=data.sumCnt; i++){
    	  noticeHtml = noticeHtml + "<a value='" + (i) + "' class='noticePage'>";
    	  if(i == pageNo){
        	  noticeHtml = noticeHtml + "<strong>";
		  }
    	  noticeHtml = noticeHtml + (i);
    	 
    	  if(i == pageNo){
        	  noticeHtml = noticeHtml + "</strong>";
		  }
    	  noticeHtml = noticeHtml + '</a>';
    	  noticeHtml = noticeHtml + '&nbsp&nbsp';
		    	  
    	  if(i > minPage + 8) break;
      }
      
      if(data.sumCnt > minPage + 8){
    	  noticeHtml = noticeHtml + "<a value='" + (minPage + 10) + "' class='noticePage'> ▶ </a>";
      }
      
      
      
      $('#notice').html(noticeHtml);
      
      $('.noticePage').click(function(){
    	 
    	  var pageNo = $(this).attr('value');
    	  
    	  $.ajax({
			  url: './showNotice.do',
	          type: "get",
	          dataType: "text",
	          data : {"pageNo" : pageNo},
	          success: function(responseData) {
	        	  noticeRenew(responseData, pageNo);
	          }, error: function(jqXHR, textStatus, errorThrown) {}
          });
      
      });
      
      
      
      $('.noticeTitle').click(function(){
    	  var noticeNo = $(this).parent().prev().prev().text();
    	  $.ajax({
			  url: './notice.do',
	          type: "get",
	          dataType: "text",
	          data : {"noticeNo" : noticeNo},
	          success: function(responseData) {
	        	  var data = JSON.parse(responseData);
		             var notice = data.notice;
		        	 var noticeOneHtml = "<table id='noticeOneTable' class='center'>";
		        	 noticeOneHtml = noticeOneHtml + '<thead>';
		        	 noticeOneHtml = noticeOneHtml + '<tr>';
		        	
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '글쓴이 : ' + '관리자';
		        	 noticeOneHtml = noticeOneHtml + '</th>';
	        	  
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '날짜 : ' + notice.writeDate;
		        	 noticeOneHtml = noticeOneHtml + '</th>';
	        	  
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '조회수 : '+  notice.readCnt;
		        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	
	        	  
		        	 noticeOneHtml = noticeOneHtml + '</tr>';
		        	 noticeOneHtml = noticeOneHtml + '</thead>';
		        	 
		        	 
		        	 noticeOneHtml = noticeOneHtml + '<tbody>';
		        	 noticeOneHtml = noticeOneHtml + '<tr>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '글번호 : ' + notice.noticeNo;
		        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '제목 : ' + urldecode(notice.title);
		        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '</tr>';
		        	 noticeOneHtml = noticeOneHtml + '</tbody>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '<tfoot>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '<tr>';
		        	 noticeOneHtml = noticeOneHtml + '<th>';
		        	 noticeOneHtml = noticeOneHtml + '내용 : ' + urldecode(notice.noticeInfo);
		        	 noticeOneHtml = noticeOneHtml + '</th>';
		        	 noticeOneHtml = noticeOneHtml + '</tr>';
		        	 
		        	 noticeOneHtml = noticeOneHtml + '</tfoot>';
		        	 noticeOneHtml = noticeOneHtml + '</table>';
		             
		             $('#noticeOne').html(noticeOneHtml);
	        	 
	        	 
	          }, error: function(jqXHR, textStatus, errorThrown) {}
          });
      });
      
      
      
     
  }
  
  
  
  
  
  
  //크리에이터 모달 
  //Get the modal
  var modal = document.getElementById('beCreatorModal');

  // Get the button that opens the modal
  var btn = document.getElementById("beCreatorBtn");

  // Get the <span> element that closes the modal
  var span = document.getElementsByClassName("beCreatorClose")[0];

  // When the user clicks the button, open the modal 
  /*
  btn.onclick = function() {
  	alert('${sessionScope.accessToken }');
  	
  }
  */
  
  function popupCreatorModal(accessToken){
  	
  	if(accessToken == ''){
  		alert("먼저 로그인 해주세요");
  	}
  	else
  		modal.style.display = "block";
  }




  // When the user clicks on <span> (x), close the modal
  span.onclick = function() {
      modal.style.display = "none";
      $("form").each(function() {  
          this.reset();  
       });  
  }

  // When the user clicks anywhere outside of the modal, close it
  window.onclick = function(event) {
      if (event.target == modal) {
          modal.style.display = "none";
      }
  }
  //end 크리에이터 모달
  
  
  
  
  
  //노티스 모달
  
  //Get the modal
  var noticeModal = document.getElementById('noticeModal');

  // Get the button that opens the modal
  //var noticeBtn = document.getElementById("noticeBtn");

  // Get the <span> element that closes the modal
  var noticeSpan = document.getElementsByClassName("noticeClose")[0];

  // When the user clicks the button, open the modal 
  /*
  noticeBtn.onclick = function() {
  	popupNoticeModal();
  }
  */
  
  function popupNoticeModal(){
	  noticeModal.style.display = "block";
  }




  // When the user clicks on <span> (x), close the modal
  noticeSpan.onclick = function() {
	  noticeModal.style.display = "none";
	  
  }

  
  // When the user clicks anywhere outside of the modal, close it
  window.onclick = function(event) {
      if (event.target == noticeModal) {
    	  noticeModal.style.display = "none";
    	  
      }
  }
  //end 노티스 모달

  
  
  
  
  
  function urldecode (str) {  
	  return decodeURIComponent((str + '').replace(/\+/g, '%20'));  // 공백 문자인 + 를 처리하기 위해 +('%20') 을 공백으로 치환
  }
  
  
  
  
  
  
  
  