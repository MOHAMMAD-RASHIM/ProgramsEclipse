package com.tap.sortedarrays;
import java.util.Scanner;

public class UniqueElements {
    public static void countUniqueElements(int[] arr){
        int count = 1;
        int uniqueCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
               
                if (count == 1) {
                    uniqueCount++;
                }
                count = 1;
            }
        }

        if (count == 1) {
            uniqueCount++;
        }

        System.out.print(uniqueCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        countUniqueElements(arr);
        scanner.close();
    }
}