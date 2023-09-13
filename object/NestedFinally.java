package com.jsp.object;

public class NestedFinally 
{
	public static void num(int n)
	{
		try
		{
			int res=1000/n;
			System.out.println(res);
		}
		catch(Exception a)
		{
			System.out.println("Invalid or Exception handled");
		}
		finally
		{
			try
			{
				int [] a1= {10,20,30};
				System.out.println(a1[n]);
			}
			catch(Exception e)
			{
				System.out.println("Invalid index");
			}
		}
	}
	public static void main(String[] args) 
	{
//		num(1);
		num(0);
//		num(5);
		

	}

}
