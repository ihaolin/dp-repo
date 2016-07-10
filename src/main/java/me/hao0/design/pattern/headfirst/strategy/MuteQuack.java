package me.hao0.design.pattern.headfirst.strategy;

/**
 * 不会叫
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我不会叫");
	}
}
