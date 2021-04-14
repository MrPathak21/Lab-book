package com.corejava.training.java8project;

public class RunnableDemo2 {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {

		    @Override
            public void run() {
            
                for(int i=1;i<=10;i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {                        
                        e.printStackTrace();
                    }
                }                
            }
            
        };
        
        Thread t = new Thread(runnable,"Th-A");
        t.start(); 
	}
}
