package com.pravee.maven_demo;

public abstract class Chocolates implements Gifts  
{
	public Chocolates()   //constructor
	{
		System.out.print("Chocolate ");
	}
	
	@Override
	public String getType()
	{
		return "Chocolates";
	}
	
	public abstract String getChocolateType();
	protected abstract int getChocolateWeight();  //Encapsulation
	
}