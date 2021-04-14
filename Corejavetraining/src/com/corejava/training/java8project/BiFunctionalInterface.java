package com.corejava.training.java8project;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class BiFunctionalInterface {
	
public static void main(String[] args) {
        
        Function<String,Integer> fun = s -> s.length();
        
        int length = fun.apply("helloworld");
        
        System.out.println("length: "+length);
        
        Supplier<String> supplier = () -> "Hello Lambda";
        String result1 = supplier.get();
        System.out.println(result1);
        
        // add two numbers and return the result    
        
        BiFunction<Integer,Integer,Integer> biFun = (a,b) -> a+b;
        int sum = biFun.apply(20, 30);
        System.out.println("Sum: "+sum);    

    }

}
