/**
 * 
 */

/**
 * 크리에이터 지원서의 폼 밸리데이터 함수
 */
function validateCreatorForm(){

	var name = '' + $('#creatorName').val();
	var email = $('#email').val();
	var phone = $('#phone').val();
	var youtubeAddr = $('#youtube').val();
	var africaAddr = $('#africa').val();
	var facebookAddr = $('#facebook').val();
	var instagramAddr = $('#instagram').val();
	var blogAddr = $('#blogAddr').val();
	var otherSns = $('#otherSns').val();
	var message = $('#message').val();
	var valid1 = 0;
	var genreList = document.getElementsByName("creatorGenre");
	
	
	if(name == null || name == '') {
		alert("이름을 입력해주세요");
		return false;
	}else {
		var reg = /^[가-힣]{2,4}$/;
		if(!reg.test(name)) {
			alert("한글 2자 이상 4자 이하의 이름을 입력해주세요");
			return false;
		}
	}
	
	var imgSrc = $('#profileImg').attr('src');
	if(imgSrc == null || imgSrc == '') {
		alert("사진은 필수입니다.");
		return false;
	}
	
	
	
	valid1 = valid1 + valid_email(email);
	valid1 = valid1 +fnPhoneValidation("phone", "핸드폰 번호 형식이 맞지 않습니다.");
	
	if(valid1 != 2) return false;
	
	
	var valid2=0;
	var tmp=0;
	
	tmp = chkUrl2(youtubeAddr, "youtube");
	if(tmp==0) {
		return false;
	}
	valid2 = valid2 + chkUrl2(youtubeAddr, "youtube");
	
	tmp = chkUrl2(youtubeAddr, "afreecatv");
	if(tmp==0) return false;
	valid2 = valid2 + chkUrl2(africaAddr, "afreecatv");
	
	tmp = chkUrl2(youtubeAddr, "facebook");
	if(tmp==0) return false;
	valid2 = valid2 + chkUrl2(facebookAddr, "facebook");
	
	tmp = chkUrl2(youtubeAddr, "instagram");
	if(tmp==0) return false;
	valid2 = valid2 + chkUrl2(instagramAddr, "instagram");
	
	tmp = chkUrl(youtubeAddr, "blog");
	if(tmp==0) return false;
	valid2 = valid2 + chkUrl(blogAddr, "blog");
	
	tmp = chkUrl(youtubeAddr, "otherSns");
	if(tmp==0) return false;
	valid2 = valid2 + chkUrl(otherSns, "otherSns");
	
	if(valid2 == 0) {
		alert("최소 1개 이상의 SNS Addr 를 입력해주세요")
		return false;
	}
	
	
	var cnt=0;
	for(var i = 0; i < genreList.length; i++){
		if(genreList[i].checked) cnt++; 
	}
	
	
	if(cnt == 0){
		alert("최소 1개 이상의 장르를 선택해주세요");
		return false;
	}
	
	return true;
	
};



/**
 * 문의 사항 폼 밸리데이터 함수
 * @returns {Boolean}
 */
function validateGetInTouchForm(){
	var touchName = '' + $('#touchName').val();
	var touchEmail = $('#touchEmail').val();
	var touchPhone = $('#touchPhone').val();
	var touchMsg = $('#touchMessage').val();
	
	
	
	if(touchName == null || touchName == '') {
		alert("이름을 입력해주세요");
		return false;
	}else {
		var reg = /^[가-힣]{2,4}$/;
		if(!reg.test(touchName)) {
			alert("한글 2자 이상 4자 이하의 이름을 입력해주세요");
			return false;
		}
	}
	
	
	if(valid_email(touchEmail)==0){
		return false;
	}
	
	if(fnPhoneValidation("touchPhone", "핸드폰 번호 형식이 맞지 않습니다.")==0){
		return false;
	}
	
	
	if(touchMsg == null || touchMsg == '') {
		alert("메세지를 입력해주세요");
		return false;
	}
	
	return true;
}



//-----------------------------------------------------------------------------------
//
// name : fnPhoneValidation
// params : _obj = object ID Name, _strMessage = Error Message
// description :  Phone Number Validation Check... Show Error Message
// return value : Boolean
//
//-----------------------------------------------------------------------------------
/**
 * 폰 넘버 밸리데이터 함수
 */
function fnPhoneValidation(_objStr, _strMessage)
{
    try {
        var _obj = document.getElementById(_objStr);
       
        if(_obj == null){
            alert("Find is not " + _objStr + " object..");
            return 0;
        }
           
        var chkField = _obj.value.trim();
        var chkR = "^0[0-9]{1,3}(\-)?[0-9]{3,4}(\-)?[0-9]{4}$";
       
        if(chkField.search(chkR) == -1){
            _obj.value = "";
            _obj.focus();
            alert(_strMessage);
            return 0;
        }
    }
    catch(ex) {
        alert("fnPhoneValidation ====> " + ex);
        return 0;
    }
   
    return 1;
}




/**
 * 이메일 밸리데이터 함수
 * @param ele	검사하려는 이메일 스트링
 * @returns {Number}	유효성 이상 없을 시 1, 있다면 0
 */
function valid_email(ele) {

	re=/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
	// 위의 조건을 만족하려면 최소 6자 이상이어야 함.

	if(ele.length<6 || !re.test(ele)) {
		alert("메일형식이 맞지 않습니다.\n다시 입력해주세요.\n");
		return 0;
	} else {
		return 1;
	}

	
}

/**
 * url 기본 형식 검사 함수 
 * @param url			검사하려는 url 스트링
 * @param snsName		sns 이름
 * @returns {Number}	검사 여부
 */
function chkUrl(url, snsName){
	
	if(url == '' || url == null){
		return 0;
	}
	re =/^(file|gopher|news|nntp|telnet|https?|ftps?|sftp):\/\/([a-z0-9-]+\.)+[a-z0-9]{2,4}.*$/;
	
	if(!re.test(url)) {
		alert(snsName + "URL 형식이 맞지 않습니다.\n다시 입력해주세요.\n");
		return 0;
	} else {
		return 1;
	}
}



/**
 * sns addr url 형식 검사 함수 
 * @param url
 * @param snsName
 * @returns {Number}
 */
function chkUrl2(url, snsName){
	
	if(url == '' || url == null){
		return 0;
	}
	
	var checkUrl = 'http://www.' + snsName + ".com/";
	var checkUrl2 = 'https://www.' + snsName + ".com/";
	
	if(url.indexOf(checkUrl)==0 || url.indexOf(checkUrl2)==0){
		alert('옳은 형식' + snsName);
		return 1;
	}else{
		alert(snsName + "URL 형식이 맞지 않습니다.\n다시 입력해주세요.\n");
		return 0;
	}
}

