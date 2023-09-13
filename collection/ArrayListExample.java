package com.jsp.collection;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> alist=new ArrayList<Object>();
		alist.add(1);
		alist.add('A');
		alist.add("hello");
		alist.add(null);
		alist.add('A');
		alist.add('A');
		alist.add(null);
		alist.add(2, "hii");
		System.out.println(alist);
		alist.remove(1);
		System.out.println(alist);
		//retrieve elements by using for loop
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
	}
}
