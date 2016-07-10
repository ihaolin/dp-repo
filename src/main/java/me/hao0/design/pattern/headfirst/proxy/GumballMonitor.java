package me.hao0.design.pattern.headfirst.proxy;

public class GumballMonitor {
	private GumballMachine machine;
	
	public GumballMonitor(GumballMachine machine){
		this.machine = machine;
	}
	
	public void report(){
		System.out.println("Gumball Machine: "+machine.getLocation());
		System.out.println("Current inventory :"+machine.getCount()+ "gumballs");
	}
}
