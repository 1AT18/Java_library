package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(5);
		alist.add(6);
		alist.add(1);
		alist.add(2);
		alist.add(9);
		alist.add(11);
		alist.add(15);
		System.out.println("before sorting:"+alist);
		Collections.sort(alist);//normal or ascending
		System.out.println("after sorting:"+alist);
	}
}
