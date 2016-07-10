package me.hao0.design.pattern.headfirst.strategy;

/**
 * 绿头鸭
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class MallardDuck extends Duck {
	/**
	 * 这里来定义自己的特定行为 
	 */
	public MallardDuck(){
		this.quackBehavior = new Quack();
		this.flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("我是绿头鸭.");
	}
}
