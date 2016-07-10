package me.hao0.design.pattern.headfirst.state;

public class GumballMachine {
	private State solidState;
	private State soldOutState;
	int count = 0;
	private State curState = null;
	
	public GumballMachine(int count){
		soldOutState = new SoldOutState(this);
		solidState = new SolidState(this);
		this.count = count;
		if (count > 0){
			curState = soldOutState;
		}
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}

	public State getSolidState() {
		return solidState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}
}
