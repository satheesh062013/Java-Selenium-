package com.Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators_HandsOn 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.findElement(By.id("ap_email")).sendKeys("9790062514");
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys("saikutty");
	    //driver.findElement(By.name("rememberMe")).click();
	    driver.findElement(By.id("auth-signin-button")).click();	 
	    //driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]     nav-item-signout")).click();
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
	    try {
	    driver.findElement(By.xpath("//*[@id=\\\"nav-item-signout\\\"]")).click();
	    }
	    catch(Exception e)
	    {
	    	//System.out.println(e.getLocalizedMessage());
	    	System.out.println(e.getCause());
	    	driver.findElement(By.id("nav-item-signout")).click();
	    }
	    finally
	    {
	    	System.out.println("Instead of xpath id is Used");
	    }
	    driver.close();
	   
	}
}
