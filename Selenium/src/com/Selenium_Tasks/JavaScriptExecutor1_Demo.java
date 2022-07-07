package com.Selenium_Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!ETA!108599293!6504095653!491619965162!e!goibibo!c!&gclid=EAIaIQobChMIj6iDtpiR-AIV-5VLBR3tRwjlEAAYASAAEgLiLPD_BwE");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

}
