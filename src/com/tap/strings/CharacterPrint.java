package com.tap.strings;
import java.util.Scanner;

public class CharacterPrint {
    public static void printChar(String str){
        boolean found = false;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
            {
                found = true;
                System.out.print(ch+" ");
            }
        }
        if(!found){
            System.out.println("No valid characters found.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printChar(input);
        scanner.close();
      
    }
}