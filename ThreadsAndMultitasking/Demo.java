package com.jsp.ThreadsAndMultitasking;

public class Demo implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		Thread t1=new Thread(d1);
		t1.start();
	}
}
