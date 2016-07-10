package me.hao0.design.pattern.headfirst.composite;

public class RedheadDuck implements Quackable {
	private Observable observable;
	
	public RedheadDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Quack");
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
