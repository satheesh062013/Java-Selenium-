package com.Selenium_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		System.out.println("Step1");
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Step2");
		List<String> list= new ArrayList(windowHandles);
		System.out.println("Step3");
		switchToRightWindow("FaceBook", list,driver);
		System.out.println("Step4");
		String pageSource = driver.getPageSource();
	}
	
	public static void switchToRightWindow(String pageSource,List<String> list,WebDriver driver)
	{
		String a[]=new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			a[i]=list.get(i);
			
			if(pageSource.equals(a[i]))
			{
				driver.navigate().to(a[i]);
				System.out.println("Executed");
			}
			else
			{
				SaikuttyException sse = new SaikuttyException();
				throw sse;			
				}
		}
	}

}
