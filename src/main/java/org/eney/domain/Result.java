package org.eney.domain;

public class Result {

	private String msg;
	private Boolean isSuccess;
	private String newId;
	
	
	public Result() {
		super();
	}
	public Result(String msg, Boolean isSuccess, String newId) {
		super();
		this.msg = msg;
		this.isSuccess = isSuccess;
		this.newId = newId;
	}
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
	public String getNewId() {
		return newId;
	}
	public void setNewId(String newId) {
		this.newId = newId;
	}
	
}
