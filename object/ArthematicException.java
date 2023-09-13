package com.jsp.object;

public class ArthematicException 
{
	public static void number(int n)
	{
		int res=1000/n;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		number(9);
		number(0);
		number(1);
		

	}

}
