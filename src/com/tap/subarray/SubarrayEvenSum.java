package com.tap.subarray;
import java.util.Scanner;

// Print all possible subarrays whose sum is even.

public class SubarrayEvenSum{
    public static void possibleEvenSumSubarray(int[] arr){
        for(int k=1;k<=arr.length;k++){
            for(int i=0;i<=arr.length-k;i++){
                int sum = 0;
                for(int j=i;j<i+k;j++){
                    sum = sum+arr[j];
                }
                if(sum%2==0){
                    for(int j=i;j<i+k;j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
             
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int N = scanner.nextInt();
        int[] arr = new int[N]; 
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        possibleEvenSumSubarray(arr);
        scanner.close();
    }
}