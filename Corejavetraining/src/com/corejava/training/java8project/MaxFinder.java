package com.corejava.training.java8project;
@FunctionalInterface
public interface MaxFinder {

	int max(int a,int b);
	
}

//class MaxFinderImpl implements MaxFinder {
//
//  @Override
//  public int max(int a, int b) {
//      
//      return a>b ? a:b;
//  }
//  
//}