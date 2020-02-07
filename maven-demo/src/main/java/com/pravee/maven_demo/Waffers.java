package com.pravee.maven_demo;

public class Waffers extends Chocolates			//inheritance
{
	int weight;
	public Waffers()			//constructor
	{
		System.out.print("Waffers is collected\n");
		this.weight=30;
	}

	@Override
	public String getChocolateType()		//polymorphism
	{
		return "Waffers";
	}
	
	@Override
	protected int getChocolateWeight()		//encapsulation
	{
		return weight;
	}
}
