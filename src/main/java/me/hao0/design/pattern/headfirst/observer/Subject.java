package me.hao0.design.pattern.headfirst.observer;

/**
 * 主题接口
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public interface Subject {
	/**
	 * regist an observer
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	/**
	 * remove an observer
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	/**
	 * notify all observers
	 */
	public void notifyObservers();
}
