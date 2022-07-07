package com.Selenium_Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Find_TotalLinks_In_A_WebPage 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);//Static Wait Timing
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		List<WebElement> linksInFaceBook = driver.findElements(By.tagName("a"));
		System.out.println("Total No. of Links Available in FaceBook: "+linksInFaceBook.size());
		
		Robot rb = new Robot();
		Actions action = new Actions(driver);
		
		for(int i=0;i<linksInFaceBook.size();i++)
		{
			System.out.println(linksInFaceBook.get(i).getText());
		}
		
		for(int i=0;i<linksInFaceBook.size();i++)
		{
			if(linksInFaceBook.get(i).getText().equals("Sign Up")) //Check for Sign Up Link with the help of Text
			{
				WebElement linkToClick = linksInFaceBook.get(i);
				
				//linkToClick.click();  //Open Sign Up link on the Same Page
				
				//Open the Sign Up Link in New-Tab
				
				action.contextClick(linkToClick).perform();
				rb.keyPress(KeyEvent.VK_DOWN);
				rb.keyRelease(KeyEvent.VK_DOWN);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);			
			}
		}
	}
}
