package me.hao0.design.pattern.headfirst.strategy;

/**
 * 会飞的行为
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can fly.");
	}
}
