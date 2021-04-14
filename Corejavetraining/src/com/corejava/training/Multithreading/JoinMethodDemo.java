package com.corejava.training.Multithreading;

public class JoinMethodDemo {

	public static void main(String[] args) {
	System.out.println("Main Starts");
		
	MyThreadB mt = new MyThreadB();//new state
	mt.start();//thread goes to runnable state
	mt.setName("th1");
	try {
		mt.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	MyThreadB mt2 = new MyThreadB();//new state
	mt2.start();//thread goes to runnable state
	mt2.setName("th2");
	for(int i = 10;i<20;i++)
	{
		System.out.println(Thread.currentThread().getName()+ ": "+ i);
	}

	System.out.println("Main Ends");
	}

}

class MyThreadB extends Thread
{
	public void run()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
		}
	}
}
