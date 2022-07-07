package com.Test;

public class ConstructorTest {

	public ConstructorTest(int a) 
	{
		System.out.println("The Constructor Output is: "+a);	
	}

	public static void main(String[] args) 
	{
		ConstructorTest ct = new ConstructorTest(150);
	}

}
