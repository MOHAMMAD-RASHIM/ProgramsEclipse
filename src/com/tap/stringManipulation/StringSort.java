package com.tap.stringManipulation;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // Convert string to char array
        char[] arr = str.toCharArray();

        // Bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Convert back to string
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }

        System.out.println(result);

        sc.close();
    }
}