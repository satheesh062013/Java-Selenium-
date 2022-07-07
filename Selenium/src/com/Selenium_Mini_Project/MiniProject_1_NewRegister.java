package com.Selenium_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_1_NewRegister 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		//SignIn
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		Actions action = new Actions(driver);
		
		//Click on E-Mail
		action.moveToElement(driver.findElement(By.id("email_create"))).click().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("email_create")).sendKeys("satheesh062013@gmail.com");
		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Satheeshkumar");
		driver.findElement(By.id("customer_lastname")).sendKeys("Sekar");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("satheesh062013");
		
		Select selectDay = new Select(driver.findElement(By.id("days")));
		selectDay.selectByIndex(30);
		
		Select selectMonth = new Select(driver.findElement(By.name("months")));
		selectMonth.selectByValue("10");
		
		Select selectYear = new Select(driver.findElement(By.id("years")));
		selectYear.selectByVisibleText("1988  ");
		
		driver.findElement(By.id("newsletter")).click();
		
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Satheeshkumar");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Sekar");
		driver.findElement(By.id("company")).clear();
		driver.findElement(By.id("company")).sendKeys("ABB");
		
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("JurongWest St42");
		
		driver.findElement(By.xpath("//input[@name='address2']")).clear();
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("#07-305");
	
		driver.findElement(By.id("city")).sendKeys("Chennai");
		
		Select selectState = new Select(driver.findElement(By.id("id_state")));
		selectState.selectByVisibleText("Texas");
		
		driver.findElement(By.id("postcode")).clear();
		driver.findElement(By.id("postcode")).sendKeys("00000");
		
		Select selectCountry = new Select(driver.findElement(By.id("id_country")));
		selectCountry.selectByValue("21");
		
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("NA");
		driver.findElement(By.name("phone")).sendKeys("9790062514");
		
		driver.findElement(By.name("phone_mobile")).sendKeys("9790062514");
		
		driver.findElement(By.xpath("//input[@value='My address']")).clear();
		driver.findElement(By.xpath("//input[@value='My address']")).sendKeys("JurongWest St42");
		
		Thread.sleep(5000);
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\AutomationPracticeBeforeRegister.png",driver);
		
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
		
		Thread.sleep(3000);
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\AutomationPracticeAfterRegister.png",driver);
		
		Thread.sleep(10000);
		driver.close();
	}
	
	public static void takeScreenShot(String filePath_Name_Format,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filePath_Name_Format);
		FileHandler.copy(src, destination);
	}

}
