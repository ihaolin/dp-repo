package me.hao0.design.pattern.gof.structure.facade;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}