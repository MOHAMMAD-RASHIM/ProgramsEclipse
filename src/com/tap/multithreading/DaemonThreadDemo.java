package com.tap.multithreading;

class Eclipse extends Thread
{
	@Override
	public void run() {
		AutoSave at = new AutoSave();
		at.setName("AUTOSAVE THREAD");
		at.setDaemon(true);
		at.start();
		
		try
		{
			System.out.println(currentThread().getName()+" has started...");
			Thread.sleep(2000);
			System.out.println(currentThread().getName()+" has java programs...");
			Thread.sleep(2000);
			System.out.println(currentThread().getName()+" is used to write java program...");
			Thread.sleep(2000);
			System.out.println(currentThread().getName()+" is used to run the java program...");
			Thread.sleep(2000);
			System.out.println(currentThread().getName()+" has stopped...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

class AutoSave extends Thread
{
	@Override
	public void run() {
		
		for(;;)
		{
			System.out.println(currentThread().getName()+" is Autosaving....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class DaemonThreadDemo {
	public static void main(String[] args) {
		
		Eclipse ec = new Eclipse();
		ec.setName("ECLIPSE THREAD");
		ec.start();
		
	}

}
