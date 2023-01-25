/**
 * 
 */
package com.pigihi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Implementation class of Email sender service interface
 * 
 * @author Ashish Sam T George
 *
 */
@Service
public class EmailSenderServiceImpl implements EmailSenderServiceInterface {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	/**
	 * Handles sending emails
	 * 
	 * @param receiver String representing email address of receiver
	 * @param subject String representing subject of the email
	 * @param body String representing body of the email
	 * 
	 */
	@Override
	public StatusEnum sendEmail(String receiver, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		//TODO Take this from files like .env or .yml
		message.setFrom("cloudstoreaggregation@gmail.com");
		message.setTo(receiver);
		message.setSubject(subject);
		message.setText(body);
		javaMailSender.send(message);
		System.out.println("Mail Sent...");
		//TODO Return something more standard
//		return "Success";
		return StatusEnum.SUCCESS;
		
	}

}
