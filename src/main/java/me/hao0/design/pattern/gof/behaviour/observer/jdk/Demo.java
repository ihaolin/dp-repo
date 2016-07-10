package me.hao0.design.pattern.gof.behaviour.observer.jdk;

public class Demo {
	public static void main(String[] args) {
		Model m = new Model();
		View v1 = new View();
		View v2 = new View();
		m.addObserver(v1);
		m.addObserver(v2);
		m.changeState();
	}
}
