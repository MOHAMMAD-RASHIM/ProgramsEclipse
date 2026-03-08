package com.tap.rearrangeArray;
import java.util.Scanner;
// Rearrange Array with -1 at the End

public class RearrangeArrayWithKAtLast {
    public static void reArrangeArray1(int[] arr, int k)
    {
        int i=0,j=0;
        while(i<arr.length)
        {
            if(arr[i]==k)
            {
                i++;
            }
            else
            {
                arr[j] = arr[i];
                i++;
                j++;
            }
        }
        while(j<arr.length)
        {
            arr[j++] = k;
        }
        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int k=-1;
        reArrangeArray1(arr,k);
        scanner.close();
    }
}
