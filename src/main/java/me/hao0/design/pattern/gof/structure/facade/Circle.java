package me.hao0.design.pattern.gof.structure.facade;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}