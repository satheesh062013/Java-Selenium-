package com.LaunchingWebSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com/ExcessBaggageInternationalOffer.aspx");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
//		driver.findElement(By.linkText("Hot Meals")).click();
		
		Select sl = new Select(driver.findElement(By.id("highlight-addons")));
		sl.selectByVisibleText("Hot Meals");
		
		Thread.sleep(10000);
		driver.quit();
	}

}
