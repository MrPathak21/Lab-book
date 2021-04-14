package com.corejava.Junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseDemo {

	 @BeforeAll
	    public static void setUp() {
	        System.out.println("Before All method called");
	    }
	    
	    @AfterAll
	    public static void close() {
	        System.out.println("After All method called");
	    }
	    
	    @BeforeEach
	    public void beforeTestMethod() {
	        System.out.println("before each method");
	    }
	    
	    @AfterEach
	    public void afterEach() {
	        System.out.println("after each method");
	    }
	    
	    @Test
	    public void testMetod() {
	        
	        System.out.println("inside test method");
	        assertTrue(true);
	    }
	    
	    @Test
	    public void testMetod2() {
	        
	        System.out.println("inside test method-2");
	        assertTrue(true);
	    }

}
