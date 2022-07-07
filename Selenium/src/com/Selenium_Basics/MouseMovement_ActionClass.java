package com.Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement_ActionClass {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);//Static Wait Timing
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //Dynamic Wait Timing
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
	}

}
