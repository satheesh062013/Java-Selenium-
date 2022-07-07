package com.SelfPractise_Selenium;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;

public class WebPage_ChildClass extends WebPage_ParentClass 
{
	public WebPage_ChildClass(WebDriver driver) 
	{
		super(driver);
	}

	@Override
	public String getTitle() 
	{
		return driver.getTitle();
	}
	
	public void add()
	{
		driver.close();
		System.out.println(a);
	}


}
