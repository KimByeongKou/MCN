package org.eney.domain;

/**
 * json 요청 시, 상태 메세지와 성공 여부, 그리고 요청으로 인해 새로운 id가 필요한 경우에는 newId 정보를 담는 VO 클래스.
 * @author KimByeongKou
 *
 */
public class Result {

	private String msg;				// 요청 시 응답 메세지.
	private Boolean isSuccess;		// 요청 시 성공여부.
	private Integer newId;			// 필요 시 new Id.
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Integer getNewId() {
		return newId;
	}
	public void setNewId(Integer newId) {
		this.newId = newId;
	}
	public Result(String msg, Boolean isSuccess, Integer newId) {
		super();
		this.msg = msg;
		this.isSuccess = isSuccess;
		this.newId = newId;
	}
	public Result() {
		super();
	}
	
	
	
}
