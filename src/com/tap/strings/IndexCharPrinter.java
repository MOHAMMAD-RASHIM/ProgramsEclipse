package com.tap.strings;
import java.util.Scanner;
/*
 * Prints the character present at a given index in a string, and the index value should starts from 0.
 */
public class IndexCharPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int index = scanner.nextInt();
        if(index>=input.length() || index<0)
        {
            System.out.print("Invalid index");
        }else{
            System.out.println(input.charAt(index));
        }
        scanner.close();
    }
}