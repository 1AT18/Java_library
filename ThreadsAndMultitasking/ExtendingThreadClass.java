package com.jsp.ThreadsAndMultitasking;

public class ExtendingThreadClass extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		ExtendingThreadClass e1=new ExtendingThreadClass();
		e1.start();
	}
}
