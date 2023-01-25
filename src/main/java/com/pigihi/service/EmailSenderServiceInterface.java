/**
 * 
 */
package com.pigihi.service;

/**
 * Interface for sending emails
 * 
 * @author Ashish Sam T George
 *
 */
public interface EmailSenderServiceInterface {

	StatusEnum sendEmail(String receiver, String subject, String body);

}
