package com.tap.strings;
import java.util.*;
// adding some comment just for refreshment
public class CharacterCount {
	public static int charCount(String str)
	{
		return str.length();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int result = charCount(str);
		System.out.println(result);
		scanner.close();
		
		
	}

}