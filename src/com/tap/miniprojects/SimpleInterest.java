package com.tap.miniprojects;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		float pricipal = scanner.nextFloat();
		int time = scanner.nextInt();
		float rate = scanner.nextFloat();
		float simpleInterest = (pricipal*time*rate)/100;
		System.out.println(simpleInterest);
		scanner.close();
		
	}

}
