package me.hao0.design.pattern.headfirst.singleton;

/**
 * 单例对象
 * @author haol
 * @since 2013
 * @focus design pattern【singleton】
 */
public class SingletonSafe {
	/**
	 * volatile tell jvm access variable from memo every time
	 * since jdk1.5
	 */
	private volatile static SingletonSafe instance = null;
	
	private SingletonSafe(){}
	
	/**
	 * lazy instance, should synchronized, it maybe cost much time
	 * @return
	 */
	private static synchronized SingletonSafe getInstance1(){
		if (instance == null) instance = new SingletonSafe();
		return instance;
	}
	
	/**
	 * this only synchronize once
	 * 这种双重加锁也很有可能出现问题，在于JIT的重排序double_check_lock.png
	 * @return
	 */
	public static SingletonSafe getInstance(){
		if (instance == null){
			synchronized (SingletonSafe.class) {
				if (instance == null){
					instance = new SingletonSafe();
				}
			}
		}
		return instance;
	}
	
}
