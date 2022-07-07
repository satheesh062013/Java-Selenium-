package com.PageObjectModel_POM_CLasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Adactin 
{
	WebDriver driver;
	
	public LoginPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@name='login']")
	private WebElement loginbtn;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
}
