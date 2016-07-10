package me.hao0.design.pattern.headfirst.observer;

import java.util.ArrayList;

/**
 * 主题实现类
 * 
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void notifyObservers() {
		if (!observers.isEmpty()){
			for (Observer observer : this.observers){
				observer.update(temperature, humidity, pressure);
			}
		}
	}

	@Override
	public synchronized void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public synchronized void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	/**
	 * 当状态变化时调用，并通知所有观察者
	 */
	public void measurementsChanged(){
		notifyObservers();
	}
	
	/**
	 * 主题更新自身状态
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
