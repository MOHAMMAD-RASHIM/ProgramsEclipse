package com.tap.patternprogramming;

public class SquarePattern {

	public static void main(String[] args) {
		// this is the code for square pattern
		int n = 5;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int j=1;j<=n;j++) // for column
			{	
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
