package com.virtusa.builder;

public class PhoneBuilder {

	private String os;
	private int ram;
	private int processor;
	private String brand;
	private double price;
	public String getOs() {
		return os;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public PhoneBuilder setProcessor(int processor) {
		this.processor = processor;
		return this;
	}
	
	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public PhoneBuilder setPrice(double price) {
		this.price = price;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(os, ram, processor, brand, price);
	}
	
}
