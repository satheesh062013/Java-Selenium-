package com.SelfPractise_Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_TestNG_Maven_Demo 
{
	@Test
	public void login()
	{
		/*  Below Line Replaces the Browser Driver File Path:
		 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe FILE PATH");  */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.getPageSource();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		System.out.println("WebPage Title: "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "OrangeHRM", "Wrong Title");
		driver.close();
	}
}
