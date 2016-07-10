package me.hao0.design.pattern.gof.create.abstract_factory2;

public abstract class Color implements Thing{
	abstract void fill();

	@Override
	public void behavior() {
		fill();
	}
}