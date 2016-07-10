package me.hao0.design.pattern.gof.behaviour.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("视图: 状态已经变化, 视图也应该变化.");
	}
}
