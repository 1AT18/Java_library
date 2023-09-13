package com.jsp.ThreadsAndMultitasking;

class employee
{
	String name;
	int eid;
	public employee(String name,int eid)
	{
		super();
		this.name=name;
		this.eid=eid;
	}
	@Override
	public String toString()
	{
		return "Employee[name ="+name+",eid="+eid+"]";
	}
}
public class ObjectArray 
{
	public static void addempdetails()
	{
		employee e1=new employee("virat",17);
		employee e2=new employee("ABD",19);
		employee e3=new employee("SKY",7);
		employee[] emp= {e1,e2,e3};
		for(int i=0;i<=emp.length-1;i++)
		{
			System.out.println(emp[i]);
		}
    }
	public static void main(String[] args) 
	{
		addempdetails();
	}
}
