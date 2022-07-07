package com.LogicalOperators;

public class Equal_And_Not_Operators 
{

	public static void main(String[] args) 
	{
		int a=5,b=10;
		
		if(a==5)
			System.out.println("== Operator Test");
		if(a==5 & b==10)
			System.out.println("&& Operator Test");
		if(b!=20)
			System.out.println("!= Operator Test");
	}

}
