package com.TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeyword_dependsOnMethods 
{	
	WebDriver driver;
	
	@BeforeMethod	
	public void enterUrl() 
	{
		System.out.println("@BeforeMethod: ");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test()			//TestCase:1
	
	public void googleTitleTest_TestCase()
	{
		System.out.println("Test Case:  1   :");
		boolean isGoogleLogoDisplayed = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println("Test Case:1  :Is TestCase(Google Logo Display) is Passed? : "+isGoogleLogoDisplayed);
		//int a=10/0; // Use to Check the TestCase SKIP & FAIL 
	}
	
	@Test(dependsOnMethods="googleTitleTest_TestCase")	//TestCase:2
	
	public void googleSearchTest_TestCase()
	{
		System.out.println("Test Case:  2   :");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println("TestCase(googleSearchTest) Height of googleSearch: "+googleSearch.getSize().getHeight());
		//int a=10/0;  // Use to Check the TestCase SKIP & FAIL 
	}
	
	@Test(dependsOnMethods="googleSearchTest_TestCase")	//TestCase:3
	
	public void isGmailAvailable_TestCase()
	{
		System.out.println("Test Case:  3   :");
		WebElement gmailLinkAvailable = driver.findElement(By.linkText("Gmail"));
		System.out.println("TestCase(gmailLinkAvailable) is Displayed?: "+gmailLinkAvailable.isDisplayed());
		//int a=10/0; // Use to Check the TestCase SKIP & FAIL 
	}
	
	
	@AfterMethod	
	public void closeBrowser()
	{
		System.out.println("@AfterMethod: ");
		driver.close();
	}

}
