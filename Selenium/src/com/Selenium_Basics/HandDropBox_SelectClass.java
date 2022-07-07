package com.Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandDropBox_SelectClass {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/?PARM3_ID=GBH_168&FF11=GBH_168&kw=6256db2c5c66c50001761f3b_14678&mkevt=1&mkcid=16&mkrid=711-155609-835623-2&ufes_redirect=true&mkevt=1&mkcid=16&mkrid=711-155609-835623-2&ufes_redirect=true");
		//Select sl = new Select(driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")));
		Select sl = new Select(driver.findElement(By.name("_sacat")));
		sl.selectByVisibleText("Crafts");
		
		
	}

}
