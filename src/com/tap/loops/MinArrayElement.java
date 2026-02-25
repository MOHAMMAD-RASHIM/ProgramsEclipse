package com.tap.loops;
import java.util.Scanner;

public class MinArrayElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Input
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		// Logic
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
	
		// Output
		System.out.println(smallest);
		
		scanner.close();


	}

}
