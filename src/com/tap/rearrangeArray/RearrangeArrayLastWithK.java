package com.tap.rearrangeArray;
import java.util.Scanner;

// This is the code to rearrange the array with -1 at beginning
public class RearrangeArrayLastWithK {
    public static int[] rearrangeArrayWith(int[] arr,int k)
    {
        int i=arr.length-1,j=arr.length-1;
        while(i>=0){
            if(arr[i]==k){
                i--;
            }else{
                arr[j] = arr[i];
                i--;
                j--;
            }
        }
        while(j>=0){
            arr[j] = k;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int[] reArr = rearrangeArrayWith(arr,-1);
        for(int i=0;i<reArr.length;i++){
            System.out.print(reArr[i]+" ");
        }
        scanner.close();
    }
}