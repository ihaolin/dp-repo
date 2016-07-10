package me.hao0.design.pattern.headfirst.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		
		while(iterator.hasNext()){
			Quackable quacker = iterator.next();
			quacker.quack();
			quacker.notifyObservers();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		
	}

	@Override
	public void notifyObservers() {
		
	}
}
