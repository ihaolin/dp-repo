package me.hao0.design.pattern.headfirst.decorate;

/**
 * 咖啡
 * @author haol
 * @since 2013
 * @focus design pattern【decorator】
 */
public class Espresso extends BeverageDecorateder {

	public Espresso(){
		this.description = "I am espresso!";
	}
	
	public Espresso(CupSize size){
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
