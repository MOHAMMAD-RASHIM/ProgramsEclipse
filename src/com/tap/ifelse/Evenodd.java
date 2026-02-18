package com.tap.ifelse;
import java.util.Scanner;


public class Evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Even Odd Program");
        int number = scanner.nextInt();
        
        if(number%2==0){
            System.out.println(number+" is Even number");
        }else{
            System.out.println(number+" is Odd number");
        }

        scanner.close();
    }
}
