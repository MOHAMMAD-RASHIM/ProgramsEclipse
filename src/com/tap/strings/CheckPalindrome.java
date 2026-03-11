package com.tap.strings;
import java.util.*;

public class CheckPalindrome {
	public static boolean checkPalindrome(String inputString){
		int i=0,j=inputString.length()-1;
		while(i<j)
		{
			if(inputString.charAt(i) == inputString.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// To check whether a given string is palindrome .
		Scanner scanner = new Scanner(System.in);
		
		String inputString = scanner.nextLine().toLowerCase();
		if(checkPalindrome(inputString))
		{
			System.out.println(inputString+" is a palindrome.");
		}else {
			System.out.println(inputString+" is NOT a palindrome.");
		}
		scanner.close();
		
	}

}
