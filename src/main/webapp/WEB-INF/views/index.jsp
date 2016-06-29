<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Cyrus Studio</title>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">

<!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700' rel='stylesheet' type='text/css'>

<!-- font awesome -->
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

<!-- bootstrap -->
<link rel="stylesheet" href="resources/assets/bootstrap/css/bootstrap.min.css" />

<!-- animate.css -->
<link rel="stylesheet" href="resources/assets/animate/animate.css" />
<link rel="stylesheet" href="resources/assets/animate/set.css" />

<!-- gallery -->
<link rel="stylesheet" href="resources/assets/gallery/blueimp-gallery.min.css">

<!-- favicon -->
<link rel="shortcut icon" href="resources/images/favicon.ico" type="image/x-icon">
<link rel="icon" href="resources/images/favicon.ico" type="image/x-icon">


<link rel="stylesheet" href="resources/assets/style.css">
<link rel="stylesheet" href="resources/assets/creator.css">
</head>


<body>
<div class="topbar animated fadeInLeftBig"></div>


<!-- Header Starts -->
<div id="homeHeader" class="navbar-wrapper">
      <div class="container">
		
        <div class="navbar navbar-default navbar-fixed-top" role="navigation" id="top-nav">
          <div class="container">
          	
            <div class="navbar-header">
              <!-- Logo Starts -->
              <a class="navbar-brand" href="#homeHeader"><img src="resources/images/logo.png" alt="logo"></a>
              <!-- #Logo Ends -->


              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
          
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
            </div>
			<c:if test="${sessionScope.admin eq 'adminPwd'}">
					<a href="/controller/admin"> 관리자 화면 </a>
			</c:if>
			
			
            <!-- Nav Starts -->
            <div class="navbar-collapse  collapse">
            	
              <ul class="nav navbar-nav navbar-right scroll">
                <li class=""><a href="#works">Home</a></li>
				<li ><a href="#noticeDiv">Notice</a></li>
                <li ><a href="#aboutTmp">About</a></li>
                <li ><a href="#partnersTmp">Partners</a></li>
				<li ><a href="#contactUs">ContactUs</a></li>
               
               
               
                <c:if test="${sessionScope.userId eq null}">
                 	<fb:login-button scope="public_profile,email" onlogin="checkLoginState();"></fb:login-button> 	
				</c:if>
				
                <c:if test="${sessionScope.userId ne null}">
                 	<button id="facebookLogout" onclick="logout('${sessionScope.accessToken}', '${sessionScope.userId}', '${sessionScope.userName }');">logout</button>
					<p>${sessionScope.userName} </p>
				</c:if>
              </ul>
            </div>
            </div>
            <!-- #Nav Ends -->
			
          </div>
        </div>

      </div>
    </div>
<!-- #Header Starts -->





<!-- works -->
<div id="works"  class=" clearfix grid"> 

	<!--  PET  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/1.jpg" alt="img01"/>
        <figcaption>
            <h2>Pet</h2>
            <p id="pet">Lily likes to play with crayons and pencils<br/>
            <a class="creatorListModal" href='#creatorModal'  >View More</a></p>  
        </figcaption>
    </figure>
    
    <!--  ART -->
     <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/2.jpg" alt="img01"/>
        <figcaption>
            <h2>ART</h2>
            <p id="art">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    <!--  ANIMATION -->
     <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/3.jpg" alt="img01"/>
        <figcaption>
            <h2>ANIMATION</h2>
            <p id="animation">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    <!--  MUSIC  -->
     <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/4.jpg" alt="img01"/>
        <figcaption>
            <h2>MUSIC</h2>
            <p id="music">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  Destiny Philosophy  -->
     <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/5.jpg" alt="img01"/>
        <figcaption>
            <h2>Destiny Philosophy</h2>
            <p id="destiny philosophy">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
     
     
     <!--  Technology Maker  -->
     <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/6.jpg" alt="img01"/>
        <figcaption>
            <h2>Technology Maker</h2>
            <p id='technology maker'>Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  Education   -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/7.jpg" alt="img01"/>
        <figcaption>
            <h2>Education</h2>
            <p id="education">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  Fashion Beauty  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/8.jpg" alt="img01"/>
        <figcaption>
            <h2>Fashion Beauty</h2>
            <p id="fashion beauty">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal"  href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  Sports  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/9.jpg" alt="img01"/>
        <figcaption>
            <h2>Sports</h2>
            <p id="sports">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  AR/VR/360  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/10.jpg" alt="img01"/>
        <figcaption>
            <h2>AR/VR/360</h2>
            <p id="ar/vr/360">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    
    <!--  Travel  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/11.jpg" alt="img01"/>
        <figcaption>
            <h2>Travel</h2>
            <p id="travel">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    
    <!--  Performing Arts  -->
    <figure class="effect-oscar  wowload fadeInUp">
        <img src="resources/images/portfolio/12.jpg" alt="img01"/>
        <figcaption>
            <h2>Performing Arts</h2>
            <p id="performing arts">Lily likes to play with crayons and pencils<br>
            <a class="creatorListModal" href="#creatorModal">View More</a></p>  
        </figcaption>
    </figure>
    

     
</div>
<!-- works -->









<!--  노티스 블럭  -->
<div id="noticeDiv" class="wowload container spacer ">
	<h2 class="text-center  wowload fadeInUp">공지 사항</h2>
	<p class="text-center  wowload fadeInLeft">공지 사항입니다.</p>
	<div class="row grid team  wowload fadeInUpBig">	
		<div id="notice" class="text-center row grid team  wowload fadeInUpBig"></div>
	</div>
</div>




<div id="aboutTmp"></div>
<br/><br/><br/><br/><br/><br/>




<!-- Cirlce Starts -->
<!--  회사 소개   -->
<div id="about"  class="container spacer about">
<h2 class="text-center wowload fadeInUp">누구나 크리에이터가 되어 세상을 즐겁게 하자. <br/><br/> Be creator and Influencer !!!</h2>  
  <div class="row">
  <div class="col-sm-6 wowload fadeInLeft">
    <h4><i class="fa fa-paint-brush"></i> 회사 소개</h4>
    <p> LACREATOR의  LAC의 즐거울 락, 'LAC'을 만드는 CREATOR'S 공간으로 누구나 크리에이터가 될 수 있습니다. - 우측 지원하기 아이콘	</p>
  </div>
  <div class="col-sm-6 wowload fadeInRight">
  <h4><i class="fa fa-code"></i> 회사소개</h4>
  <p>누구나 개인 또는 기업 홍보를 위해 광고를 제작하여 공유할 수 있습니다. 유익하고 즐거운 광고를 시작해 보세요. - 우측 지원하기 아이콘</p>    
  </div>
  </div>

  <div class="process">
  <h3 class="text-center wowload fadeInUp"> 크리에이터가 되는 과정 </h3>
  <ul class="row text-center list-inline  wowload bounceInUp">
      <li>
            <span style="margin-top: 30px;"><i class="fa fa-history"></i><b>Research</b></span>
        </li>
        <li>
            <span style="margin-top: 30px;"><i class="fa fa-puzzle-piece"></i><b>Plan</b></span>
        </li>
        <li>
            <span style="margin-top: 30px;"><i class="fa fa-database"></i><b>Develop</b></span>
        </li>
        <li>
            <span style="margin-top: 30px;"><i class="fa fa-magic"></i><b>Integration</b></span>
        </li>        
        <li>
            <span style="margin-top: 30px;"><i class="fa fa-cloud-upload"></i><b>Deliver</b></span>
        </li>
    </ul>
  </div>
</div>
<!-- #Cirlce Ends -->



<div id="partnersTmp"></div>
<br/><br/><br/><br/><br/><br/>



<!-- About Starts -->
<div class="highlight-info">
<div class="overlay spacer">
<div class="container">
<div class="row text-center  wowload fadeInDownBig">
  <div class="col-sm-3 col-xs-6">
  <i class="fa fa-smile-o  fa-5x"></i><h4>24 Clients</h4>
  </div>
  <div class="col-sm-3 col-xs-6">
  <i class="fa fa-rocket  fa-5x"></i><h4>75 Projects</h4>
  </div>
  <div class="col-sm-3 col-xs-6">
  <i class="fa fa-cloud-download  fa-5x"></i><h4>454 Downloads</h4>
  </div>
  <div class="col-sm-3 col-xs-6">
  <i class="fa fa-map-marker fa-5x"></i><h4>2 Offices</h4>
  </div>
</div>
</div>
</div>
</div>
<!-- About Ends -->



<div id="partners" class="container spacer ">
	<h2 class="text-center  wowload fadeInUp">광고주 스폰서 쉽, 협력사</h2>
  <div class="clearfix">
    <div class="col-sm-6 partners  wowload fadeInLeft">
         
         <!--  협력사 로고 사진  -->
         <img src="resources/images/hasung_logo.jpg" alt="partners">
         <img src="resources/images/main_logo.png" alt="partners">
         <img src="resources/images/hitai_logo.png" alt="partners">
         <img src="resources/images/eney_logo.png" alt="partners">
         
         
    </div>
    <div class="col-sm-6">

	
    <div id="carousel-testimonials" class="carousel slide testimonails  wowload fadeInRight" data-ride="carousel">
    <div class="carousel-inner">  
      <div class="item active animated bounceInRight row">
      <div class="animated slideInLeft col-xs-2"><img alt="portfolio" src="resources/images/team/1.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p> I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. </p>      
      <span>Angel Smith - <b>eshop Canada</b></span>
      </div>
      </div>
      <div class="item  animated bounceInRight row">
      <div class="animated slideInLeft col-xs-2"><img alt="portfolio" src="resources/images/team/2.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p>No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful.</p>
      <span>John Partic - <b>Crazy Pixel</b></span>
      </div>
      </div>
      <div class="item  animated bounceInRight row">
      <div class="animated slideInLeft  col-xs-2"><img alt="portfolio" src="resources/images/team/3.jpg" width="100" class="img-circle img-responsive"></div>
      <div  class="col-xs-10">
      <p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue.</p>
      <span>Harris David - <b>Jet London</b></span>
      </div>
      </div>
      
	   	
  </div>
		<ol class="carousel-indicators">
	    <li data-target="#carousel-testimonials" data-slide-to="0" class="active"></li>
	    <li data-target="#carousel-testimonials" data-slide-to="1"></li>
	    <li data-target="#carousel-testimonials" data-slide-to="2"></li>
	  	</ol>
   
  </div>



    </div>
  </div>
</div>




<div id="contactUs"></div>
<br/><br/><br/><br/><br/><br/>



<!--Contact Starts-->
<!--  문의 사항  블럭  -->
<div id="contact" class="spacer">
	<div class="container contactform center">
	<h2 class="text-center  wowload fadeInUp">문의사항을 보내주세요. <br/>바로 연락 드리도록 하겠습니다.</h3>
	  <div class="row wowload fadeInLeftBig">      
	      <div class="col-sm-6 col-sm-offset-3 col-xs-12">      
	        <input id="touchName" type="text" placeholder="홍길동">
	        <input id="touchEmail" type="email" placeholder="gildong@gmail.com">
	        <input id="touchPhone" type="tel" placeholder="01x-xxxx-xxxx">
	        <textarea id="touchMessage" rows="5" placeholder="문의사항"></textarea>
	        <button  id="touchBtn" class="btn btn-primary"><i class="fa fa-paper-plane"></i> Send</button>
	      </div>
	  </div>
	</div>
</div>
<!--Contact Ends-->



<!-- Footer Starts -->
<div class="footer text-center spacer">
<p class="wowload flipInX"><a href="#"><i class="fa fa-facebook fa-2x"></i></a> <a href="#"><i class="fa fa-instagram fa-2x"></i></a> <a href="#"><i class="fa fa-twitter fa-2x"></i></a> <a href="#"><i class="fa fa-flickr fa-2x"></i></a> </p>
Copyright 2014 Cyrus Creative Studio. All rights reserved.
</div>


<!-- # Footer Ends -->
<a href="#works" class="gototop "><i class="fa fa-angle-up  fa-3x"></i></a>
<a class="gototop2" id="beCreatorBtn" onclick="popupCreatorModal('${sessionScope.memberNo}')"><img src="resources/images/creator_logo.png" style="width : 80px; height: 80px;"/></a>






<!-- 크리에이터 지원서 모달 -->
<div id="beCreatorModal" class="modal">
  <!-- Modal content -->
  <div class="modal-content">
    <span class="beCreatorClose">close</span>
    <br/>
	<!--  크리에이터 폼 시작  -->
	<form name="formName" id="creatorForm" enctype="multipart/form-data" class="elegant-aero" >
	    
	    <h6>
	    	개인정보 제공 동의서 <br/>
			1.개인정보 수집항목 이름, 이메일, 연락처, 휴대폰, 생년월일, 채널주소, SNS주소 <br/>
			2.개인정보 이용목적 신속하고 원활한 고객상담과 응대를 위한 목적으로만 활용합니다. <br/>
			3.개인정보 보유기간 개인정보 수집 및 이용목적이 달성된 후에는 해당 정보를 지체없이 파기합니다. <br/>
			단, 관계법령의 규정에 의하여 보존할 필요가 있는 경우 회사는 관계법령이 정한 일정한 기간 동안 회원정보를 보관합니다. <br/>

			  - 계약 또는 청약철회 등에 관한 기록: 5년 	<br/>
			  - 대금결제 및 재화 등의 공급에 관한 기록: 5년 <br/>
			  - 소비자의 불만 또는 분쟁처리에 관한 기록: 3년 <br/>
			  - 방문에 관한 기록 : 3개월 <br/>
			  - 보유기간을 이용자에게 미리 고지하거나 개별적으로 이용자의 동의를 받은 경우: 고지하거나 개별 동의한 기간<br/>
	    </h6>
	    
	    <br/><br/>
	    <h1>크리에이터 지원하기
	        <span>아래 내용을 채워주세요.</span>
	    </h1>
	    <label>
	        <span>Your Name :</span>
	        <input id="creatorName" type="text" name="creatorName" placeholder="홍길동" />
	    </label>
	    
	     <label>
	        <span>Your Profile Image :</span>
	        <input  id="imageInput" type="file" name="profileImage"><br>
	       <img id="profileImg"/>
	    </label>
	    
	    <label>
	        <span>Your Email :</span>
	        <input id="email" type="email" name="creatorEmail" placeholder="hongGilDong@gmail.com" />
	    </label>
	    
	    <label>
	        <span>Your Phone :</span>
	        <input id="phone" type="text"  name="creatorPhone" placeholder="01x-xxx(x)-xxxx" />
	    </label>
	    
	    <!--  sns start -->
	    <label>
	        <span>Youtube Addr:</span>
	        <input id="youtube" type="text" name="creatorYoutube" placeholder="https://www.youtube.com/user/xxxxxxx"/>
	    </label>
	    
	    <label>
	        <span>Africa Channel :</span>
	        <input id="africa" type="text"  name="creatorAfrica" placeholder="http://www.afreecatv.com/xxxxxx" />
	    </label>
	    
	    <label>
	        <span>Facebook Addr :</span>
	        <input id="facebook" type="text" name="creatorFacebook" placeholder="https://www.facebook.com/xxxxxx"/>
	    </label>
	    
	    
	    <label>
	        <span>Instagram Addr :</span>
	        <input id="instagram" type="text" name="creatorInstagram" placeholder="https://www.instagram.com/xxxxxx" />
	    </label>
	    
	    <label>
	        <span>Blog Addr :</span>
	        <input id="blog" type="text" name="creatorBlog" placeholder="Naver, Tistory, ......"/>
	    </label>
	    
	    <label>
	        <span>Other Sns Addr :</span>
	        <input id="otherSns" type="text"  name="creatorOtherSns"  placeholder="Other Blog Addr ..."/>
	    </label>
	    
	    <!--  sns end -->
	    <label>
	        <span> Apply Message :</span>
	        <textarea id="message" name="creatorApplyInfo" placeholder="Your Message to Us"></textarea>
	    </label> 
	    
	 	<label>
	 		<span> Genre Selection </span>
		    Pet: <input type="checkbox" name="creatorGenre" value="Pet"  />&nbsp;&nbsp;
			Art: <input type="checkbox" name="creatorGenre" value="Art"  />&nbsp;&nbsp;
			Animation: <input type="checkbox" name="creatorGenre" value="Animation"  />&nbsp;&nbsp;
			Music: <input type="checkbox" name="creatorGenre" value="Music"  />&nbsp;&nbsp;
			Destiny Philosophy: <input type="checkbox" name="creatorGenre" value="Destiny Philosophy"  /> &nbsp;&nbsp;  
			Technology Maker: <input type="checkbox" name="creatorGenre" value="Technology Maker"  />   &nbsp;&nbsp;
			Education: <input type="checkbox" name="creatorGenre" value="Education"  />   &nbsp;&nbsp;
			Fashion Beauty: <input type="checkbox" name="creatorGenre" value="Fashion Beauty"  />   &nbsp;&nbsp;
			Sports: <input type="checkbox" name="creatorGenre" value="Sports"  />   &nbsp;&nbsp;
			AR/VR/360: <input type="checkbox" name="creatorGenre" value="AR/VR/360"  />   &nbsp;&nbsp;
			Travel: <input type="checkbox" name="creatorGenre" value="Travel"  />   &nbsp;&nbsp;
			Performing Arts: <input type="checkbox" name="creatorGenre" value="Performing Arts"  />   &nbsp;&nbsp;
		</label>
		
		
	    <label>
	        <span>&nbsp;</span> 
	        <!-- <input type="submit" class="button" value="Send" />  -->
	        <button type="button"  class="button" id="submitBtn" >Send</button>
	    </label> 
	</form>
  </div>
</div>




<!-- 장르 별  크리에이터  모달 -->
<div id="creatorModal" class="modalDialog">
    <div>	
    	<a id="creatorModalClose" href="#close" title="Close" class="close">X</a>
    	<br/>
    	<div class="pre-scrollable" id="creatorList"></div>
    </div>
</div>


<!-- 노티스 모달 -->
<div id="noticeModal" class="modal">
  <!-- Modal content -->
  <div class="modal-content">
    <span class="noticeClose">close</span>
    <br/>
    <div id="noticeOne">
   </div>
   </div>
</div>
    




<!-- jquery -->
<script src="resources/assets/jquery.js"></script>

<!-- wow script -->
<script src="resources/assets/wow/wow.min.js"></script>


<!-- boostrap -->
<script src="resources/assets/bootstrap/js/bootstrap.js" type="text/javascript" ></script>

<!-- jquery mobile -->
<script src="resources/assets/mobile/touchSwipe.min.js"></script>
<script src="resources/assets/respond/respond.js"></script>

<!-- gallery -->
<script src="resources/assets/gallery/jquery.blueimp-gallery.min.js"></script>

<!-- custom script -->
<script src="resources/assets/script.js"></script>
<script src="resources/assets/creator.js"></script>
<script src="resources/assets/formValidate.js"></script>


</body>
</html>