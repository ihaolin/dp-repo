package me.hao0.design.pattern.headfirst.decorate;

/**
 * 测试咖啡定制
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class Test {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println("点了一杯咖啡");
		
		Beverage condiment = new Mocha(beverage);
		condiment = new Mocha(condiment);
		System.out.println("我要加两份摩卡");
		
		condiment = new Whip(condiment);
		System.out.println("再加一份浓泡");
		
		System.out.println("用料: " + condiment.getDescription());
		System.out.println("总计: " + condiment.cost()+"$");
	}
}
