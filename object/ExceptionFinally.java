package com.jsp.object;

public class ExceptionFinally 
{
	public static void num(int n)
	{
		try
		{
			int res=5000/n;
			System.out.println(res);
		}
		catch(Exception a)
		{
			System.out.println("invalid");
		}
		finally
		{
			System.out.println("finally");
		}
	}
	public static void main(String[] args) 
	{
		num(1);
		num(0);
	}
}
