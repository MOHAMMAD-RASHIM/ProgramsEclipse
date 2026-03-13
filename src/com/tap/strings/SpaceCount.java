package com.tap.strings;
import java.util.Scanner;

public class SpaceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        countSpace(input);
        scanner.close();
       
    }
    public static void countSpace(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}