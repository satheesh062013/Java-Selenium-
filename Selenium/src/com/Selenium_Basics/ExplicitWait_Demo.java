package com.Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Demo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crisp.co/do-videos-impact-your-websites-load-time/");
		clickOn(driver,driver.findElement(By.xpath("//a[@class='navbar__tel']")),20);
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--diable-notifications");
		
		System.out.println("THE END");
	}
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout)
	{
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
	
	

}
