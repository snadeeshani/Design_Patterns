package com.virtusa.builder;

public class Shop {

	public static void main(String[] args) {
		
		Phone phone= new PhoneBuilder().setBrand("Apple").setPrice(1000.50).getPhone();
		System.out.println(phone);
	}
}
