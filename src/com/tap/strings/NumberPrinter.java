package com.tap.strings;
import java.util.Scanner;
/*
Number Printer

Description
Extracts and prints all the numerical values present in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the distinct numbers in the order of their occurrence.
If no numbers are found, output 'No numbers found.'
 */

public class NumberPrinter {
    public static void printNumber(String str)
    {
        boolean found = false;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                System.out.print(ch+" ");
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("No numbers found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printNumber(input);
        scanner.close();
     
    }
}