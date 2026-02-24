package com.tap.loops;
import java.util.Scanner;
public class MultiplesOfAandBTillN {

	public static void main(String[] args) {
		// This is the code for getting the multiples of a and b till n
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%a==0 || i%b==0)
			{
				System.out.print(i+" ");
			}
		}
		scanner.close();

	}

}
