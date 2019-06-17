package com.virtusa.singleton;

public class EnumInstance {
	public static void main(String[] args) {
		
		EnumDemo enumDemo=EnumDemo.INSTANCE;
		enumDemo.i=10;
		enumDemo.show();
		
		EnumDemo enumDemo2=EnumDemo.INSTANCE;
		enumDemo2.i=11;
		enumDemo.show();
	}

}
enum EnumDemo
{
	INSTANCE;
	int i;
	public void show()
	{
		System.out.println(i);
	}
}