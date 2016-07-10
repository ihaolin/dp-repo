package me.hao0.design.pattern.gof.create.abstract_factory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}