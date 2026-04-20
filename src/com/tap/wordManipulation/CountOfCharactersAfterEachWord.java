package com.tap.wordManipulation;
import java.util.Scanner;

/*
 	Input: India is my country
 	Output: India5 is2 my2 country2
 */

public class CountOfCharactersAfterEachWord {
    public static int countWord(String str)
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
        int wordCound = countWord(str);
        String[] arr = new String[wordCound];
        int j = 0;
        String t="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                t+=str.charAt(i);
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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = split(input);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+arr[i].length()+" ");
        }
        
        scanner.close();
        
       
    }
}