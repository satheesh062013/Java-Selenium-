package com.SelfPractise_Selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_103.0.5060.53\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
/*		driver.get("https://www.google.com/?gfe_rd=cr&ei=jmZFV-m_BoHU8gfHyIKgBQ&gws_rd=ssl");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		
		Actions ac = new Actions(driver);
		//ac.contextClick().build().perform();		
		ac.contextClick().perform();
		ac.
		Robot rb = new Robot();
			
		for(int i=1;i<=10;i++)
		{
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			if(i==10) {
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
			}		
			Thread.sleep(500);
		}
*/
		
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement chooseFile = driver.findElement(By.xpath("//input[@class='upload_txt']"));
		chooseFile.sendKeys("C:\\Users\\sgsasek\\Desktop\\jAva\\1TestUpload.docx");
//		Thread.sleep(3000);
//		driver.close();
//		
	}

}
