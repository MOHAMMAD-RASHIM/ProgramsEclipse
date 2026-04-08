package com.tap.wordManipulation;
import java.util.Scanner;

/*
 Input: Tap academy
 Output: paT ymedaca
 */

public class ReverseWordsInaString {
    public static int countWords(String str)
    {
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return str.charAt(0)==' '?count:count+1;
    }
    
    
    public static String[] split(String str)
    {
        int wordCount = countWords(str);
        String[] arr = new String[wordCount];
        int j=0;String t="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                t+=ch;
            }
            else if(t.length()>0)
            {
                arr[j] = t;
                j++;
                t="";
            }
        }
        arr[j] = t;
        return arr;

    }
    
    
    public static String reverseWords(String str)
    {
        String t="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch = str.charAt(i);
            t+=ch;
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] arr = split(string);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(reverseWords(arr[i])+" ");
        }

        
    }
}