package com.tap.array;
import java.util.Scanner;

public class MinmProductOfPairsInAnArray {
    public static int minProductOfPairs(int[] arr){
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
         int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<firstMin)
            {
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if(arr[i]<secondMin)
            {
                secondMin = arr[i];
            }
            if(arr[i]>firstMax)
            {
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i]>secondMax)
            {
                secondMax = arr[i];
            }
        }
        int prod1 = firstMax * secondMax;
        int prod2 = firstMax * firstMin;
        int prod3 = firstMin * secondMin;

        return Math.min(prod1,Math.min(prod2,prod3));
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // int firstMin,secondMin = firstAndSecondMin(arr); NOT POSSIBLE
        //  Have to consider cases like all positive, all negative and negative and positive....
        int result = minProductOfPairs(arr);
        System.out.print(result);
        sc.close();
        
    }
}