package me.hao0.design.pattern.headfirst.singleton;

/**
 * 通过枚举实现单例
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public enum EnumSingleton {
	INSTANCE;
	
	public void function1(){
		System.out.println("枚举单例牛X");
	}
	
	public String function2(){
		return "枚举单例牛B";
	}
}	
