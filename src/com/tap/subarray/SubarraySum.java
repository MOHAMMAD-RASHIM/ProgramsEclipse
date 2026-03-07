package com.tap.subarray;
import java.util.Scanner;

public class SubarraySum {

    static void subarrayOfSize(int[]arr, int size) {
        for(int k=1;k<=arr.length;k++){	// loop for getting various size subarrays
        	// loop for traversing array from the beginning till the end-size value
            for(int i=0;i<=arr.length-k;i++){
            	// loop to get the subarray of size k...
                int sum=0;
                for(int j=i;j<i+k;j++){
                    sum = sum+arr[j];
                }
                if(sum==size){
                    for(int j=i;j<i+k;j++){
                        System.out.print(arr[j]+" ");
                    
                    }
                    System.out.println();
                }
            }
        }

    }
/*
 This is the code for printing various size subarrays whose sum = k i.e the given value
 */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
        int k = scanner.nextInt();
		subarrayOfSize(arr,k);
		scanner.close();
    }
}