package me.hao0.design.pattern.gof.create.singleton;

public class SingletonEagerly {

	// create an object of SingleObject
	private static SingletonEagerly instance = new SingletonEagerly();

	// make the constructor private so that this class cannot be
	// instantiated
	private SingletonEagerly() {
	}

	// Get the only object available
	public static SingletonEagerly getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}