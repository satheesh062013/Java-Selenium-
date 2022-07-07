package com.Selenium_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_2_Cancel_A_BookedRoom 
{
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		//Chrome SetUp
		MiniProject_2_NewRegister proj_2_Reg = new MiniProject_2_NewRegister();
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		
		// Browser & Url Launch
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://adactinhotelapp.com/index.php");
		Thread.sleep(2000);	
		
		//LogIn Credentials
		String username ="Satheesh062013";
		String password = "satheesh062013";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);	
		
		//Booked Itinerary
		
		List<WebElement> linksInWebPage = driver.findElements(By.tagName("a"));
		System.out.println("Total No. of Links Available in the Web page: "+linksInWebPage.size());
		System.out.println("Link Texts available on the WebPage: ");
		for(int i=0;i<linksInWebPage.size();i++)
		{
			String linkText = linksInWebPage.get(i).getText();
			System.out.println(linkText);
		}	
		
		Actions action = new Actions(driver);
		Robot rb = new Robot();
		
		for(int i=0;i<linksInWebPage.size();i++)
		{
			if(linksInWebPage.get(i).getText().equals("Booked Itinerary"))
			{
				action.contextClick(linksInWebPage.get(i)).perform();
				Thread.sleep(3000);
				rb.keyPress(KeyEvent.VK_DOWN);
				rb.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(3000);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				break;
			}
		}
	
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		
		for(int i=0;i<list.size();i++)
		{
			String currentUrl = driver.switchTo().window(list.get(i)).getCurrentUrl();
			System.out.println(currentUrl);
			if(currentUrl.equals("http://adactinhotelapp.com/BookedItinerary.php"))
			{
			   break;
			}
		}
		//http://adactinhotelapp.com/SearchHotel.php
		//http://adactinhotelapp.com/BookedItinerary.php
		Thread.sleep(7000);
	
		List<WebElement> findElements = driver.findElements(By.xpath("//table[2]/tbody/tr[2]/td/form/table/tbody/tr[2]/td/table/tbody/tr/td"));
		Thread.sleep(5000);
//		for (WebElement webElement : findElements) {
//			System.out.println(webElement.getText());
//			
//		}
		System.out.println("Total Table Contents: "+findElements.size());
		
		
		for(int i=0;i<findElements.size();i++)
		{
			System.out.println(findElements.get(i).getText());
		}
		
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\MiniProject2_CancelBookedItinerary.png",driver);
	}
	
	public static void takeScreenShot(String File_Name_Path, WebDriver driver) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(File_Name_Path);
	FileHandler.copy(src, destination);
	}
}
