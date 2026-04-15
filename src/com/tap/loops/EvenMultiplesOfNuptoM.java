package com.tap.loops;
import java.util.Scanner;

class EvenMultiplesOfNuptoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        // for(int i=1;i<=m;i++)
        // {
        //     if(n*i>m) break;
        //     if((n*i)%2==0)
        //     {
        //         System.out.print((n*i)+" ");
        //     }
        // }

        for(int i=n;i<=m;i+=n)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}