package com.tap.patternprogramming;

public class EquilateralTrianglePattern {

	public static void main(String[] args) {
		// This is the code for below pattern
//				*
//			   * *
//			  * * *
//			 * * * *
//			* * * * *

		// NOTE: This is similar to the mirrored right triangle pattern , only a space is a difference
		int n=5;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int k=1;k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) // for column
			{	
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
