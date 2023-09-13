package com.jsp.collection;

import java.util.Vector;

public class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector<Object> vlist=new Vector<Object>(5);
		vlist.add(5);
		vlist.add(7);
		vlist.add(4);
		vlist.add(48);
		vlist.add(11);
		vlist.add(1);
		System.out.println(vlist);
		
		for(int i=0;i<=vlist.size();i++)
		{
			System.out.println(vlist.get(i));
		}
//		HashSet<Integer> h1=new HashSet<Integer>();
//		System.out.println(h1.contains(vlist));
	}
}
