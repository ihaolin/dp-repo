package me.hao0.design.pattern.gof.create.abstract_factory2;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {

		// get shape factory
		Factory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Thing cirlce = shapeFactory.produce("CIRCLE");

		// call draw method of Shape Circle
		cirlce.behavior();

		// get an object of Shape Rectangle
		Thing rectangle = shapeFactory.produce("RECTANGLE");

		// call draw method of Shape Rectangle
		rectangle.behavior();

		// get an object of Shape Square
		Thing square = shapeFactory.produce("SQUARE");

		// call draw method of Shape Square
		square.behavior();

		// get color factory
		Factory colorFactory = FactoryProducer.getFactory("COLOR");

		// get an object of Color Red
		Thing red = colorFactory.produce("RED");

		// call fill method of Red
		red.behavior();

		// get an object of Color Green
		Thing green = colorFactory.produce("Green");

		// call fill method of Green
		green.behavior();

		// get an object of Color Blue
		Thing blue = colorFactory.produce("BLUE");

		// call fill method of Color Blue
		blue.behavior();
	}
}
