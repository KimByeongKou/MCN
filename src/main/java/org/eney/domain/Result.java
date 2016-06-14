package org.eney.domain;

public class Result {

	private String msg;
	private Boolean isSuccess;
	private Integer newId;
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
