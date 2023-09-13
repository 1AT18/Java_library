package com.jsp.ThreadsAndMultitasking;

class taske
{
	public void printNumAsc()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
		}
	}
	public void printNumDesc()
	{
		for(int i=4;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class Thread222 extends Thread
{
	taske t1;
	public Thread222(taske t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		synchronized(t1)
		{
			t1.printNumAsc();
		}
	}	
}
class Thread22 extends Thread
{
	taske t2;
	public Thread22(taske t2)
	{
		this.t2=t2;
	}
	@Override
	public void run()
	{
		synchronized(t2)
		{
			t2.printNumDesc();
		}
	}
}
public class SynchronizedBlock 
{

	public static void main(String[] args) 
	{
		taske Task=new taske();
		Thread222 th1=new Thread222(Task);
		th1.start();
		Thread22 th2=new Thread22(Task);
		th2.start();
	}
}
