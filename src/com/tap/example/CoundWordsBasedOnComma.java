package com.tap.example;

import java.util.Scanner;

public class CoundWordsBasedOnComma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		
		int result = countWord(input);
		
		System.out.println("Number of words: " + result);
		sc.close();
	}
	public static int countWord(String str) {
	    if(str == null || str.length() == 0)
	        return 0;

	    int count = 0;
	    boolean inWord = false;

	    for(int i = 0; i < str.length(); i++) {
	        if(str.charAt(i) != ',') {
	            if(!inWord) 
	            {
	                count++;
	                inWord = true;
	            }
	        } 
	        else {
	            inWord = false;
	        }
	    }
	    return count;
	}
}