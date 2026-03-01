package com.tap.array;

import java.util.Scanner;

public class EvenPairs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Write your code here
     int n = scanner.nextInt();
    int[] arr = new int[n];
  
    for(int i=0;i<n;i++)
    {
        arr[i] = scanner.nextInt();
    }
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]%2==0 && arr[j]%2==0){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    scanner.close();
  }
}