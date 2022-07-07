package com.LaunchingWebSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Launch_Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Saikutty");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Satheesh");
		String MobileNo = "+919790062514";
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(MobileNo);
		String password = "Saipranav040117";
		driver.findElement(By.xpath("//input[contains(@autocomplete,'new-password')]")).sendKeys(password);
		driver.findElement(By.id("day")).sendKeys("4");
		driver.findElement(By.id("month")).sendKeys("Jan");
		driver.findElement(By.xpath("//option[text()='2017']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys(MobileNo);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();*/
		String MobileNo = "+919790062514";
		String password = "Saikutty003";
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(MobileNo);
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
//		driver.findElement(By.xpath("//span[text()='OK']")).click();
//		driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Write a comment…']")).sendKeys("Nice...");
		
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//span[text()='Like']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//div[text()='Write a comment…']")).sendKeys("Nice..."+ Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
