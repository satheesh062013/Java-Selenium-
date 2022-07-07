package com.SelfPractise_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_HeadlessBrowser {

	public static void main(String[] args) {
		
//		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
