package com.xworkz.mail.service;
 
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService{
	private static final Logger logger = Logger.getLogger(MailServiceImpl.class);

	@Autowired
	private JavaMailSender javaMailSender;

	public boolean sendMailByEMailId(String to, String subject, String body) {
		logger.info("inside sendMailByEMailId of MailServiceImpl");
		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);
		try {
			javaMailSender.send(mail);
			return true;
		} catch (MailException e) {
			logger.error(e.getMessage(), e);
		}
		return false;
	}

	

	public void setJavaMailSender(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

}
