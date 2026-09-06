package com.tap.array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        k = k % n; // Handle k >= n

        // 1. Reverse entire array
        reverse(arr, 0, n - 1);
        // 2. Reverse first k elements
        reverse(arr, 0, k - 1);
        // 3. Reverse remaining n - k elements
        reverse(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}