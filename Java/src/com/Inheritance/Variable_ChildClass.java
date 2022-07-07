package com.Inheritance;

public class Variable_ChildClass extends Variable_ParentClass
{
	String name = "Son-Sai";int a=5;
	
	public Variable_ChildClass()
	{
		System.out.println("ChildClass Variable Method()------>");
	}
	public static void main(String[] args) 
	{
		//int a=10;
		//Variable_ParentClass vp =new Variable_ChildClass();
		Variable_ChildClass vp =new Variable_ChildClass();
		vp.add();
		System.out.println(vp.name);
		System.out.println(vp.a);
	}
	{
		System.out.println("ChildClass Non-Static Block--->");
	}
	public void add()
	{
		System.out.println();
		System.out.println("ChildClass add() method--->");
	}
}
