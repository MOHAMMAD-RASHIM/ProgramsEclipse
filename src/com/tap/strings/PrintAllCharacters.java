package com.tap.strings;
import java.util.Scanner;

public class PrintAllCharacters {

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    for(int i=0;i<str.length();i++)
    {
        System.out.println(str.charAt(i));
    }
    scanner.close();
 }

}