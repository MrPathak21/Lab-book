package com.corejava.Junit.test;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.corejava.Junit.service.DemoService;

class DemoTest {

	@Test
    public void testIsPalindromTrue() {       
        DemoService demoService = new DemoService();
        boolean result = demoService.isPalindrome("abcba");
        assertTrue(result);       
    }
   
    @Test
    public void testIsPalindromFalse() {       
        DemoService demoService = new DemoService();
        boolean result = demoService.isPalindrome("abcbadere");
        assertFalse(result);
    }
    
    @Test
    public void testSortArry() {       
        DemoService demoService = new DemoService();
        int [] actual = demoService.sortArray(new int[] {30,25,10,20});
        assertArrayEquals(new int[] {10,20,25,30},actual);
    }   

    @Test
    public void isPrime()
    {
    	DemoService demoservice = new DemoService();
    	boolean result = demoservice.isPrime(17);
    	assertTrue(result);
    }
    
    @ParameterizedTest
    @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
    void palindromes(String candidate) {
        DemoService demoService = new DemoService();
        assumeTrue(demoService.isPalindrome(candidate));
    }
}
