package me.hao0.design.pattern.headfirst.factory;

/**
 * 北京店
 * @author haol
 * @since 2013
 * @focus design pattern【factory】
 */
public class BJPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza p = null;
		if ("cheese".equals(type)){
			p = new BJStyleCheesePizza();
		} else if ("veggie".equals(type)){
			p = new BJStyleVeggiePizza();
		}
		return p;
	}
}
