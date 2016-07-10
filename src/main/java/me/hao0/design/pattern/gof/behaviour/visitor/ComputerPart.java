package me.hao0.design.pattern.gof.behaviour.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}