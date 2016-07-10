package me.hao0.design.pattern.headfirst.strategy;

/**
 * 吱吱叫
 * @author haol
 * @since 2013
 * @focus design pattern
 */
public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("我会吱吱叫");
	}
}
