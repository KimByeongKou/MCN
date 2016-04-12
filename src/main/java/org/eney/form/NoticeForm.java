package org.eney.form;

import org.slf4j.Logger;

public class NoticeForm {

	private String notiTitle;
	private String notiWriter;
	private String notiInfo;
	
	
	public NoticeForm() {
		super();
		notiTitle = new String();
		notiWriter = new String();
		notiInfo  = new String();
	}
	public NoticeForm(String notiTitle, String notiWriter, String notiInfo) {
		super();
		this.notiTitle = notiTitle;
		this.notiWriter = notiWriter;
		this.notiInfo = notiInfo;
	}
	public String getNotiTitle() {
		return notiTitle;
	}
	public void setNotiTitle(String notiTitle) {
		this.notiTitle = notiTitle;
	}
	public String getNotiWriter() {
		return notiWriter;
	}
	public void setNotiWriter(String notiWriter) {
		this.notiWriter = notiWriter;
	}
	public String getNotiInfo() {
		return notiInfo;
	}
	public void setNotiInfo(String notiInfo) {
		this.notiInfo = notiInfo;
	}
	
	public boolean validate(Logger logger){
		
		
		
		return true;
	}
	
	
}
