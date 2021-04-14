package com.corejava.training.Multithreading;

public class ThreadDemoOne {

	public static void main(String[] args) {
	System.out.println("Main Starts");
		
	MyThread mt = new MyThread();
	mt.start();
	
	for(int i =0;i<50;i++)
	{
		System.out.println(Thread.currentThread().getName()+ ": "+ i);
	}

	System.out.println("Main Ends");
	}

}

class MyThread extends Thread
{
	public void run()
	{
		for(int i =0;i<50;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
		}
	}
}
