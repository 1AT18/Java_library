package com.jsp.ThreadsAndMultitasking;

public class ThreadMethods extends Thread
{
	public static void main(String[] args) 
	{
		ThreadMethods t1=new ThreadMethods();
		System.out.println("State 1 :"+ t1.getState());
		t1.start();
		System.out.println("--------------------------");
		System.out.println("State 2: "+ t1.getState());
		System.out.println("Thread id :"+t1.getId());
		System.out.println("Thread name: "+t1.getName());
		System.out.println(t1.isAlive());
	}
}
