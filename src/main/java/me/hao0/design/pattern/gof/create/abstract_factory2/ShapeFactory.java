package me.hao0.design.pattern.gof.create.abstract_factory2;

public class ShapeFactory implements Factory {

	@Override
	public Shape produce(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (type.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
