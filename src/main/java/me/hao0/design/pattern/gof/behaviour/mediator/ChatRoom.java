package me.hao0.design.pattern.gof.behaviour.mediator;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName()
				+ "] : " + message);
	}
}