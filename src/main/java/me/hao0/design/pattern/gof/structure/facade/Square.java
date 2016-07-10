package me.hao0.design.pattern.gof.structure.facade;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}