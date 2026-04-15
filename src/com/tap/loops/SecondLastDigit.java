package com.tap.loops;
import java.util.Scanner;
/*
 * This is the code to get the second last digit of a number
 	Input: if n = 123456
 	Output: 5 
 */
class SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        if(n<10)
        {
//            System.out.print(0);
        }
        n = n%100; // my logic...
        n = n/10;
        System.out.print(n);

        /*
        (n/10) - last digit will be removed.
        n%10 - last digit retrived...
        */
        scanner.close();
    }
}