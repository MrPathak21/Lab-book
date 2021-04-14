package com.corejava.training.java8project;

public interface MyInterface {
	public abstract void m1();
	
	default void m2()
	{
		System.out.println("Default method");
	}
	
	public static void m3()
	{
		System.out.println("Static Method");
	}
}

class A implements MyInterface
{

	@Override
	public void m1() {
		System.out.println("Abstract method impl");
	}
	
	@Override
	public void m2()
	{
		System.out.println("Default method impl");
	}
	
}





