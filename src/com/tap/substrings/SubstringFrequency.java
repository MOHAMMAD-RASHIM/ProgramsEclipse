package com.tap.substrings;
import java.util.Scanner;

/*
 I/P: 
 HelloworldHello 
 Hello
 output: 2 
 */

public class SubstringFrequency {
    public static void printSubstringFrequency(String str, String subStr)
    {
        int size = subStr.length();
        int count = 0;
        for(int i=0;i<str.length()-size;i++)
        {
            String  t = "";
            for(int j=i;j<i+size;j++)
            {
                t+=str.charAt(j);
            }
            if(t.equals(subStr))
            {
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        printSubstringFrequency(str,subStr);
        scanner.close();
        
    }

    
}