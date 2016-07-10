package me.hao0.design.pattern.headfirst.composite;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
