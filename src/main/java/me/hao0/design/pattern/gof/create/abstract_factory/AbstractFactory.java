package me.hao0.design.pattern.gof.create.abstract_factory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
