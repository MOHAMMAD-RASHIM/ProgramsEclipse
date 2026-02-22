package com.tap.patternprogramming;

public class NumberSquarePattern02 {

	public static void main(String[] args) {
		// This is the code for the below square pattern
//		1 2 3 4 5
//		2 3 4 5 6
//		3 4 5 6 7
//		4 5 6 7 8
//		5 6 7 8 9
		int n=5;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int j=1;j<=n;j++) // for column
			{	
				System.out.print(i+j-1+" ");
			}
			System.out.println();
		}
	}

}
