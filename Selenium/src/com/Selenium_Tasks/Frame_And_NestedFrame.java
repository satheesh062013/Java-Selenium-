package com.Selenium_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_And_NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		System.out.println("**********Single Frame**********");
		
		driver.findElement(By.linkText("Single Iframe")).click();
		Thread.sleep(3000);
		
		// Switch to frame by Index
		//driver.switchTo().frame(0);  
		
		// Switch to frame by iframe attribute "id or name"
		//driver.switchTo().frame("singleframe");  
		
		// Switch to frame by WebElement
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(singleFrame); //ERROR
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Good Evening!!!");
		driver.switchTo().defaultContent();  //To Switch again to WebPage
		
		Thread.sleep(5000);
		
		System.out.println("**********Nested Frame**********");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(3000);
		//WebPage	---> Parent Frame through WebElement
		WebElement multiple_ParentFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(multiple_ParentFrame);
		
		//Parent Frame	---> Child Frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Satheeshkumar!!!");
		
		//Switch to Parent Frame
		//driver.switchTo().frame(1);   //ERROR
		driver.switchTo().parentFrame();
		
		//Switch to WebPage
		//driver.switchTo().defaultContent();
		System.out.println("The End");
	}

}
