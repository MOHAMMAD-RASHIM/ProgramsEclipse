package com.tap.stringManipulation;
import java.util.Scanner;
public class InsertStar {
	public static void insertAsteriskBeforeCharacter(String str)
	{
		String t = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='A')
			{
				t = t + '*' + ch;
			}
			else
			{
				t+=ch;
			}
		}
		System.out.println(t);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		insertAsteriskBeforeCharacter(input);
		
		scanner.close();
		
	}

}
