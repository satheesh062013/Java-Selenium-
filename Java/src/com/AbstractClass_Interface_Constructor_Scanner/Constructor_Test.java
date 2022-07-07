package com.AbstractClass_Interface_Constructor_Scanner;

public class Constructor_Test extends Constructor_Demo{

	public Constructor_Test(int i) 
	{
		super();
		System.out.println("Child Class One Arg Constructor: "+i);
	}

	public Constructor_Test() 
	{
		this(6000);
		System.out.println("Child Class No Arg Constructor: ");	
	}

	public static void main(String[] args) 
	{
		Constructor_Test cd = new Constructor_Test();
	}

}
