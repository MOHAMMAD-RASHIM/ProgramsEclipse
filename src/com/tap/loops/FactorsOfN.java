package com.tap.loops;
import java.util.Scanner;
public class FactorsOfN {

	public static void main(String[] args) {
		// Code for factors of n
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		
		
		scanner.close();
		
	}

}
