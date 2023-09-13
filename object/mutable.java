package com.jsp.object;

public class mutable 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("java");
		System.out.println(s1);//java
		s1.append("hello");
		System.out.println(s1);
	}
}
