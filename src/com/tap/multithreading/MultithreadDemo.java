package com.tap.multithreading;
import java.util.Scanner;

// Implementing Multithreaded program using Thread class
class Add extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Adding Started...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st digit: ");
		int a = scanner.nextInt();
		System.out.println("Enter 2nd digit: ");
		int b = scanner.nextInt();
		int c = a+b;
		System.out.println("Result = "+c);
		System.out.println("Adding Stopped....");
		scanner.close();
	}
	
	
}

class PrintCharacters extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Characters Started...");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Characters Stopped...");
	}
}
class PrintNumbers extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Printing Numbers Started...");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Printing Numbers Stopped...");
	}
}

public class MultithreadDemo {
	public static void main(String[] args)
	{
		Add ad = new Add();
		PrintCharacters pc = new PrintCharacters();
		PrintNumbers pn = new PrintNumbers();
		
		ad.start();
		pc.start();
		pn.start();
	}
	

}
