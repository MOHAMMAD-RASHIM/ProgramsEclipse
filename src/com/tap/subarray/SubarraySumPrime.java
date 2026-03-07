package com.tap.subarray;
import java.util.Scanner;

// Print all possible subarrays whose sum is prime.
class SubarraySumPrime {
	
    public static void primeSubarray(int[] arr){
        boolean found=false;
        for(int k=1;k<=arr.length;k++){
            for(int i=0;i<=arr.length-k;i++){
                int sum = 0;
                for(int j=i;j<i+k;j++){
                    sum = sum+arr[j];
                }
                if(isPrime(sum)){
                    found = true;
                    for(int j=i;j<i+k;j++){
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
        if(!found){
            System.out.print("None");
        }
    }
    public static boolean isPrime(int num){
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int N = scanner.nextInt();
        int[] arr = new int[N]; 
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        primeSubarray(arr);
        scanner.close();
    }
}