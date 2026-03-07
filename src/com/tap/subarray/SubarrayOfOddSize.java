package com.tap.subarray;
import java.util.Scanner;


// Print all possible subarrays of odd size.
class SubarrayOfOddSize {
    public static void oddSubarrays(int[] arr){
        for(int i=1;i<=arr.length;i=i+2){ 	// loop to print odd size sub arrays
            for(int j=0;j<=arr.length-i;j++){
                for(int k=j;k<j+i;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
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
        oddSubarrays(arr);
        scanner.close();
    }
}