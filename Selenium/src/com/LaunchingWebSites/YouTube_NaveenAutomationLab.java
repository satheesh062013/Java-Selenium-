package com.LaunchingWebSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTube_NaveenAutomationLab 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("search_query")).sendKeys("selenium by naveen automationlabs");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/section/div[3]/article/header/div/div/a")).click();
		//action.moveToElement(driver.findElement(By.linkText("https://tamilgun.pl/video/beast-full-movie/"))).click().build().perform();
		//Thread.sleep(8000);
	
		driver.findElement(By.id("search-icon-legacy")).click();
		//driver.findElement(By.partialLinkText("Selenium - 3 WebDriver Tutorials - By Naveen AutomationLabs\r\n")).click();
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(3);
		
		driver.findElement(By.linkText("Selenium - 3 WebDriver Tutorials - By Naveen AutomationLabs")).click();
		System.out.println("END OF OPERATION");
		
		
	}}
