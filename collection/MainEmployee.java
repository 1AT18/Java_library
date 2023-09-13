package com.jsp.collection;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmployee 
{
	public void addempdetails()
	{
		Employee e1=new Employee("a",101,1500.0);
		Employee e2=new Employee("b",102,1500.0);
		Employee e3=new Employee("c",103,1500.0);
		Employee e4=new Employee("d",104,1500.0);
		Employee e5=new Employee("e",105,1500.0);
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e5);
		emplist.add(e4);
		emplist.add(e3);
		emplist.add(e1);
		emplist.add(e2);
		System.out.println(emplist);
		Collections.sort(emplist);
		System.out.println(emplist);
		for(int i=0;i<emplist.size();i++)
		{
			System.out.println(emplist.get(i));
		}
	}
	public static void main(String[] args) 
	{
		MainEmployee m1=new MainEmployee();
		m1.addempdetails();
	}
}
