package org.eney.test;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MailTest {

	
	
	@Test
	public void testSendMail() throws Exception{
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
        message.setSender(new InternetAddress("anapple63@gmail.com")); 
        message.setSubject("test"); 
 
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("anapple63@gmail.com")); 
         
        Multipart mp = new MimeMultipart();
        MimeBodyPart mbp1 = new MimeBodyPart();
        mbp1.setText("Test Contents");
        mp.addBodyPart(mbp1);
         
        message.setContent(mp);
         
        Transport.send(message);
	}
}