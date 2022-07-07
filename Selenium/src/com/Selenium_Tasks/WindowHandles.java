package com.Selenium_Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WindowHandles 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		Robot rb = new Robot();
		
		//About
		action.moveToElement(driver.findElement(By.xpath("//a[text()='About']"))).contextClick().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		
		//Advertising
		action.contextClick(driver.findElement(By.linkText("Advertising"))).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Store
		action.contextClick(driver.findElement(By.linkText("Store"))).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Tamil
		action.contextClick(driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[3]"))).perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.get("https://www.facebook.com/"); //Change to FaceBook
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
		Thread.sleep(5000);
		rb.mouseMove(300, 300); 
		Thread.sleep(5000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList(windowHandles);
		String windowId[] = new String[windowHandles.size()];
		
		for (int i=0;i<windowHandles.size();i++) 
		{
		System.out.println("window ID is: "+al.get(i));
		windowId[i] = driver.switchTo().window(al.get(i)).getTitle();
		System.out.println("Window Title is: "+windowId[i]);
		}
		
		String switchToWindow = "Get More Customers With Easy Online Advertising | Google Ads";
		
		for (int i=0;i<windowHandles.size();i++) 
			{
			if(windowId[i].equals(switchToWindow))
				{
				driver.switchTo().window(al.get(i));
				System.out.println("Window ID found: "+al.get(i));
				}
			}
		Thread.sleep(6000);
		String text = driver.findElement(By.xpath("//span[@class='ng-binding ng-isolate-scope']")).getText();
		System.out.println("***************"+"\n\n"+text);
		
		System.out.println(windowHandles);
		for (String string : windowHandles) {
			System.out.println(string);
			
		}
	}
}
