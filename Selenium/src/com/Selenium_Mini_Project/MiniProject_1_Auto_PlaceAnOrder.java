package com.Selenium_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.Selenium_Tasks.JavaScriptExecutor;

public class MiniProject_1_Auto_PlaceAnOrder {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
				
		//Click On SignIn
		driver.findElement(By.xpath("//a[@class='login']")).click();
				
		Actions action = new Actions(driver);
				
		//Click on E-Mail Just to check
		action.moveToElement(driver.findElement(By.id("email_create"))).click().perform();
		
		driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]")).sendKeys("satheesh062013@gmail.com");
		driver.findElement(By.xpath("//input[@data-validate='isPasswd']")).sendKeys("satheesh062013");
		//Using Actions Class to Click On SignIn
		action.click(driver.findElement(By.xpath("(//button[@type='submit'])[3]"))).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		
		Select selectTShirts = new Select(driver.findElement(By.id("selectProductSort")));
		
		selectTShirts.selectByVisibleText("In stock");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		action.moveToElement(driver.findElement(By.linkText("Faded Short Sleeve T-shirts"))).perform();
				
		//Right Click On Add To Cart to Open in New Window
		action.contextClick(driver.findElement(By.xpath("//a[@title='Add to cart']"))).perform();
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			System.out.println(driver.switchTo().window(string).getTitle());
		}
		
		for (String windowID : windowHandles) {
			if(driver.switchTo().window(windowID).getTitle().equals("Order - My Store"))
			{
				driver.switchTo().window(windowID);
			}
		}
		
		js.executeScript("window.scrollBy(0,500)");
		int increaseQtyBy = 4;
		for(int a= 1;a<=increaseQtyBy;a++)
		{
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.linkText("Proceed to checkout")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,800)");
		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,900)");
		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(3000);
		WebElement orderSuccessMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		System.out.println(orderSuccessMessage.getText());
		js.executeScript("window.scrollBy(0,400)");

		//Take Screen Shot 
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\AutomationPracticeSuccessfulOrderPlace.png");
		FileHandler.copy(src, destination);
		
		// To be Tested for Knowledge
		
		/*//WebElement defaultQTY1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		WebElement defaultQTY1 = driver.findElement(By.xpath("//table/tbody/tr/td[5]/input[1]"));
		String defaultQTY2 = defaultQTY1.getText();
		
		System.out.println("Default QTY of Selected Item: "+ defaultQTY2);
		Integer defaultQTY3 = Integer.parseInt(defaultQTY2);
		int defaultQTY = defaultQTY3;
		int increaseQtyBy = 5;
	
		for(int a= defaultQTY;a<=defaultQTY+increaseQtyBy;a++)
		{
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
			Thread.sleep(2000);
		}
		
		WebElement increasedQTY = driver.findElement(By.xpath("//input[@name='quantity_1_1_0_686310']"));	
		System.out.println("Increased QTY of Selected Item: "+ increasedQTY);
		
		//Thread.sleep(2000);
		
		
		js.executeScript("window.scrollBy(0,1500)");
		js.executeScript("arguments[0].scrollInToView();", driver.findElement(By.xpath("//div[@data-type='price']")));
		
		WebElement priceRange = driver.findElement(By.xpath("//a[@style='left: 0%;']"));
		WebElement priceRangeBar = driver.findElement(By.xpath("//div[@data-type='price']"));
		//js.executeScript("arguments[0].scrollInToView();", priceRange);
		//action.clickAndHold(driver.findElement(By.xpath("//a[@style='left: 0%;']")));   
		boolean displayed = priceRange.isDisplayed();
		System.out.println(displayed);
		System.out.println(priceRangeBar.isDisplayed());
		
		WebElement price = driver.findElement(By.xpath("//span[@id='layered_price_range']"));
		System.out.println(price.getText());*/
	}
}
