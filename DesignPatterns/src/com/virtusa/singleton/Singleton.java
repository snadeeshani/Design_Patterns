package com.virtusa.singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
		Demo demo1= Demo.getInstance();
		Demo demo2= Demo.getInstance();
		//Demo demo1= new Demo();
	}

}

class Demo
{
	//Early Instantiate 
	static Demo demo= new Demo();
	
	private Demo()
	{
		System.out.println("Early Instance");
	}
	public static Demo getInstance()
	{
		return demo;
	}
}
