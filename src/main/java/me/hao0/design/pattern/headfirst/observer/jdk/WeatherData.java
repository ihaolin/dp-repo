package me.hao0.design.pattern.headfirst.observer.jdk;

import java.util.Observable;

/**
 * 通过java內置的Observable
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){}
	
	public void measurementsChanged(){
		setChanged();
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
	//observers can pull data from subject
	//getter.
	
	public float getTemperature() {
		return temperature;
	}


	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
}
