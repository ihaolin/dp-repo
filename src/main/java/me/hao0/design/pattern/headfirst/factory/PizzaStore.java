package me.hao0.design.pattern.headfirst.factory;

/**
 * Pizza抽象店(抽象工厂)
 * @author haol
 * @since 2013
 * @focus design pattern【factory】
 */
public abstract class PizzaStore {
	
	/**
	 * 预订pizza都是统一的，防止被子类重写
	 * @param type 类型
	 * @return Pizza
	 */
	protected final Pizza orderPizza(String type){
		Pizza p = createPizza(type);
		p.prepare();
		p.cook();
		p.pack();
		return p;
	}
	
	/**
	 * 制作pizza由具体的Pizza店类搞定
	 * @param type
	 * @return
	 */
	protected abstract Pizza createPizza(String type);
}
