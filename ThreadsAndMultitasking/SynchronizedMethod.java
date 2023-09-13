package com.jsp.ThreadsAndMultitasking;

class Taskk
{
	synchronized public void printNumAsc()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
		}
	}
	synchronized public void printNumDesc()
	{
		for(int i=4;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class Thread11 extends Thread
{
	Taskk t1;
	public Thread11(Taskk t1)
	{
		this.t1=t1;
	}
	@Override
	public void run()
	{
		//call the task
		t1.printNumAsc();
	}
}
class Thread223 extends Thread
{
	Taskk t2;
	public Thread223(Taskk t2)
	{
		this.t2=t2;
	}
	@Override
	public void run()
	{
		//call the task
		t2.printNumDesc();
	}
}
public class SynchronizedMethod 
{
	public static void main(String[] args) 
	{
		Taskk task=new Taskk();
		Thread11 t1=new Thread11(task);
		t1.start();
		Thread223 t2=new Thread223(task);
		t2.start();
	}
}