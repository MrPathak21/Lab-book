package com.corejava.training.java8project;

public class RunnableDemo {

	
	public static void main(String[] args) {

        MyThread mt = new MyThread();
        
        Thread t = new Thread(mt,"Th-A");
        
        t.start();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        
        for(int i=1;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}
