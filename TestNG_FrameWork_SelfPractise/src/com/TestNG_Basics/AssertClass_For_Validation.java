package com.TestNG_Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertClass_For_Validation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void setChromeProperty()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void googleTitleTest() 
	{
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Google Title is: "+title);
		Assert.assertEquals(title, "Google","Not Matched"); //To PASS the Test Case
		//Assert.assertEquals(title, "Google123","Not Matched"); //To FAIL the Test Case
	
	}
	
	@Test
	public void googleLogoTest() 
	{
		driver.get("https://www.google.com/");
		boolean isGoogleLogoDisplayed = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(isGoogleLogoDisplayed, "Not Matched"); //To PASS the Test Case
		//Assert.assertEquals(isGoogleLogoDisplayed, false,"Not Matched"); //To FAIL the Test Case
	}
	
	@AfterMethod
	public void closeChromeBrowser()
	{
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie);
		}
		driver.close();
	}

}
