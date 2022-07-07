package com.LaunchingWebSites;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class launch_RedBus 
{
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(2);	     
		// Swap to Frame(2)
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='icon icon-down']")).click();
		// Click On PhoneCode to access
		Thread.sleep(8000);
		driver.findElement(By.xpath("//li[@id='IND']")).click();
		// Click on India's Phone Code
		Thread.sleep(8000);
		driver.findElement(By.id("mobileNoInp")).sendKeys("9790062514");
		// Enter the Mobile Number
		
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//label[@aria-hidden='true']")).click();
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();// In Between Click on CAPCHA*/
		
		Thread.sleep(15000);
		driver.findElement(By.id("otp-container")).click();	
		// Click on OTP
		Thread.sleep(10000);					
		// Enter the OTP in Between
		driver.findElement(By.xpath("//button[@id='verifyUser']")).click();	
		// Click On Verify OTP
		Thread.sleep(6000);
		try 
		{
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();	
		// Click On Confirm
		}
		catch(Exception e)
		{
		System.out.println("*****SOMETHING WENT WRONG*****\n\n"+e.getMessage());
		System.out.println("\n\ngetCause(): \n\n "+e.getCause());
		System.out.println("\n\nSTACK TRACE: \n\n "+e.getMessage());
		}
		finally 
		{
			Thread.sleep(10000); 
			driver.close();      // Close the Browser Properly
		}		
	}

}
