package com.corejava.training.regex;
import java.util.regex.*;
public class RegexDemo1 {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("[abcd]");
//		Matcher m = p.matcher("bca");
//		boolean b = m.matches();
//		
//		boolean b2 = Pattern.compile("^s").matcher("fa").matches();

	    boolean b3 = Pattern.matches("[789][0-9]{9}", "9897654321");
	    boolean b2 = Pattern.matches("[amn]{4}", "nnnn");
	    boolean b1 = Pattern.matches("[a-zA-z0-9 ]{6,}", "amn6A chc");
	    System.out.println(b3 + " " + b2 + " " + b1);
	}

}
