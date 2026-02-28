package com.tap.array;
import java.util.Scanner;

public class ArrayPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
        scanner.close();
        
    }
}
