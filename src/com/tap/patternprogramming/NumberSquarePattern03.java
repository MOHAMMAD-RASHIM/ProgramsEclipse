package com.tap.patternprogramming;

public class NumberSquarePattern03 {

	public static void main(String[] args) {
		// This is the code for the below shown pattern
//		01 02 03 04 05
//		06 07 08 09 10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24 25
		
		int n = 5;
		int count = 1;
		for(int i=1;i<=n;i++) // for row
		{	
			for(int j=1;j<=n;j++) // for column
			{	
				if(count<10)
				{
					System.out.print("0");
				}
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

	}

}
