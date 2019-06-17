package com.virtusa.composite;

public class Leaf implements Component{

	String name;
	int price;
	
	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void show() {
		System.out.println(name +":"+ price);
		
	}

}
