package me.hao0.design.pattern.headfirst.state;

public class SoldOutState implements State {
	private GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		this.gumballMachine.setCurState(this.gumballMachine.getSolidState());
	}

	@Override
	public void turnCrank() {
		this.gumballMachine.setCurState(this.gumballMachine.getSolidState());
	}
}
