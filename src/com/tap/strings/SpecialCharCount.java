package com.tap.strings;
import java.util.Scanner;

public class SpecialCharCount {
    public static void countSpecialChar(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!(Character.isLetter(ch) || Character.isDigit(ch) || Character.isWhitespace(ch)))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        countSpecialChar(input);
        scanner.close();
       
    }
}