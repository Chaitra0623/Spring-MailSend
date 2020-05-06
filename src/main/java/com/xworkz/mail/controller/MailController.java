package com.xworkz.mail.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mail.service.MailService;

@Component
@RequestMapping("/")
public class MailController {
	private static final Logger logger = Logger.getLogger(MailController.class);

	@Autowired
	private MailService mailService;

	public void setMailService(MailService mailService) {
		this.mailService = mailService;
	}

	public MailController() {
		logger.info(this.getClass().getSimpleName() + "object created");
	}

	@RequestMapping("/sendMail.do")
	public String sendMail(String toMailId, String subject, String body) {
		logger.info("inside sendMail() in MailController......");
		logger.info("Mail id:" + toMailId);
		logger.info("subject:" + subject);
		logger.info("Body:" + body);

		this.mailService.sendMailByEMailId(toMailId, subject, body);
		return "success.jsp";
	}

}
