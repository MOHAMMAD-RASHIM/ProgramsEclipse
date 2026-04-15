package com.tap.loops;
import java.util.Scanner;

class EvenMultiplesOfNuptoMDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = (m/n)*n;
        for(int i=start;i>=n;i-=n)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}