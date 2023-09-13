package com.jsp.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSettIterator 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(2);
		t1.add(1);
		t1.add(3);
		t1.add(10);
		t1.add(9);
		t1.add(9);
		System.out.println(t1);
		
		// Retrieve elements by using Iterator
		
		Iterator<Integer> i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
