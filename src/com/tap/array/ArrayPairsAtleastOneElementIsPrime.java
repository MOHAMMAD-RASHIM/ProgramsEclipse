package com.tap.array;
import java.util.Scanner;

public class ArrayPairsAtleastOneElementIsPrime {
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
         int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
       
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if( isPrime(arr[i]) || isPrime(arr[j]) )
                {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
//        scanner.close();
        
    }
}