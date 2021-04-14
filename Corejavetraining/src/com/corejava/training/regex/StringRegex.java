package com.corejava.training.regex;

public class StringRegex {

	public static void main(String[] args) {
		
		String text = "hello~adf~ajfn~dfnkw~fjwkfn";
        
		String result = text.replace('d','&');
		
		System.out.println(result);
		
		String[] result2 = text.split("~");
		for(String s:result2) {
			System.out.println(s);
		}
	}

}
