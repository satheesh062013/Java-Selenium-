package com.Selenium_Tasks;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.compress.utils.FileNameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Using_SelectClass_Demo 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("leafgroung"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Selenium Playground: TestLeaf']")).click();
		driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\Beforedropdown.png",driver);
		
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select selIndex =new Select(dropdown1);
		if(selIndex.isMultiple()==true)
			System.out.println(selIndex.isMultiple());
		else
			selIndex.selectByIndex(4);
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown1.png",driver);
		
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select selText =new Select(dropdown2);
		selText.selectByValue("3");
		Thread.sleep(3000);
		selText.selectByIndex(0);
		Thread.sleep(3000);
		selText.selectByVisibleText("Appium");
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown2.png",driver);
		
		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select selValue =new Select(dropdown3);
		selValue.selectByValue("1");
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown3.png",driver);
		
		
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select dropDownOptions =new Select(dropdown3);
		List<WebElement> options = dropDownOptions.getOptions();
		/*for(WebElement a:options)
			System.out.println(a.getText());*/
		Iterator<WebElement> iterator = options.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next().getText());
		dropDownOptions.selectByVisibleText("UFT/QTP");
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown4.png",driver);
		
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("Loadrunner");
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown5.png",driver);
		
		WebElement dropdown6 = driver.findElement(By.xpath("(//select)[6]"));
		Select selMultipleOption = new Select(dropdown6);
		System.out.println(selMultipleOption.isMultiple());
		selMultipleOption.selectByIndex(1);
		selMultipleOption.selectByValue("0");
		selMultipleOption.selectByVisibleText("Appium");
		selMultipleOption.selectByIndex(3);
		selMultipleOption.selectByValue("4");
		//takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown6-1.png",driver);
		
		System.out.println(selMultipleOption.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		selMultipleOption.deselectByVisibleText("UFT/QTP");
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\dropdown6-2.png",driver);
		
		
	}
	
	public static void takeScreenShot(String FilePath_Name_Format,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(FilePath_Name_Format);
		FileHandler.copy(source, destination);
	}

}
