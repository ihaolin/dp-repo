package me.hao0.design.pattern.headfirst.state;

public class SolidState implements State {
	private GumballMachine gumballMachine;
	
	public SolidState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		this.gumballMachine.setCurState(this.gumballMachine.getSoldOutState());
	}

	@Override
	public void turnCrank() {
		this.gumballMachine.setCurState(this.gumballMachine.getSoldOutState());
	}
}
