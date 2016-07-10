package me.hao0.design.pattern.headfirst.decorate;

/**
 * 摩卡调料
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class Mocha extends CondimentDecorator {
	/**
	 * 被装饰者引用
	 */
	private Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		//价格等于被包装在内的组件一起的价格
		return .20 + this.beverage.cost();
	}
}
