package me.hao0.design.pattern.headfirst.strategy;

/**
 * 不会飞的
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Oh, I cant't fly!");
	}
}
