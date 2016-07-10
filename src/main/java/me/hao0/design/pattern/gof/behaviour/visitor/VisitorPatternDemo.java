package me.hao0.design.pattern.gof.behaviour.visitor;

/**
 * 走访者模式
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
