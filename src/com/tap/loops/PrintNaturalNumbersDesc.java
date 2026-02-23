package com.tap.loops;
import java.util.Scanner;
public class PrintNaturalNumbersDesc {
	public static void main(String[] args) {
		// This is the code for the printing of natural numbers in descending order
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=N;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		
		scanner.close();
		
	}

}
