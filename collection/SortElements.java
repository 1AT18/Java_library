package com.jsp.collection;

//Sort the elements present in hashset and retrieve the third element after sorting

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortElements 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> h1=new HashSet<Integer>();
		h1.add(1);
		h1.add(5);
		h1.add(7);
		h1.add(1);
		h1.add(17);
		h1.add(32);
		System.out.println("HashSet :"+h1);
		//convert this hashset to Arraylist or Vector
		ArrayList<Integer> a1=new ArrayList<Integer>(h1);//Arraylist (collection c);
		System.out.println("ArrayList :"+a1);
		//Sort elements
		Collections.sort(a1);
		System.out.println("After sorting :"+a1);
		//Retrieve one element
		System.out.println("one element :"+a1.get(2));
	}
}
