package com.LaunchingWebSites;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class WebDriver_BasicMethods 
{
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		String title1 = driver.getTitle();
		System.out.println("Title of 1st Web Page: "+title1);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println("URL of 1st Web Page: "+currentUrl1);

		driver.navigate().to("https://www.facebook.com/");
		String title2 = driver.getTitle();
		System.out.println("Title of 2nd Web Page: "+title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("URL of 2nd Web Page: "+currentUrl2);
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\WebdriverbasicMethods.png",driver);
		
		driver.navigate().refresh();
		
		driver.close();
	}
	
	public static void takeScreenShot(String FilePath_Name_Format,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(FilePath_Name_Format);
		FileHandler.copy(source, destination);
	}
}
