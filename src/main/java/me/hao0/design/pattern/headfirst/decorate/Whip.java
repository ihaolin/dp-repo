package me.hao0.design.pattern.headfirst.decorate;

/**
 * 浓泡调料(装饰者)
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class Whip extends CondimentDecorator {
	/**
	 * 被包装者引用
	 */
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		//价格等于被包装在内的组件一起的价格
		return .50 + this.beverage.cost();
	}
}
