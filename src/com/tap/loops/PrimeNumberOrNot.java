package com.tap.loops;
import java.util.*;
public class PrimeNumberOrNot {
	// approach 1
	public static boolean isPrime01(int number)
	{
		int count = 0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count>2)
		{
			return false;
		}else {
			return true;
		}
	}
	
	// approach 2
	public static boolean isPrime02(int number)
	{
		for(int i=2;i<=number/2;i++) // going from 2 to n/2
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// To check whether a given number is prime or not
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		
//		if(number==1 || number==0) {
//			System.out.println("It is not yet decided");
//		}
//		else if(isPrime01(number)) {
//			System.out.println(number+" is a prime number");
//		}else {
//			System.out.println(number+" is NOT a prime number");
//		}
		
		if(isPrime02(number)) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is NOT a prime number");
		}
		
		scanner.close();

	}

}
