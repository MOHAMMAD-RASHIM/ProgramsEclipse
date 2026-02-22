package com.tap.patternprogramming;

public class HollowEquilateralTrianglePattern {

	public static void main(String[] args) {
		// This is the code for below pattern
//			*
//		   * *
//		  *   *
//		 *     *
//		* * * * *
		int n=5;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int k=1;k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) // for column
			{	
				if(j==1 || j==i || i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
