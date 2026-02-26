package com.tap.array;
import java.util.*;

public class SecondLargestElement {

    public static int secondlargestNumber(int[] arr) {
        // write your code here
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
            {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest)
            {
                secondLargest = arr[i];
            }
            
		}
        return secondLargest; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		System.out.println(secondlargestNumber(ar));
		scan.close();
        
    }
}