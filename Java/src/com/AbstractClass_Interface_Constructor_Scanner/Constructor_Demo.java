package com.AbstractClass_Interface_Constructor_Scanner;

public class Constructor_Demo {

	public Constructor_Demo() 
	{
		this(10000);
		System.out.println("No argument/No Parameter Constructor: ");
		
	}
	
	public Constructor_Demo(int i) 
	{
		this("Satheesh");
		System.out.println("One argument/ Parameter Constructor: "+i);

	}
	public Constructor_Demo(String name) 
	{
		System.out.println("One argument/ Parameter Constructor: "+name);
	}

//	public static void main(String[] args) 
//	{
//		Constructor_Demo cd = new Constructor_Demo();
//		Constructor_Demo cd1 = new Constructor_Demo(2000);
//		Constructor_Demo cd2 = new Constructor_Demo("Satheesh");
//	}

}
