package me.hao0.design.pattern.gof.create.abstract_factory2;

public class ColorFactory implements Factory {

	@Override
	public Thing produce(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (type.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (type.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

}
