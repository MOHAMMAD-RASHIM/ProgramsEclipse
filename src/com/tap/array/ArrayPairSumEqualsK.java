package com.tap.array;

import java.util.Scanner;

public class ArrayPairSumEqualsK {

	public static void main(String[] args) {
		// code for the array pairs where sum == k
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                	System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        scanner.close();
	}

}
