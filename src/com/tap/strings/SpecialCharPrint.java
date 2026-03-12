package com.tap.strings;
import java.util.Scanner;

/*
Special Character Printer

Description
Extracts and prints all the special characters present in a given string in the order of their occurrence.

Input Format
The program takes a single line of input containing a string.

Output Format
Print the special characters in the order of their occurrence separated by spaces.
If no special characters are found, output 'No special characters found.'
 */

public class SpecialCharPrint {
    public static void printSpecialCharacters(String str)
    {
        boolean found = false;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')))
            {
                System.out.print(ch+" ");
                found = true;
            }
        }
        if(!found){
            System.out.println("No special characters found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printSpecialCharacters(input);
        scanner.close();
       
    }
}