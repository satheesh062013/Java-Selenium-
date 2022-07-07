package com.Selenium_Tasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutor 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.h2kinfosys.com/blog/javascriptexecutor-in-selenium-webdriver-with-example/");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\JavaScriptExecutor_Before",driver);
		
		driver.findElement(By.xpath("//button[text()='X']")).click();;
		//WebElement addComment = driver.findElement(By.xpath("//textarea[text()='Message']"));
		
		driver.switchTo().frame(0);
		
		WebElement addComment = driver.findElement(By.xpath("//textarea[@aria-label='Add a comment']"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", addComment);
		//addComment.sendKeys("Satheesh");
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\JavaScriptExecutor_After",driver);
	}
	
	public static void takeScreenShot(String File_Path_Name, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(File_Path_Name.concat(".png")));
	}
}
