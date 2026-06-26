package com.bhuvanesh.sms.notification;

import org.springframework.stereotype.Component;

@Component
public class SmsNotification implements Notification {

	@Override
	public void sendNotification(String message) {
		System.out.println("Msg:"+message);
		
	}

}
