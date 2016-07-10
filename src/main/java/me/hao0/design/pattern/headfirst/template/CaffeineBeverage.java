package me.hao0.design.pattern.headfirst.template;

public abstract class CaffeineBeverage {
	
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void addCondiments();

	private void boilWater() {
		System.out.println("Boiling water.");
	}
	
	public abstract void brew();
	
	public void pourInCup(){
		System.out.println("Pouring into cup.");
	}
}
