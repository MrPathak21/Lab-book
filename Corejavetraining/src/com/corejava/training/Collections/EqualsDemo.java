package com.corejava.training.Collections;

public class EqualsDemo {

	public static void main(String[] args) {
		//string comparison
//		String st1 = "raj";
//		String st2 = "sam";
//		
//		if(st1.equals(st2))
//		{
//			System.out.println("Equal");
//		}
//		else
//		{
//			System.out.println("Not Equal");
//		}
	
	   A a1 = new A(20);
	   A a2 = new A(20);
	   
	   if(a1.equals(a2))			//it does not works on objects
	   {
		   System.out.println("Equal");
	   }
	   else
		{
		   System.out.println("Not Equal");
		}
	   
	}

}

class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
}