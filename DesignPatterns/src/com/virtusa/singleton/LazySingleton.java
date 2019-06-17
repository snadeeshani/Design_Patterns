package com.virtusa.singleton;

public class LazySingleton {
	public static void main(String[] args) {
		Sample s= Sample.getInstance();
		Sample s2= Sample.getInstance();
	}
	

}
class Sample
{
	static Sample sample;
	
	private Sample()
	{
		System.out.println("Lazy Instance");
	}
	
	public static Sample getInstance()
	{
		if(sample==null)
		{
			sample= new Sample();
		}
		return sample;
		
	}
}