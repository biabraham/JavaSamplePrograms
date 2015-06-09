package com.mytest.first;

public class MultiThreadingWithThreadClass extends Thread {
	
	public void run(){
		System.out.println("Entering the run method with thread name - "+Thread.currentThread().getName());
		try{
			Thread.sleep(1000);
			dbProcessing();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void dbProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MultiThreadingWithThreadClass();
		Thread t2 = new MultiThreadingWithThreadClass();
		t1.start();
		t2.start();

	}

}
