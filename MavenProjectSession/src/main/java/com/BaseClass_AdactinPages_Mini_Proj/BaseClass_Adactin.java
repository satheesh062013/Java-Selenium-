package com.BaseClass_AdactinPages_Mini_Proj;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Adactin 
{
	static WebDriver driver;
	
	//Launch Browser
	public static WebDriver launchBrowser(String Browsername) 
	{
		if(Browsername.equalsIgnoreCase("chrome"))
		{
//			System.setProperty("webdriver.chrome.driver", 
//			"C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Log: Chrome Browser Launched");
		}
		
		else if(Browsername.equalsIgnoreCase("firefox") || Browsername.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Log: FireFox/Gecko Browser Launched");
		}
		
		else if(Browsername.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			System.out.println("Log: MS Edge Browser Launched");
		}
		else
			System.out.println("Log: No Such WebDriver is found & Error in Browser Launch ");
		
		return driver;
	}
	
	//Launch URL
	public static void launchUrl(String Url) 
	{
		driver.get(Url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Log: Application URL Launched");
	}
	
	//CloseWindow
	public static void closeWindow() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.close();
		System.out.println("Log: Cookies Deleted & Window Closed");
	}
	
	//Quit Browser
	public static void quitBrowser() throws InterruptedException 
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Log: Cookies Deleted & Browser Closed");
	}
	
	//Find WebElement
	public static WebElement find_A_WebElement(String xpath_Value) throws InterruptedException
	{
		WebElement findElement = driver.findElement(By.xpath(xpath_Value));
		Thread.sleep(1000);
//		System.out.println("Log: WebElement Found");
		return findElement;		
	}
	
	//SendKeys
	public static void sendKeysIn(WebElement element, String input) throws InterruptedException 
	{
		element.clear(); //Used Wrapper Function Concept
		element.sendKeys(input);
		System.out.println("Log: WebElement Found & Input Passed");
	}
	
	//Click On
	public static void clickOnElement(WebElement element) throws InterruptedException
	{
		element.click();
		System.out.println("Log: WebElement clicked");
	}
	
	//Select_Class By Index
	static public void selectElementByIndex(WebElement element, int index_to_Select) throws InterruptedException
	{
		Select sel = new Select(element);
		sel.selectByIndex(index_to_Select);
		Thread.sleep(1000);
		System.out.println("Log: Selected By Index");
	}
	
	//Select_Class By Value
	static public void selectElementByValue(WebElement element, String value_to_Select) throws InterruptedException
	{
		Select sel = new Select(element);
		sel.selectByValue(value_to_Select);
		Thread.sleep(1000);
		System.out.println("Log: Selected By Value");
	}
	
	//Select_Class By Visible Text
	static public void selectElementByVisibleText(WebElement element, String text_to_Select) throws InterruptedException
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text_to_Select);
		Thread.sleep(1000);
		System.out.println("Log: Selected By VisibleText");
	}
	
	//GetAllOptions
	static public void getAllOptions(WebElement element)
	{
		System.out.println("Options:");
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	
	}
	
	//TakeScreenShot
	public static void takeScreenShot(String File_Name_Path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(File_Name_Path);
		FileHandler.copy(src, destination);
		System.out.println("Log: ScreenShot Taken");
	}
}
