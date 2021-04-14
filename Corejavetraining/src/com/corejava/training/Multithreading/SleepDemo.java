package com.corejava.training.Multithreading;

public class SleepDemo {

	public static void main(String[] args) {
	System.out.println("Main Starts");
		
	MyThreadA mt = new MyThreadA();//new state
	mt.start();//thread goes to runnable state
	
	for(int i =0;i<10;i++)
	{
		System.out.println(Thread.currentThread().getName()+ ": "+ i);
	}

	System.out.println("Main Ends");
	}

}

class MyThreadA extends Thread
{
	public void run()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
