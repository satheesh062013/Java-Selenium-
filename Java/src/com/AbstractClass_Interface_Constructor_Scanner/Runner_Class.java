package com.AbstractClass_Interface_Constructor_Scanner;

public class Runner_Class extends AbstractDemo implements Interface1_Demo
{
	public static void main(String[] args) 
	{
		Runner_Class rc = new Runner_Class();
		System.out.println("Abstract Class Global Variable BEFORE modify: "+rc.a);
		rc.a=500;//Modified Abstract Class Global Variable
		System.out.println("Abstract Class Global Variable AFTER modify: "+rc.a);
		System.out.println("O/p from Abstract Class "+ rc.sub());
		System.out.println("O/p from Abstract Class "+ rc.add(1000, 100));
		System.out.println("***********************");
		System.out.println("O/p from Interface "+ rc.b);
		System.out.println("O/p from Interface "+ rc.mul(100, 30));
	}
	@Override   //from Abstract Class
	public int add(int a, int b) 
	{
		return a+b;
	}
	
	@Override   //from Interface
	public int mul(int a, int b) 
	{
		return a*b;
	}

}
