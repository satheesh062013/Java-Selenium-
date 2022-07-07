package com.Selenium_Basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadFile 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com/");
		String windowHandle1 = driver.getWindowHandle();
		Thread.sleep(3000);
		driver.navigate().to("https://www.arigs.com/contact/");
		Thread.sleep(3000);
		String windowHandle2 = driver.getWindowHandle();
		System.out.println(windowHandle1);
		System.out.println(windowHandle2);
//		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("input type file"+Keys.ENTER);
//		driver.findElement(By.xpath("//h3[text()='<input type=\"file\">: How to Use This HTML Value »']")).click();
//		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\sgsasek\\Desktop\\jAva\\WebDriver Upload Test.txt");
		
		/*Iterator<String> iterator = windowHandles.iterator();
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.next());*/
		
	
		
	}
}
