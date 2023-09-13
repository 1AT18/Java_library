package com.jsp.collection;

import java.util.LinkedHashSet;

public class LinkedHashSett 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> l1=new LinkedHashSet<Object>();
		l1.add(1);
		l1.add(5);
		l1.add(null);
		l1.add(1);
		System.out.println(l1);
		//Retrieve the elements by using for each loop
		l1.forEach(Obj ->System.out.println(Obj));
		//reference.foreach(Obj->syso(obj));
	}
}
