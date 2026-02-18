package com.tap.ifelse;
import java.util.Scanner;
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int number = scanner.nextInt();
        if(number%3==0)
        {
            System.out.println(number+" is the multiple of 3.");
        }
        else{
            System.out.println(number+" is NOT a multiple of 3.");
        }


        scanner.close();

    }
}