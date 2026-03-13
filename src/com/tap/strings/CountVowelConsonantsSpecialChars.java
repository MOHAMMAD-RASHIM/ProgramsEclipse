package com.tap.strings;
import java.util.Scanner;

/*

Count Vowels, Consonants, and Special Characters in a String

Description
Counts the number of vowels, consonants, and special characters in a given string.

Input Format
The input consists of a single line containing the input string.

Output Format
Output three lines, each containing the count of vowels, consonants,
and special characters in the given string, respectively.
 */
public class CountVowelConsonantsSpecialChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        countVCSC(input);
        scanner.close();
    }
    public static void countVCSC(String str)
    {
        int cc=0,vc=0,sc=0;
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
                    else{
                        vc++;
                    }
            }else if(!(ch>='0'&& ch<='9')){
                sc++;
            }
        }
        System.out.println("Vowels: "+vc+" Consonants: "+cc+" Special Characters: "+sc);
    }
}