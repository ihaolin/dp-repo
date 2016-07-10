package me.hao0.design.pattern.gof.create.singleton;

/**
 * 单例对象
 * @author haol
 * @since 2013
 * @focus design pattern【singleton】
 */
public class SingletonLazily {
	/**
	 * must volatile
	 * volatile tell jvm access variable from memo every time
	 * since jdk1.5
	 */
	private volatile static SingletonLazily instance = null;
	
	private SingletonLazily(){}
	
	/**
	 * this only synchronize once
	 * 这种双重加锁也很有可能出现问题，在于JIT的重排序double_check_lock.png
	 * 所以应该加上
	 * @return
	 */
	public static SingletonLazily getInstance(){
		if (instance == null){
			synchronized (SingletonLazily.class) {
				if (instance == null){
					instance = new SingletonLazily();
				}
			}
		}
		return instance;
	}
}
