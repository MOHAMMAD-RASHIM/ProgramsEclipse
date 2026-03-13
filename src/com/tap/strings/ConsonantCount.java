package com.tap.strings;
import java.util.Scanner;

public class ConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        consonantCount(input);
        scanner.close();
        
    }
    public static void consonantCount(String str)
    {
        int cc = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z'))
            {
                 if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
                    ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
                    {
                        cc++;
                    }
            }
        }
        System.out.println(cc);
    }
}