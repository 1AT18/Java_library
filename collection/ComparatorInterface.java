package com.jsp.collection;

import java.util.Comparator;
import java.util.TreeSet;

class des implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) // descending and ascending
	{	
		return o1.compareTo(o2);
	}
}
class Length implements Comparator<String>// length of the string
{
	@Override
	public int compare(String o1, String o2) {
		
		return o2.length()-o1.length();
	}
	
}
public class ComparatorInterface 
{

	public static void main(String[] args) 
	{
		des d1=new des();//
		Length l1=new Length(); // length of the string
		TreeSet<String> t1=new TreeSet<String>(d1);
		t1.add("aaaaa");
		t1.add("nnnnn");
		t1.add("llll");
		t1.add("ttttttttt");
		System.out.println(t1);
	}
}
