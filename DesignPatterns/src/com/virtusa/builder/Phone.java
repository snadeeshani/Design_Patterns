package com.virtusa.builder;

public class Phone {

	private String os;
	private int ram;
	private int processor;
	private String brand;
	private double price;
	
	public Phone(String os, int ram, int processor, String brand, double price) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", brand=" + brand + ", price=" + price
				+ "]";
	}
	
	
	
	
}
