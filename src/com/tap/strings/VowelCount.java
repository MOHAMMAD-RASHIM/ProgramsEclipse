package com.tap.strings;
import java.util.Scanner;
/*
Vowel Count in String

Description
Count the number of vowels in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output the count of vowels in the given string.
 */

public class VowelCount {
    public static void vowelCount(String str)
    {
        int vc = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || 
            ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                vc++;
            }
        }
        System.out.println(vc);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelCount(input);
        scanner.close();
    }
}