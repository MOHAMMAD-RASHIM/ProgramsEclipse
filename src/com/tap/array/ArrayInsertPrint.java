package com.tap.array;

import java.util.Scanner;

public class ArrayInsertPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		// Output
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		scanner.close();

	}

}
