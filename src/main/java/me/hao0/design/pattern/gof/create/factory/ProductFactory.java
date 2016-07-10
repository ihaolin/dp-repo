package me.hao0.design.pattern.gof.create.factory;

/**
 * 工厂模式的实现: 封装具体创建模式
 */
public class ProductFactory {

	public static Product produce(int type){
		if (type == 1){
			return new ProductA();
		} else if (type == 2){
			return new ProductB();
		}
		throw new RuntimeException("the factory can't produce this product.");
	}
	
	public interface Product{}
	
	public static class ProductA implements Product{}
	
	public static class ProductB implements Product{}
}
