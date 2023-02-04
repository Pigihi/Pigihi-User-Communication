/**
 * 
 */
package com.pigihi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.pigihi.model.MessageModel;
import com.pigihi.service.EmailSenderServiceInterface;
import com.pigihi.service.StatusEnum;

/**
 * Controller class for sending emails
 * 
 * @author Ashish Sam T George
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/sendEmail")
public class EmailController {
	
	@Autowired
	private EmailSenderServiceInterface emailSenderService;
	
	/**
	 * Handles API request for sending emails
	 * 
	 * @param messageModel
	 * @return JSON string showing the status code
	 * 
	 * @see MessageModel
	 * 
	 * @author Ashish Sam T George
	 * 
	 */
	@PostMapping
	public String sendMail(@RequestBody MessageModel messageModel) {
		
		StatusEnum sendStatus = emailSenderService.sendEmail(messageModel.getEmailSendTo(), 
				messageModel.getEmailSubject(), 
				messageModel.getEmailBody());
		Gson gson = new Gson();
		int statusCode = sendStatus.statusCode;
		String statusResponse = gson.toJson(statusCode);
		return statusResponse;
	}

}
