package me.hao0.design.pattern.headfirst.factory;

/**
 * 成都店
 * @author haol
 * @since 2013
 * @focus design pattern【factory】
 */
public class CDPizzaStore extends PizzaStore {
	@Override
	protected Pizza createPizza(String type) {
		Pizza p = null;
		if ("cheese".equals(type)){
			p = new CDStyleCheesePizza();
		} else if ("veggie".equals(type)){
			p = new CDStyleVeggiePizza();
		}
		return p;
	}
}
