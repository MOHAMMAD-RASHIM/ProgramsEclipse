package com.tap.array;
import java.util.Scanner;

public class ArrayPairWithMinSum {

    public static void main(String[] args) {
    	// optimized approach is same as second largest in an array using only one for loop
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int first = 0;
        int second = 0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum = arr[i]+arr[j];
                if(sum<minSum)
                {
                    minSum = sum;
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.print(first+" "+second);
        scanner.close();
        
    }
}
