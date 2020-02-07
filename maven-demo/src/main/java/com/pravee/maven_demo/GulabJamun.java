package com.pravee.maven_demo;

public class GulabJamun extends Sweets		//Inheritance
{
	int weight;
	public GulabJamun()			//constructor
	{
		System.out.print("GulabJamun is collected\n");
		this.weight=10;
	}
	
	@Override						//polymorphism
	public String getSweetType()
	{
		return "GulabJamun";
	}
	
	@Override
	protected int getSweetWeight()  //Encapsulation
	{
		return weight;
	}
	
	

}
