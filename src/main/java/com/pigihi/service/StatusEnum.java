/**
 * 
 */
package com.pigihi.service;

/**
 * Enum for status of sending email
 * 
 * @author Ashish Sam T George
 *
 */
public enum StatusEnum {
	
	//TODO Find a good way to represent status codes
	
	SUCCESS(134),
	FAILED(136);
	
	public int statusCode;
	
	StatusEnum(int statusCode) {
		this.statusCode = statusCode;
	}

}
