package me.hao0.design.pattern.gof.behaviour.mediator;

/**
 * 中介者模式：将多个对象的交互通过一个终结者来实现
 */
public class MediatorPatternDemo {
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");

		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}