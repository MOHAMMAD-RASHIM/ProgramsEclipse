package com.tap.array;
import java.util.Scanner;

public class IndexOfSmallestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        // LOGIC
        int min = findSmallest(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==min)
            {
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }
    public static int findSmallest(int[] arr)
    {
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small)
            {
                small = arr[i];
            }
        }
        return small;
    }
   
}
