package com.mytest.first;

public class MultiThreadingWithRunnable implements Runnable {
	
	public void run(){
		System.out.println("Inside the run method and thread name is "+Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
			dbProcessing();
		}
		catch(Exception e){
			e.getStackTrace();
		}
		System.out.println("Exiting the run method");
	}
	
	public void dbProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingWithRunnable abc = new MultiThreadingWithRunnable();
		Thread thread1 = new Thread(abc);
		Thread thread2 = new Thread(abc);
		thread1.start();
		thread2.start();

	}

}
