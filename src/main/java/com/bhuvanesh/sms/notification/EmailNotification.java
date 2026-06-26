package com.bhuvanesh.sms.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class EmailNotification implements Notification{

	@Override
	public void sendNotification(String message) {
		System.out.println("Email:"+message);
	}

}
