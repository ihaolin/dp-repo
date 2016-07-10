package me.hao0.design.pattern.headfirst.factory;

import java.util.ArrayList;

/**
 * 
 * @author haol
 * @since 2013
 * @focus design pattern【factory】
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	@SuppressWarnings("unchecked")
	ArrayList toppings = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void cook() {
		System.out.println("Cooking " + name);
	}

	public void pack() {
		System.out.println("Packing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append((String )toppings.get(i) + "\n");
		}
		return display.toString();
	}
}
