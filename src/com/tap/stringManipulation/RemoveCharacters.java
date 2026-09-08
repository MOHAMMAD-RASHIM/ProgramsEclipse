package com.tap.stringManipulation;
import java.util.Scanner;


/*
 * Program to remove 'b' and 'ac' from a string 
 */

public class RemoveCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char[] arr = str.toCharArray();
        int n = arr.length;
        
        // StringBuilder to manually construct the result
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // Check for substring "ac"
            if (arr[i] == 'a' && i + 1 < n && arr[i + 1] == 'c') {
                i++; // Skip both 'a' and 'c' by incrementing index extra step
            } 
            // Check for character 'b'
            else if (arr[i] == 'b') {
                continue; // Skip 'b'
            } 
            // Append any other character
            else {
                sb.append(arr[i]);
            }
        }

        // Output result
        if (sb.length() == 0) {
            System.out.print("-1");
        } else {
            System.out.print(sb.toString());
        }

        sc.close();
    }
}