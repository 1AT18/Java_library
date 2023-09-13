package com.jsp.collection;

import java.util.TreeSet;

public class TreeSetMethods 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(1);
		t1.add(5);
		t1.add(6);
		t1.add(2);
		t1.add(3);
		t1.add(10);
		t1.add(11);
		System.out.println(t1);
		
		System.out.println(t1.first());//only retrieves first element
		System.out.println(t1);
		System.out.println(t1.last());//only retrieves last element
		System.out.println(t1);
		System.out.println(t1.pollFirst());// retrieves and delete firdt element
		System.out.println("first element deleted :"+t1);
		System.out.println(t1.pollLast());//retrieves and delete last element
		System.out.println("last element deleted :"+t1);
		System.out.println("In descending order :"+t1.descendingSet());
	}
}
