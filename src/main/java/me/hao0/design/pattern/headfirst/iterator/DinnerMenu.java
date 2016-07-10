package me.hao0.design.pattern.headfirst.iterator;

public class DinnerMenu {
	private static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] items;
	
	public DinnerMenu(MenuItem[] items){
		this.items = items;
	}
	
	public void addItem(){
		
	}
	
	public Iterator<MenuItem> iterator(){
		return new DinnerMenuIterator(this.items);
	}
}
