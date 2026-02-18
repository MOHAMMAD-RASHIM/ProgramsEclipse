package com.tap.ifelse;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// Take input from a user
		Scanner scan = new Scanner(System.in);
		// to take single word
//		System.out.println("Enter a word");
//		String word = scan.next();
		
		System.out.println("Enter a sentence");
		String sentence = scan.nextLine();
		
//		System.out.println(word);
		System.out.println(sentence);
		
		scan.close();

	}

}
