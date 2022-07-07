package com.SelfPractise_Selenium;

import org.openqa.selenium.WebDriver;

public abstract class WebPage_ParentClass {

	WebDriver driver;
	public static int a=100;
	
	public WebPage_ParentClass(WebDriver driver) {
	
		this.driver = driver;
	}
	public abstract String getTitle();
	
	
	
}
