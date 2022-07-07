package com.Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingAlert_PopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);//Static Wait Timing
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait Timing
		Actions action = new Actions(driver);
		
		driver.findElement(By.name("proceed")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println("Alert Message: "+alert2.getText());
		Thread.sleep(5000);//Static Wait Timing
		alert2.accept();	// Click on OK on the Alert or POP-UP Box
		driver.findElement(By.id("login1")).sendKeys("Satheeshkumar");
		driver.findElement(By.id("password")).sendKeys("Saikutty");
		driver.findElement(By.name("proceed")).click();
		System.out.println("Error Message of False Sign In: "+driver.findElement(By.xpath("//*[@id=\"div_login_error\"]/b")).getText());
	//Get the Text message after the False Sign In:
	}

}
