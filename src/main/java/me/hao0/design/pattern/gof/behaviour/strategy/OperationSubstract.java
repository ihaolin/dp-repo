package me.hao0.design.pattern.gof.behaviour.strategy;

public class OperationSubstract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}