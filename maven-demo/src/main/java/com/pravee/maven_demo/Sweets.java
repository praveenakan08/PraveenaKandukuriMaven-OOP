package com.pravee.maven_demo;

public abstract class Sweets implements Gifts
{
	public Sweets()				//constructor
	{
		System.out.print("Sweet ");
	}
	
	@Override
	public String getType()
	{
		return "Sweets";
	}
	
	public abstract String getSweetType();
	protected abstract int getSweetWeight(); //Encapsulation
	

}
