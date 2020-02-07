package com.pravee.maven_demo;

import java.util.*;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("----------GIFTS----------");
    	System.out.println("CHOCOLATES ");
    	System.out.println("Candies    Waffers");
    	System.out.println("\nSWEETS ");
    	System.out.println("GulabJamun    KajuKatli");
    	
    	System.out.println("\nWhat have you got??");
    	System.out.println("Enter the number of gifts that you have received");
		int noOfGifts = sc.nextInt();

		System.out.println("Enter the type of each gift that you have received");
		HashMap <String,Integer> gifts=new HashMap<String,Integer>();
		
		for(int i=0;i<noOfGifts;i++)
		{
			String g=sc.next();
			if(g.equalsIgnoreCase("GulabJamun"))
			{
				Sweets gulabJamun=new GulabJamun();
				gifts.put(gulabJamun.getSweetType(),gulabJamun.getSweetWeight());
			}
			
			if(g.equalsIgnoreCase("KajuKatli"))
			{
				Sweets kajuKatli=new KajuKatli();
				gifts.put(kajuKatli.getSweetType(),kajuKatli.getSweetWeight());
			}
			
			if(g.equalsIgnoreCase("Candies"))
			{
				Chocolates candies=new Candies();
				gifts.put(candies.getChocolateType(),candies.getChocolateWeight());
			}
			
			if(g.equalsIgnoreCase("Waffers"))
			{
				Chocolates waffers=new Waffers();
				gifts.put(waffers.getChocolateType(),waffers.getChocolateWeight());
			}
		}
		
		System.out.println("\nSorted order of gifts according to weights");
		
		
		List <Map.Entry<String,Integer>> set=new ArrayList<Map.Entry<String,Integer>>(gifts.entrySet()) ;
		
		Collections.sort(set,new Comparator <Map.Entry<String, Integer>>()
				{
					public int compare(Map.Entry <String,Integer> g1, Map.Entry <String,Integer> g2)
					{
						return g1.getValue()-g2.getValue();
					}
			
				}
				
				);
		
		int sum=0;
		for(Map.Entry<String,Integer> s:set)
		{
			sum+=s.getValue();
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		System.out.println("\nTotal Weight of all the gifts is "+sum);
		
		sc.close();
    }
}
