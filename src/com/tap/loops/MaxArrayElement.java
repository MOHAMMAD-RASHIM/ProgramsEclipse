package com.tap.loops;
import java.util.*;
public class MaxArrayElement {

	public static void main(String[] args) {
		// this is the code for the largest element in an array
		Scanner scanner = new Scanner(System.in);
		
		// Input
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		// Logic
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest = arr[i];
			}
		}
	
		// Output
		System.out.println(largest);

	}

}
