package me.hao0.design.pattern.headfirst.template;

public class Tea extends CaffeineBeverage{

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon.");
	}

	@Override
	public void brew() {
		System.out.println("Steeping the tea.");
	}
}
