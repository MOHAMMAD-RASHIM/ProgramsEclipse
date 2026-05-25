package com.tap.multithreading;

class Queue1
{
	int data;
	boolean isDataProduced = false;
	
	// if synchronized is not used then IllegalMonitorStateException occurs...
	
	synchronized void setData(int data)
	{
		if(!isDataProduced) {
			this.data = data;
			System.out.println(Thread.currentThread().getName()+" Produced "+data);
			notify();
			isDataProduced = true;
		}
		else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	synchronized void getData()
	{
		if(isDataProduced) {
			System.out.println(Thread.currentThread().getName()+" Consumed "+data);
			isDataProduced = false;
			notify();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Producer1 extends Thread
{
	Queue1 q;
	Producer1(Queue1 q){
		this.q = q;
	}
	int i = 1;
	@Override
	public void run() {
		while(true) {
			q.setData(i++);
		}
	}
}

class Consumer1 extends Thread
{
	Queue1 q;
	Consumer1(Queue1 q){
		this.q = q;
	}
	int i = 1;
	@Override
	public void run() {
		while(true) {
			q.getData();
		}
	}
}

public class ThreadCommunicationDemoSolution {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		
		Producer1 producer = new Producer1(q);
		Consumer1 consumer = new Consumer1(q);
		
		
		producer.setName("PRODUCER");
		consumer.setName("CONSUMER");
		
		producer.start();
		consumer.start();
		
		
	}

}
