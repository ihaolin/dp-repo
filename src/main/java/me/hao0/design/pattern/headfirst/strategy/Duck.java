package me.hao0.design.pattern.headfirst.strategy;

/**
 * 鸭子
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void swim(){
		System.out.println("所有鸭子都会游泳.");
	}
	
	public abstract void display();
	
	public void performFly(){
		//委托给行为
		flyBehavior.fly();
	}
	
	public void performQuack(){
		//委托给行为
		quackBehavior.quack();
	}
	
	/**
	 * 可动态改变飞行行为
	 * @param flyBehavior 飞行为接口的实现
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	/**
	 * 可动态改变叫的行为
	 * @param quackBehavior 叫行为接口的实现
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
