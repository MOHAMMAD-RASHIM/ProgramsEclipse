package com.tap.ifelse;
import java.util.Scanner;

public class NoEndingWithZero {
	// This is the program to check whether the number is ending with 0 or not
	
	public static int checkNo (int number) 
	{
		if(number%10 == 0) {
			return number;
		}
		else {
			return -1;
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = checkNo(number);
		System.out.println(result);
		scan.close();
	}
	

}
