package me.hao0.design.pattern.headfirst.strategy;

/**
 * 呱呱叫
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我会呱呱叫");
	}
}
