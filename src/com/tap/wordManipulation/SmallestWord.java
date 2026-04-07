package com.tap.wordManipulation;
import java.util.Scanner;

public class SmallestWord {
    public static int countWords(String str)
    {
        int count = 0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return str.charAt(0)==' '?count:count+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int wordCount = countWords(str);
        String[] arr = new String[wordCount];
        System.out.println(wordCount);
        int j=0;
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
        arr[j]=t;

        String smallest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].length()<smallest.length())
            {
                smallest = arr[i];
            }
        }
        System.out.print(smallest);
        scanner.close();
        

        
    }

    
}