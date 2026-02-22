package com.tap.patternprogramming;

public class NumberRightTrianglePattern {

	public static void main(String[] args) {
		// This is the code for below pattern
//		1 
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		int n = 5;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int j=1;j<=i;j++) // for column
			{	
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
