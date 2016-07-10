package me.hao0.design.pattern.gof.behaviour.template;

/**
 * 模版模式，由父类定义模版(抽象方法), 具体子类实现
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}