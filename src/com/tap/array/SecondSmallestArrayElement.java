package com.tap.array;

import java.util.Scanner;

public class SecondSmallestArrayElement {

    public static int findSecondSmallest(int[] array) {
        // Write your code here
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]<smallest)
            {
                secondSmallest = smallest;
                smallest = array[i];
            }
            else if(array[i]<secondSmallest && array[i]!=smallest)
            {
                secondSmallest = array[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int result = findSecondSmallest(arr);
        System.out.print(result);
        scanner.close();
        
    }
}
