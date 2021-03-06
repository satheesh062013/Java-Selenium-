package com.Selenium_Tasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook_WebElements_Custom_XPath 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement createNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createNewAccount.click();
		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		Firstname.sendKeys("Satheeshkumar");
		WebElement Lastname = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
		Lastname.sendKeys("Sekar");
		WebElement MobNo_or_Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobNo_or_Email.sendKeys("9790062514");
		WebElement passWord = driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]"));
		passWord.sendKeys("123456");
		Thread.sleep(5000);
		WebElement closePopUp = driver.findElement(By.xpath("//img[@height='24']"));
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\FB ScreenShot.png",driver);
		
		closePopUp.click();
		Thread.sleep(3000);
		
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
