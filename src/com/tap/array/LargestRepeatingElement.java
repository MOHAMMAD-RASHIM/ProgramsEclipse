package com.tap.array;
import java.util.Scanner;

public class LargestRepeatingElement {
    public static void main(String[] args) {
    	
    	// This is the code for Largest Repeating Element in sorted array 
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        // LOGIC
        int result = -1;
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]==arr[i-1])
            {
                result = arr[i];
                break;
            }
        }
        System.out.print(result);
        
        scanner.close();
        
    }
}