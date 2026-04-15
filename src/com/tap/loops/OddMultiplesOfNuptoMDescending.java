package com.tap.loops;
import java.util.Scanner;

class OddMultiplesOfNuptoMDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        boolean found = false;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = (m/n)*n;
        for(int i=start;i>=n;i-=n)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
                found = true;
            }
        }
        if(!found)
        {
            System.out.print(-1);
        }
        scanner.close();
    }
}