package com.TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeyword_expectedExceptions 
{	
	//TestCase will be PASSED with this "expectedException:
	@Test(expectedExceptions=NumberFormatException.class) //TestCase:1
	
	public void convert()
	{
		String a ="100A";
		Integer.parseInt(a); //"NumberFormatException" will Occur
		System.out.println("Converted Value: "+a);
	}
	
	//TestCase will be FAILED as "//expectedExceptions=ArithmeticException.class" was Not 
	@Test()	  			//TestCase:2
	
	public void arithmetic()
	{
		int a=10/0;  //"ArithmeticException" will Occur
	}
}
