package com.kk.learning.multithreading;

class Runner extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
		}
	}
	
}

public class Basics {
	
	public static void main(String[] args)
	{
		Runner thread1= new Runner();
		thread1.start();
	}
	
	

}
