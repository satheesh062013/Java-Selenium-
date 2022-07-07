package com.TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotations_And_ExecutionSequence 
{
	WebDriver driver;
	
	@BeforeSuite 	//1.Sequence of Execution in TestNG
	
	public void setChromeProperty()
	{
		System.out.println("TestNG execution Sequence: 1 :@BeforeSuite : setChromeProperty");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
	}
	
	@BeforeTest		//2.Sequence of Execution in TestNG
	public void launchBrowser()
	{
		System.out.println("TestNG execution Sequence: 2 :@BeforeTest : launchBrowser");
		driver = new ChromeDriver();
	}
	
	@BeforeClass	//3.Sequence of Execution in TestNG
	public void loginToApp()
	{
		System.out.println("TestNG execution Sequence: 3 :@BeforeClass : loginToApp");
	}
	
	@BeforeMethod	//4.Sequence of Execution in TestNG
	public void enterUrl() 
	{
		System.out.println("TestNG execution Sequence: 4 :@BeforeMethod : enterUrl");
		driver.get("https://www.google.com/");
	}
	
	@Test			//5.Sequence of Execution in TestNG
	public void googleTitleTest_TestCase()
	{
		System.out.println("TestNG execution Sequence: 5 :@Test : googleTitleTest_TestCase");
		boolean isGoogleLogoDisplayed = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		System.out.println("Is TestCase(Google Logo Display) is Passed? : "+isGoogleLogoDisplayed);
	}
	
	@AfterMethod	//6.Sequence of Execution in TestNG
	public void logoutFromApp()
	{
		System.out.println("TestNG execution Sequence: 6 :@AfterMethod : logoutFromApp");
	}
	
	@AfterClass		//7.Sequence of Execution in TestNG
	public void closeBrowser()
	{
		System.out.println("TestNG execution Sequence: 7 :@AfterClass : closeBrowser");
		driver.close();
	}
	
	@AfterTest		//8.Sequence of Execution in TestNG
	public void deleteAllCookies()
	{
		System.out.println("TestNG execution Sequence: 8 :@AfterTest : deleteAllCookies");
		// Exception will Occur as deleteAllCookies Can not be performed once of the Browser is Closed;
		//driver.manage().deleteAllCookies();
	}
	
	@AfterSuite		//9.Sequence of Execution in TestNG
	public void generateTestReport() 
	{
		System.out.println("TestNG execution Sequence: 9 :@AfterSuite : generateTestReport");
	}

}
