package me.hao0.design.pattern.headfirst.observer;

/**
 * 具体观察类
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("我要更新我的显示了:"+temperature + humidity);
	}


	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();
	}
}
