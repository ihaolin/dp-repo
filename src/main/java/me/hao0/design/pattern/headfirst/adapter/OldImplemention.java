package me.hao0.design.pattern.headfirst.adapter;

/**
 * 旧的实现，以前已经做过，要拿去适配新的接口
 * @author haol
 * @since 2013
 * @focus design pattern【Adapter】
 */
public class OldImplemention implements OldInterface{
	public void doOther(){
		System.out.println("I am old implemention.");
	}
}
