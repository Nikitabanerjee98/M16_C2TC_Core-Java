package com.cg.multithreading;
Import java.lang.*;
class Thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("doing task"+i);
		}
	}
}
public class  Main{
	public static void main(String args[])throws
	InterruptedException
	{
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("is thread interrupted "+t1.isInterrupted());
		t1.interrupt();
		System.out.println("is thread interrupted "+t1.isInterrupted());
		
	}

}
