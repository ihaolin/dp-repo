package me.hao0.design.pattern.gof.create.abstract_factory;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}