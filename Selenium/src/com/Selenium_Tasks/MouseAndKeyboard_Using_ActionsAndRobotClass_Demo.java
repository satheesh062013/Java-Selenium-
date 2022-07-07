package com.Selenium_Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.Spliterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MouseAndKeyboard_Using_ActionsAndRobotClass_Demo 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		
		// Mouse Over on a WebElement (PRIME)
		action.moveToElement(driver.findElement(By.xpath("//span[text()='Prime']"))).build().perform();
		Thread.sleep(3000);
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\MouseOverAction",driver);
	
		
		//RightClick on a WebElement  (ELECTRONICS)
		action.contextClick(driver.findElement(By.xpath("//a[text()=' Electronics ']"))).perform();
				
		// Virtual KeyBoard Use by Robot Class
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		//The Below ScreenShot Won't be taken
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\RightClick & KeyboardPressDown",driver);
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		for(int i=1;i<=5;i++)
		{
			try {
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
			}
			catch(Exception e)
			{
				action.click(driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"))).perform();
				if(i>=1 && i<=5)
				{
					System.out.println("******************");
					System.out.println(e.getLocalizedMessage());
					System.out.println("******************");
					System.out.println(e.getMessage());
					System.out.println("******************");
					System.out.println(e.getCause());
					System.out.println("******************");
				}
			}
			Thread.sleep(2000);
		}
		
		//WindowHandle's  //Switch Windows
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();	
		while(iterator.hasNext())
		{	
			System.out.println(iterator.next());
			int i=1;
			if(i==1)
				driver.switchTo().window(iterator.next());
		}
		
		System.out.println("\n\n\nCompleted");
	}
	
	public static void takeScreenShot(String File_Path_Name, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		FileHandler.copy(ts.getScreenshotAs(OutputType.FILE), new File(File_Path_Name.concat(".png")));

	}
 
}
