package com.jsp.object;

public class Exceptionn 
{
	public static void number(int n)
	{
		try
		{
			int res=1000/n;
			System.out.println(res);
			int[]a1= {10,20,30};
			System.out.println(a1[n]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("invalid index");
		}
		catch(Exception a)
		{
			System.out.println("invalid number of div by arthimatic");
		}
	}
	public static void main(String[] args) 
	{
		number(5);
	}
}
