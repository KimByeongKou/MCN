package org.eney.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {

	
	private String receiverEmail;
	private String senderHost;
	private String senderEmail;
	private String pwd;
	
	public SendMail() {
		super();
	}

	public SendMail(String receiverEmail, String senderHost, String senderEmail, String pwd) {
		super();
		this.receiverEmail = receiverEmail;
		this.senderHost = senderHost;
		this.senderEmail = senderEmail;
		this.pwd = pwd;
	}


	public Integer sendMail(String title, String msg){
		Properties props = new Properties(); 
        props.setProperty("mail.transport.protocol", "smtp"); 
        props.setProperty("mail.host", "smtp."+ this.senderHost +".com"); 	
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.port", "465"); 
        props.put("mail.smtp.socketFactory.port", "465"); 
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); 
        props.put("mail.smtp.socketFactory.fallback", "false"); 
        props.setProperty("mail.smtp.quitwait", "false"); 
         
        
        /**
         * 메일을 보내는 측의 메일 주소와 비밀번호
         */
        Authenticator auth = new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() { 
                return new PasswordAuthentication(senderEmail, pwd); 
            }
        };
    
        Session session = Session.getDefaultInstance(props,auth);
        MimeMessage message = new MimeMessage(session); 
        
        try {
        	//송신자 메일 주소 셋팅
			message.setSender(new InternetAddress(senderEmail));
			
			//메일 제목 셋팅
			message.setSubject(title); 
			 
			//수신자 메일 주소 셋팅
	        message.setRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail)); 
	         
	        Multipart mp = new MimeMultipart();
	        MimeBodyPart mbp1 = new MimeBodyPart();
	        
	        //메일의 내용 셋팅
	        mbp1.setText(msg);
	        mp.addBodyPart(mbp1);
	         
	        message.setContent(mp);
	         
	        Transport.send(message);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		return 0;
	}

	

	public String getReceiverEmail() {
		return receiverEmail;
	}



	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}



	public String getSenderHost() {
		return senderHost;
	}



	public void setSenderHost(String senderHost) {
		this.senderHost = senderHost;
	}



	public String getSenderEmail() {
		return senderEmail;
	}



	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	
	public static void main(String[] areg){
		SendMail mail = new SendMail("anapple63@gmail.com", "gmail", "anapple63@gmail.com", "divine66");
		mail.sendMail("이것은 제목!", "hello Test!");
	}


	
	
}
