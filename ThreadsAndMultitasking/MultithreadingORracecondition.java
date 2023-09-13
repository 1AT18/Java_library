package com.jsp.ThreadsAndMultitasking;

class Task
{
	void printNumAsc()
	{
		for(int i=1;i<=4;i++)
		{
			System.out.println(i);
		}
	}
	void printNumDesc()
	{
		for(int i=4;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread
{
	Task t1;
	public Thread1(Task t1)
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
class Thread2 extends Thread
{
	Task t2;
	public Thread2(Task t2)
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
public class MultithreadingORracecondition 
{
	public static void main(String[] args) 
	{
		Task task=new Task();
		Thread1 t1=new Thread1(task);
		t1.start();
		Thread2 t2=new Thread2(task);
		t2.start();
	}
}