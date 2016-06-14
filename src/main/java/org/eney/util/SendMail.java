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

	private String adminMail;

	
	public SendMail() {
		super();
	}


	public SendMail(String adminMail) {
		super();
		this.adminMail = adminMail;
	}


	public String getAdminMail() {
		return adminMail;
	}


	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	
	public Integer sendMail(String msg){
		
		Properties props = new Properties(); 
        props.setProperty("mail.transport.protocol", "smtp"); 
        props.setProperty("mail.host", "smtp.gmail.com"); 
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.port", "465"); 
        props.put("mail.smtp.socketFactory.port", "465"); 
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); 
        props.put("mail.smtp.socketFactory.fallback", "false"); 
        props.setProperty("mail.smtp.quitwait", "false"); 
         
        
        Authenticator auth = new Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() { 
                return new PasswordAuthentication("anapple63@gmail.com", "divine66"); 
            }
        };
    
        
        Session session = Session.getDefaultInstance(props,auth);
        MimeMessage message = new MimeMessage(session); 
        try {
			message.setSender(new InternetAddress("anapple63@gmail.com"));
			message.setSubject("test"); 
			 
	        message.setRecipient(Message.RecipientType.TO, new InternetAddress("anapple63@gmail.com")); 
	         
	        Multipart mp = new MimeMultipart();
	        MimeBodyPart mbp1 = new MimeBodyPart();
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
	
	
	
}
