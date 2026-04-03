package com.tap.stringManipulation;


public class RemoveDuplicateInString {
    public static void removeDuplicate(String str) {
        String t = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            boolean isDuplicate = false;

            // check if already exists in t
            for (int j = 0; j < t.length(); j++) {
                if (ch == t.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                t = t + ch;
            }
        }

        System.out.print(t);
    }

    public static void main(String[] args) {
        removeDuplicate("hello");
    }
}
