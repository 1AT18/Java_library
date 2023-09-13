package com.jsp.object;

class PoloGT extends Exception
{
	public PoloGT(String msg)
	{
		super(msg); //new exception (msg);
	}
	public static void check() throws PoloGT
	{
		throw new PoloGT("Favourite one");
	}
}
public class CustomisedException 
{
	public static void main(String[] args) 
	{
		try 
		{
			PoloGT.check();
		} 
		catch (PoloGT e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
