package me.hao0.design.pattern.gof.create.abstract_factory2;


/**
 * 生成工厂的工厂(工厂模式)
 */
public class FactoryProducer {
	
	/**
	 * 生成工厂
	 * @param type
	 * @return
	 */
	public static Factory getFactory(String type){
		if (type.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (type.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
