package me.hao0.design.pattern.headfirst.composite;

public class DuckCall implements Quackable {
	private Observable observable;
	
	public DuckCall(){
		observable = new Observable(this);
	}
	@Override
	public void quack() {
		System.out.println("Squeak");
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}
