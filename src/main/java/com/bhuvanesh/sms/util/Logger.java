package com.bhuvanesh.sms.util;

import org.springframework.stereotype.Component;

@Component
public class Logger {
	public void log(String message) {
		System.out.println("[log]:"+message);
	}

}
