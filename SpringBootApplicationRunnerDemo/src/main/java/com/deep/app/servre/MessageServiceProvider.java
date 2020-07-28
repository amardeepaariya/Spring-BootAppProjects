package com.deep.app.servre;

import org.springframework.stereotype.Service;

/**
 * @author Amardeep Kumar
 */

@Service
public class MessageServiceProvider {

	public String message(){
		return "Hello Amardeep!!";
	}
}
