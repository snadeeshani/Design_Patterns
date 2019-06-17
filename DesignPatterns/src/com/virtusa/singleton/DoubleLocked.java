package com.virtusa.singleton;

public class DoubleLocked {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				Lock lock= Lock.getInstance();
				
			}
		});
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				Lock lock= Lock.getInstance();
				
			}
		});
		t1.start();
		t2.start();
	}
	
}
class Lock
{
	static Lock lock;
	private Lock()
	{
		System.out.println("Double Locked Singleton");
	}
	public static Lock getInstance()
	{
		if(lock==null)
		{
			synchronized (Lock.class) {
				if (lock==null)
				{
					lock= new Lock();
				}
				
			}
		}
		return lock;
	}
}