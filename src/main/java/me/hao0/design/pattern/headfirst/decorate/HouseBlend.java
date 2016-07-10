package me.hao0.design.pattern.headfirst.decorate;

/**
 * 混合饮料
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class HouseBlend extends BeverageDecorateder {

	public HouseBlend(){
		this.description = "HouseBlend()";
	}
	
	public HouseBlend(CupSize size){
		this.size = size;
	}
	
	@Override
	public double cost() {
		double cost = .89;
		if (this.getSize() == CupSize.SMALL){
			//cost += 0;
		} else if(this.getSize() == CupSize.MEDIUM){
			cost += 1.0;
		} else{
			cost += 2.0;
		}
		return cost;
	}
}
