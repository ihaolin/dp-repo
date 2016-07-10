package me.hao0.design.pattern.gof.behaviour.observer.jdk;

import java.util.Observable;

public class Model extends Observable{
	
	public void changeState(){
		System.out.println("模型: 我要改变状态了.");
		setChanged();
		notifyObservers();
	}
}
