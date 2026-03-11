package com.tap.strings;
import java.util.Scanner;
/*
  	Concatenates two strings into a single string while preserving their original order.
 */
public class StringConcatenator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        System.out.println(input1+input2);
        scanner.close();
    }
}