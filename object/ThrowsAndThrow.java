package com.jsp.object;

public class ThrowsAndThrow 
{
	public void check(int a,int b) throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) 
	{
		ThrowsAndThrow t1=new ThrowsAndThrow();
		try
		{
			t1.check(1,3);
		}
		catch(Exception e)
		{
			System.out.println("hello");
		}
		try {
			t1.check(1,-1);  //unhandles exception
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
