package com.tap.array;
import java.util.*;


public class EvenOddNegativeElements {
	
	// Logic
	public static void printNegative(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]<0)
           {
            System.out.print(arr[i]+" ");
           }
        }
    }
    public static void printOddElements(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2!=0 && arr[i]>=0)
           {
            System.out.print(arr[i]+" ");
           }
        }
    }
    public static void printEvenElements(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]%2==0 && arr[i]>=0)
           {
            System.out.print(arr[i]+" ");
           }
        }
    }

	public static void main(String[] args) {
		// To print negative elements, then odd then even elements of an array
		Scanner sc = new Scanner(System.in);
       
		// Input
		
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        // Output
        printNegative(arr);
        System.out.println();
        printOddElements(arr);
        System.out.println();
        printEvenElements(arr);
        
		sc.close();

	}

}
