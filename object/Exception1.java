package com.jsp.object;

public class Exception1 
{
	public static void number(int n)
	{
		try
		{
			int res=1000/n;
			System.out.println(res);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("invalid number of div");
		}
	}

	public static void main(String[] args) 
	{
		number(9);
		number(0);
	}
}
