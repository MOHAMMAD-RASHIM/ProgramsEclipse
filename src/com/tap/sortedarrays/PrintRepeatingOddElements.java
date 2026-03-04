package com.tap.sortedarrays;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Collections;

public class PrintRepeatingOddElements {
    public static void CommonRepeatingOddElements(int[] arr1,int[] arr2){
        int i=0,j=0;
        boolean found = false;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]==arr2[j] && arr1[i]%2!=0)
            {
                found = true;
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
           
        }

         if(!found){
                System.out.println("No common odd elements found.");
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i] = scanner.nextInt();
        }
        CommonRepeatingOddElements(arr1,arr2);
        scanner.close();    }
}