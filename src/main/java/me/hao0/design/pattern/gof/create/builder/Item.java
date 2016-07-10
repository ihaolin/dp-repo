package me.hao0.design.pattern.gof.create.builder;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}