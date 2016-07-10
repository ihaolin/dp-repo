package me.hao0.design.pattern.headfirst.observer.jdk;

public class Test {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		CurrentConditionDisplayer go = new CurrentConditionDisplayer(wd);
		wd.setMeasurements(11f, 22f, 33f);
	}
}
