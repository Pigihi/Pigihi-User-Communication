/**
 * 
 */
package com.pigihi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pigihi.model.MessageModel;
import com.pigihi.service.EmailSenderServiceInterface;

/**
 * Controller class for sending emails
 * 
 * @author Ashish Sam T George
 *
 */
@RestController
@RequestMapping("/send")
public class EmailController {
	
	@Autowired
	private EmailSenderServiceInterface emailSenderService;
	
	@PostMapping("email")
	public String sendMail(@RequestBody MessageModel messageModel) {
		
		String sendStatus = emailSenderService.sendEmail(messageModel.getEmailSendTo(), 
				messageModel.getEmailSubject(), 
				messageModel.getEmailBody());
		return sendStatus;
	}

}
