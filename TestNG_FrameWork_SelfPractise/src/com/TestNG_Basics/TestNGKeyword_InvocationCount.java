package com.TestNG_Basics;


import org.testng.annotations.Test;

public class TestNGKeyword_InvocationCount 
{	
	@Test(invocationCount=5) //Executing a TestCase Multiple Times using Keyword: invocationCount
	public void invocationCount()
	{
		String name ="Saipranav";
		System.out.println("invocation Count: "+ name);
	}
}
