package com.jsp.collection;

import java.util.ArrayList;
import java.util.HashSet;

//WAJ program to add some elements to ArrayList and remove duplicate elements from ArrayList and retrieve elements using for loop


public class SortElements1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> alist =new ArrayList<Integer>();
		alist.add(1);
		alist.add(10);
		alist.add(9);
		alist.add(1);
		alist.add(10);
		alist.add(8);
		alist.add(5);
		alist.add(4);
		System.out.println("addres elements :"+alist);
		HashSet<Integer> h1=new HashSet<Integer>(alist);
		System.out.println(" after Removing duplicates :"+h1);
		
		//Retrieved only after converted to arraylist or vector
		
		ArrayList<Integer> v1=new ArrayList<Integer>(h1);
		for(int i=0;i<=v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}
}
