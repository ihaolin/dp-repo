package me.hao0.design.pattern.headfirst.template;

public class Coffee extends CaffeineBeverage {
	
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk.");
	}

	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter.");
	}
}
