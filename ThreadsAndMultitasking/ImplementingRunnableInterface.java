package com.jsp.ThreadsAndMultitasking;

public class ImplementingRunnableInterface implements Runnable 
{
	@Override
	public void run()
	{
		for (int i=1;i<=4;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		ExtendingThreadClass e1= new ExtendingThreadClass();
		Thread t1=new Thread(e1);
		t1.start();
	}
}
