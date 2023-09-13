package com.jsp.object;

public class Samplee 
{
//	@Override
//	public boolean equals(Object s)
//	{
//		return true;
//		
//	}
	public static void main(String[] args) 
	{
		Samplee s1=new Samplee();
		Samplee s2=new Samplee();
		System.out.println("------hashCode()------");
		System.out.println(s1.hashCode());
		int h1=s2.hashCode();
		System.out.println(h1);
		System.out.println("------toString()------");
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println("------equals()--------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
	}

}

