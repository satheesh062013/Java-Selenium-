package com.SelfPractise_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class Edge_Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\edgedriver_win64 (1)\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
		driver.get("https://sasportal.in.abb.com/irj/portal");
		}
		catch(Exception e)
		{
		WebElement failedUrl = driver.findElement(By.xpath("//p[contains(text(),'It looks like the webpage at ')]"));
		System.out.println(failedUrl.getText());
			if(failedUrl.getText().contains("might be having issues"))
			{
				System.out.println("Check Whether the VPN connection is Established");
			}
			else
				System.out.println("Look for Other Issues: ");
		}
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Cafe HR']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='HR Group Tools']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("//iframe[@name='contentAreaFrame']"));
		driver.switchTo().frame(findElement);
		//WebElement findElement2 = driver.findElement(By.xpath("//iframe[@name='HR Group Tools']"));
		driver.switchTo().frame("HR Group Tools");
		driver.findElement(By.xpath("//img[@name='nav10']")).click();
		driver.switchTo().defaultContent();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			String title = driver.switchTo().window(string).getTitle();
//			System.out.println(title);
			if(title.equals("Sign in to your account"))
				driver.switchTo().window(string);
		}
		
		
		driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("satheeshkumar.sekar@sg.abb.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@displayname='Employee Self-Service']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Internal Career Portal']")).click();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		for (String string : windowHandles2) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
			if(title.equals("Home Revisited | Internal Mobility"))
				driver.switchTo().window(string);
		}
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"search\"]"));//label[text()='Enter job title, location or employee name']//input[@role='search']//input[@placeholder='Enter job title or location']
		element.sendKeys("Java Selenium Cucumber");
		
//		try {
//			Edge_Browser.takeScreenShot(driver, "C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\Edge_Browser.png");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		//driver.quit();
	}
	
	static public void takeScreenShot(WebDriver driver, String filepath_name_format) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File(filepath_name_format);
		FileHandler.copy(src,desti);
	}

}
