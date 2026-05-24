package com.tap.multithreading;

import java.util.Scanner;

class CommonMultiThread extends Thread{
	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		String threadName = t.getName();
		
		// instead of above 2 lines can use currentThread().getName()
		
		if(threadName.equals("ADD")) {			
			add();
		}
		else if(threadName.equals("CHAR")) {
			displayCharacters();
		}
		else{
			displayNumbers();
		}
	}
	
	public void add()
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
	}
	
	public void displayCharacters()
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
	
	public void displayNumbers()
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
public class SingleRunMethodDemo {

	public static void main(String[] args) {
		CommonMultiThread cm1 = new CommonMultiThread();
		CommonMultiThread cm2 = new CommonMultiThread();
		CommonMultiThread cm3 = new CommonMultiThread();
		
		cm1.setName("ADD");
		cm2.setName("CHAR");
		cm3.setName("NUM");
		
		cm1.start();
		cm2.start();
		cm3.start();
		
		
	}

}
