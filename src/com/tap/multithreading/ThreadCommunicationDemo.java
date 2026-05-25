package com.tap.multithreading;

class Queue
{
	int data;
	public void setData(int data)
	{
		this.data = data;
		System.out.println(Thread.currentThread().getName()+" Produced "+data);
	}
	
	public void getData()
	{
		System.out.println(Thread.currentThread().getName()+" Consumed "+data);
		
	}
}

class Producer extends Thread
{
	Queue q;
	Producer(Queue q){
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

class Consumer extends Thread
{
	Queue q;
	Consumer(Queue q){
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

public class ThreadCommunicationDemo {
	public static void main(String[] args) {
		Queue q = new Queue();
		
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);
		
		
		producer.setName("PRODUCER");
		consumer.setName("CONSUMER");
		
		producer.start();
		consumer.start();
		
		
	}

}
