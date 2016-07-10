package me.hao0.design.pattern.headfirst.singleton;

public class Test {

	public static void main(String[] args) {
		EnumSingleton.INSTANCE.function1();
		System.out.println(EnumSingleton.INSTANCE.function2());
	}
}
