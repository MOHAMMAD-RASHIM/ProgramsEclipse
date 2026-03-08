package com.tap.rearrangeArray;
import java.util.Scanner;
// Rearrange Array with Positive Integers at the Beginning and Negative Integers at the End
public class RearrangeArrayWithNegPos {
    static void reArrangeArray1(int[] arr)
    {
        int[] resArr = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0){
                resArr[j++] = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0){
                resArr[j++] = arr[i];
            }
        }
        for (int i=0;i<resArr.length;i++) {
            System.out.print(resArr[i] + " ");
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
        reArrangeArray1(arr);
        scanner.close();
    }
}