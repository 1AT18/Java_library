package com.jsp.collection;

import java.util.HashSet;

public class HashSett 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h1.add(1);
		h1.add(16);
		h1.add(32);
		h1.add(17);
		System.out.println(h1);
		// Retrieve elements by using for each loop
		for(Integer i:h1)
		{
			System.out.println(i);
		}
	}
}