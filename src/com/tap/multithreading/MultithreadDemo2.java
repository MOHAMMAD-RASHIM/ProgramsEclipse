package com.tap.multithreading;
import java.util.Scanner;

// Implementing Multithreaded program using Thread class
class AddRunnable implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Adding Started...");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter 1st digit: ");
			int a = scanner.nextInt();
			System.out.println("Enter 2nd digit: ");
			int b = scanner.nextInt();
			int c = a+b;
			System.out.println("Result = "+c);
		}
		System.out.println("Adding Stopped....");
//		scanner.close();
	}

	
	
	
}

class PrintCharactersRunnable implements Runnable
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
class PrintNumbersRunnable implements Runnable
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

public class MultithreadDemo2 {
	public static void main(String[] args)
	{
		AddRunnable ad = new AddRunnable();
		PrintCharactersRunnable pc = new PrintCharactersRunnable();
		PrintNumbersRunnable pn = new PrintNumbersRunnable();
		
		Thread t1 = new Thread(ad);
		Thread t2 = new Thread(pc);
		Thread t3 = new Thread(pn);
		
		t1.start();
		t2.start();
		t3.start();
	}
	

}
