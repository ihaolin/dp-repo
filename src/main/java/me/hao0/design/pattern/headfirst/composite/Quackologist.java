package me.hao0.design.pattern.headfirst.composite;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked!");
	}
}
