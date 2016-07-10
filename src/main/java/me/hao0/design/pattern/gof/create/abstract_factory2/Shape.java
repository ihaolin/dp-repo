package me.hao0.design.pattern.gof.create.abstract_factory2;

/**
 * 形状抽象类
 */
public abstract class Shape implements Thing{
	abstract void draw();

	@Override
	public void behavior() {
		draw();
	}
}
