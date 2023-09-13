package com.jsp.object;

public class Wrapperclass 
{
	public static void main(String[] args) 
	{
		int a=10;
		Integer i1=a;//autoboxing
		System.out.println(a);
		System.out.println(i1);

		System.out.println("-----------------------");

		Integer i2= new Integer (5);
		int i4=i2.intValue();
		int a2=i2;//unboxing
		System.out.println(i4);
		System.out.println(a2);
	}
}
