package com.virtusa.singleton;

public class Synchronized {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Example e =Example.getInstance();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Example e =Example.getInstance();
				
			}
		});
		t1.start();
		t2.start();
	}
	
}
class Example
{
	static Example example;
	
	private Example()
	{
		System.out.println("Synchronized Singleton");
	}
	public static synchronized Example getInstance()
	{
		if(example==null)
		{
			example= new Example();
		}
		return example;
	}
}