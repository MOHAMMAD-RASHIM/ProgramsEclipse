package com.tap.loops;
import java.util.Scanner;

public class PrintNaturalNumbers {

	public static void main(String[] args) {
		// This is the code to print the natural numbers from 1 to N
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1;i<=N;i++)
		{
			System.out.print(i+" ");
		}
		scanner.close();
	}

}
