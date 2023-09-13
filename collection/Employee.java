package com.jsp.collection;

public class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	private double sal;
	
	public Employee(String name, int id, double sal) 
	{
		super();
		this.name = name;
		this.id = id;
		
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "Employee[name="+name+",id="+id+",sal="+sal+"]";
	}
	@Override
	public int compareTo(Employee O)
	{
		return this.id-O.id;
	}
}
