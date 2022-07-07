package com.LaunchingWebSites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch_OwnWesite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.com/");	
		// Launch the Website
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='sc-jTzLTM bfMZDh']")).click(); 
		//Accept the Initial POP-UP
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		// Click On Profile
		driver.findElement(By.xpath("//li[contains(@class,'config-options')]")).click();
		// Click SignIn/SignUp on HomePage
		Thread.sleep(8000);
		driver.switchTo().frame(8);	     
		// Swap to Frame(2)
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[@class='icon icon-down']")).click();
//		// Click On PhoneCode to access
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//li[@id='IND']")).click();
//		// Click on India's Phone Code
//		Thread.sleep(8000);
//		driver.findElement(By.id("mobileNoInp")).sendKeys("9790062514");
//		// Enter the Mobile Number
		
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[@aria-hidden='true']")).click();
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();// In Between Click on CAPCHA*/
		
		
		//driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();	
		//driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();	
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]"))).click().build().perform();
		
		//driver.findElement(By.xpath("//svg[@xmlns='http://www.w3.org/2000/svg']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='satheesh062013@gmail.com']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
