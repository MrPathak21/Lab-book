package com.corejava.training;

public class Sample {

	public static void main(String[] args) {
		int[]i[] = {{1,2},{1},{},{1,2,3}};
		//int j[] = new int[2]{1,2};
		//int k[][] = new int[][] {{1,2,3},{4,5,6}};
		//int l[][] = {{1,2},new int[2]};
		//int m[4] = {1,2,3,4};
		for(int a = 0;a < i.length;a++)
		{     System.out.println();
			for(int b = 0; b< i[a].length;b++)
			{
				System.out.print(i[a][b] + " ");
			}
		}
	}

}
