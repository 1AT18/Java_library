package com.jsp.ThreadsAndMultitasking;

class ThreadTaskOne extends Thread
{
	String s1;
	String s2;
	public ThreadTaskOne(String s1,String s2)
	{
		this.s2=s2;
		this.s1=s1;
	}
	@Override
	public void run()
	{
		System.out.println("t1 waiting to lock s1");
		synchronized(s1)
		{
			System.out.println("t1 lock s1");
			System.out.println("t1 waiting to lock s2");
			try
			{
				System.out.println("t1 pause the execution");
				s1.wait();
				System.out.println("t1 resume the execution");
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		synchronized(s2)
		{
			System.out.println("t1 lock s2");
		}
		System.out.println("t1 unlock s1");
		System.out.println("t1 unlock s2");
		}
	}
}
class ThreadTaskTwo extends Thread
{
	String s1;
	String s2;
	public ThreadTaskTwo(String s1,String s2)
	{
		this.s1=s1;
		this.s2=s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 waiting to lock s2");
		synchronized(s2)
		{
			System.out.println("t2 lock s2");
			System.out.println("t2 waiting to lock s1");
			synchronized(s1)
			{
				System.out.println("t2 lock s1");
				s1.notify();
			}
			System.out.println("t2 unlock s2");
			System.out.println("t2 unlock s1");
		}
	}
}
public class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		String str1=new String("JAVA");
		String str2=new String("SQL");
		ThreadTaskOne t1=new ThreadTaskOne(str1,str2);
		ThreadTaskTwo t2=new ThreadTaskTwo(str1,str2);
		t1.start();
		t2.start();
	}
}
