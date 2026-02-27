package com.tap.array;
import java.util.Scanner;

public class PrintRepeatingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < N - 1; i++)
         {
            if (arr[i] == arr[i + 1])
             {
                System.out.print(arr[i] + " ");
                found = true;
                while (i < N - 1 && arr[i] == arr[i + 1]) 
                {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.print(-1);
        }
        scanner.close();
        
    }
}
