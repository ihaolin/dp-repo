package me.hao0.design.pattern.headfirst.decorate;

/**
 * 调料基类(被具体调料继承)
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
