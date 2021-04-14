package com.corejava.training.Multithreading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedMethod {

	public static void main(String[] args) {
        MyResource resource = new MyResource();
        
        Thread8 threadOne = new Thread8(resource);
        Thread8 threadTwo = new Thread8(resource);        
        Thread t1 = new Thread(threadOne,"t1");
        Thread t2 = new Thread(threadTwo,"t2");        
        t1.start();
        t2.start();    

	}

}

class Thread8 implements Runnable
{
    private MyResource resource;
    
	public Thread8(MyResource resource) {
		this.resource = resource;
	}

	@Override
	public void run() {
		resource.display();
		
	}
	
}

class MyResource
{
	private List<String> list;
	
	MyResource()
	{
		list = new ArrayList<String>();
		list.add("Java1");
		list.add("Java2");
		list.add("Java3");
		list.add("Java4");
		list.add("Java5");
		list.add("Java6");
	}
	
	synchronized void display() {
		System.out.println(Thread.currentThread().getName()+ "Thread Accessing...");
		
		for(String course : list)
			System.out.println(course + " ");
	}
}