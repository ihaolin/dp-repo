package me.hao0.design.pattern.headfirst.adapter;

/**
 * 适配器
 * @author haol
 * @since 2013
 * @focus design pattern【Adapter】
 */
public class Adapter implements NewInterface{
	/**
	 * 旧的接口
	 */
	private OldInterface oldInterface;
	
	public Adapter(OldInterface oldInterface){
		this.oldInterface = oldInterface;
	}
	
	@Override
	public void doSth() {
		//将新接口委托给可复用的旧实现
		oldInterface.doOther();
	}
}
