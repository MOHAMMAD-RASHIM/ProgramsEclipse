package com.tap.sortedarrays;

import java.util.Scanner;

public class NotSortedElement{
    public static int findNotSorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return arr[i];
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
//    	Find the first element in a sorted array that is not in sorting order.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result = findNotSorted(arr);
        System.out.print(result);
        scanner.close();
        
    }
}
