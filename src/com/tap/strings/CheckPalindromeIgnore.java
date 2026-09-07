package com.tap.strings;
import java.util.Scanner;

class CheckPalindromeIgnore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        String str = scanner.nextLine();
        String t="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
            {
                t = t+ch;
            }

        }
        if(isPalindrome(t))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}