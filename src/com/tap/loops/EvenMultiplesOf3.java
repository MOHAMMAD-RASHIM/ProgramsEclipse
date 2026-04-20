package com.tap.loops;
import java.util.Scanner;

class EvenMultiplesOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(i%3==0 && i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}