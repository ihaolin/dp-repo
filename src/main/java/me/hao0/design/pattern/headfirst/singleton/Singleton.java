package me.hao0.design.pattern.headfirst.singleton;

/**
 * 单例对象
 * @author haol
 * @since 2013
 * @focus design pattern【singleton】
 */
public class Singleton {
	/**
	 * volatile tell jvm access variable from memo every time
	 * 这里一定要加volatile，否则这种双重加锁也很有可能出现问题，在于JIT的重排序double_check_lock.png
	 * since jdk1.5
	 */
	private volatile static Singleton instance = null;
	
	private Singleton(){}
	
	/**
	 * lazy instance, should synchronized, it maybe cost much time
	 * @return
	 */
	private static synchronized Singleton getInstance1(){
		if (instance == null) instance = new Singleton();
		return instance;
	}
	
	/**
	 * this only synchronize once
	 * @return
	 */
	public static Singleton getInstance(){
		if (instance == null){
			synchronized (Singleton.class) {
				if (instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
}
