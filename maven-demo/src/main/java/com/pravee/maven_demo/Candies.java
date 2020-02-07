package com.pravee.maven_demo;

public class Candies extends Chocolates  //Inheritance
{
	int weight;
	public Candies()  //constructor
	{
		System.out.print("Candies is collected\n");
		this.weight=20;
	}
	
	@Override
	public String getChocolateType()  	//polymorphism
	{
		return "Candies";
	}
	
	@Override
	protected int getChocolateWeight()  //Encapsulation
	{
		return weight;
	}
}
