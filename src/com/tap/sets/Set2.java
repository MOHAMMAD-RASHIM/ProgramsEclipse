package com.tap.sets;
import java.util.Scanner;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLine()) {
            return;
        }
        
        String input = sc.nextLine();
        TreeSet<Character> charSet = new TreeSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                charSet.add(c);
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (Character ch : charSet) {
            result.append(ch).append(" ");
        }
        
        System.out.println(result.toString().trim());
        sc.close();
    }
}