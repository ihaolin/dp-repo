package me.hao0.design.pattern.headfirst.decorate;

/**
 * 饮料被装饰者，由具体饮料继承
 * @author haol
 * @since 2013
 * @focus design pattern【】
 */
public abstract class BeverageDecorateder extends Beverage {
	/**
	 * 饮料杯大小
	 */
	protected CupSize size = CupSize.SMALL;
	
	public CupSize getSize(){
		return this.size;
	}
	
	public void setSize(CupSize size){
		this.size = size;
	}
}
