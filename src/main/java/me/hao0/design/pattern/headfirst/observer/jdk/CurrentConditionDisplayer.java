package me.hao0.design.pattern.headfirst.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplayer implements Observer,DisplayElement {
	private Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplayer(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			System.out.println("Subject occur changed!");
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("更新显示。");
	}
}
