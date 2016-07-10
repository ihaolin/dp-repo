package me.hao0.design.pattern.headfirst.observer;

/**
 * 观察者接口
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public interface Observer {
	/**
	 * 观察者更新自己
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	void update(float temp, float humidity, float pressure);
}
