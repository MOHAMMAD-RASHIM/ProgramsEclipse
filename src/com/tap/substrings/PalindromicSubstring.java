package com.tap.substrings;
import java.util.Scanner;

public class PalindromicSubstring {
	// check whether the string is palindrome
    public static boolean isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            if(ch1==ch2)
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    // print the substrings that is palindrome
    public static void printPalindromicSubstring(String str)
    {
        for(int size=1;size<=str.length();size++)
        {
            for(int i=0;i<=str.length()-size;i++)
            {
                String t="";
                for(int  j=i;j<i+size;j++)
                {
                    t+=str.charAt(j);
                }
                if(isPalindrome(t))
                {
                    System.out.print(t+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printPalindromicSubstring(str);
        
    }
}