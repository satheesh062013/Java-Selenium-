package com.LaunchingWebSites;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles_Demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tamilgun.pl/categories/latest/");
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//i[@class='icon-play'])[1]")).click();
		//		WebElement search = driver.findElement(By.xpath("//input[@value='type anything and press enter']"));
		//		search.sendKeys("KGF2"+Keys.ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		//Iterator<String> iterator = windowHandles.iterator();
		
		for(String a:windowHandles)
			System.out.println(a);
			
		
	}
}
