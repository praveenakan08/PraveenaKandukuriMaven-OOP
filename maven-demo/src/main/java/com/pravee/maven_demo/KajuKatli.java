package com.pravee.maven_demo;

public class KajuKatli extends Sweets 		//inheritance
{
	int weight;
	public KajuKatli()			//constructor
	{
		System.out.print("KajuKatli is collected\n");
		this.weight=50;
	}
	
	@Override
	public String getSweetType()		//polymorphism
	{
		return "KajuKatli";
	}
	
	@Override
	protected int getSweetWeight()
	{
		return weight;
	}

}