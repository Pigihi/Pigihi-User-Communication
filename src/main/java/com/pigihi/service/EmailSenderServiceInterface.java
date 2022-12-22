/**
 * 
 */
package com.pigihi.service;

/**
 * 
 * 
 * @author Ashish Sam T George
 *
 */
public interface EmailSenderServiceInterface {

	String sendEmail(String receiver, String subject, String body);

}
