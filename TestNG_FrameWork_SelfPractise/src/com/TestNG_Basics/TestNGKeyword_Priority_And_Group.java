package com.TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeyword_Priority_And_Group 
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
	
	@Test(priority=1,groups="Google")			//TestCase:1
	public void googleTitleTest_TestCase()
	{
		System.out.println("Test Case:  1   : with Execution Order priority");
		boolean isGoogleLogoDisplayed = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println("Test Case:1  :Is TestCase(Google Logo Display) is Passed? : "+isGoogleLogoDisplayed);
	}
	
	@Test(priority=2,groups="Google")			//TestCase:2
	public void googleSearchTest_TestCase()
	{
		System.out.println("Test Case:  2   : with Execution Order priority");
		WebElement googleSearch = driver.findElement(By.xpath("//input[@title='Search']"));
		System.out.println("TestCase(googleSearchTest) Height of googleSearch: "+googleSearch.getSize().getHeight());
	}
	
	@Test(priority=3,groups="GmailCheck")		//TestCase:3
	public void isGmailAvailable_TestCase()
	{
		System.out.println("Test Case:  3   : with Execution Order priority");
		WebElement gmailLinkAvailable = driver.findElement(By.linkText("Gmail"));
		System.out.println("TestCase(gmailLinkAvailable) is Displayed?: "+gmailLinkAvailable.isDisplayed());
	}
	
	
	@AfterMethod	
	public void closeBrowser()
	{
		System.out.println("@AfterMethod: ");
		driver.close();
	}

}
