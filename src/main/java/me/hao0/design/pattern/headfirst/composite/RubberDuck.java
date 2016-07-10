package me.hao0.design.pattern.headfirst.composite;

public class RubberDuck implements Quackable {
	private Observable observable;
	
	public RubberDuck(){
		observable = new Observable(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Kwak");
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
