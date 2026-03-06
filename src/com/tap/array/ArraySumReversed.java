package com.tap.array;
import java.util.Scanner;

class ArraySumReversed {
    public static void evenSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum = sum+arr[i];
            }
        }
        System.out.print(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        // this is the program to find the sum of the reversed array
        /*
         The optimized way is below
         for(int i=arr.length-1;i>=0;i=i-2)
         {
         	sum = sum+arr[i];
         }
         */
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int[] revArr = new int[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            revArr[k++] = arr[i];
        }
        evenSum(revArr);
        scanner.close();    }
}