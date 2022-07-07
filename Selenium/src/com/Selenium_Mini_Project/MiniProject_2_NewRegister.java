package com.Selenium_Mini_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MiniProject_2_NewRegister {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(3000);	
		
		String username ="Satheesh062013";
		String password = "satheesh062013";
		driver.findElement(By.linkText("New User Register Here")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(password);
		driver.findElement(By.name("full_name")).sendKeys("Satheeshkumar Sekar");
		driver.findElement(By.id("email_add")).sendKeys("satheesh062013@gmail.com");
		
		driver.findElement(By.xpath("//img[@alt='Refresh Captcha']")).click();	
		Thread.sleep(20000);		
		WebElement captcha = driver.findElement(By.xpath("//img[@id='captcha']"));
		String captchaText = captcha.getText();
		System.out.println("Captcha Text: "+captchaText);
		
		driver.findElement(By.xpath("//input[@id='captcha-form']")).sendKeys(captchaText);
		
		driver.findElement(By.xpath("//input[@name='tnc_box']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);	
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\MiniProject2_AfterRegister.png",driver);
		
	}
	public static void takeScreenShot(String File_Name_Path, WebDriver driver) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(File_Name_Path);
	FileHandler.copy(src, destination);
	}

}
