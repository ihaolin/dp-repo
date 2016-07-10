package me.hao0.design.pattern.headfirst.decorate;

/**
 * 饮料顶级抽象类
 * @author haol
 * @since 2013
 * @focus design pattern【decorater】
 */
public abstract class Beverage {
	String description = "Unknown beverage";

	public String getDescription() {
		return description;
	}
	
	/**
	 * 费用计算
	 * @return 费用价格
	 */
	public abstract double cost();
}
