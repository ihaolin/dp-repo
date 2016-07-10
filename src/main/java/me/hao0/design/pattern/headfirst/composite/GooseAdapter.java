package me.hao0.design.pattern.headfirst.composite;

public class GooseAdapter implements Quackable {
	Goose goose;
	
	public GooseAdapter(Goose goose){
		this.goose = goose;
	}
	
	@Override
	public void quack() {
		goose.honk();
	}

	@Override
	public void registerObserver(Observer observer) {
		
	}

	@Override
	public void notifyObservers() {
		
	}
}
