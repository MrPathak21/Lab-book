package com.corejava.training.Multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
	System.out.println("Main Starts");
		
	MyThread mt1 = new MyThread();
	Thread t1 = new Thread(mt1);
	t1.setName("MyThread-1");
	t1.start();
	
	MyThread mt2 = new MyThread();
	Thread t2 = new Thread(mt2,"MyThread-2");
	t2.start();
	
	for(int i =0;i<50;i++)
	{
		System.out.println(Thread.currentThread().getName()+ ": "+ i);
	}

	System.out.println("Main Ends");
	}

}

class MyNewThread implements Runnable
{
	public void run()
	{
		for(int i =0;i<50;i++)
		{
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
		}
	}
}
