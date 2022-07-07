package com.Selenium_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_XPath 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement findElement = driver.findElement(By.xpath("//table/tbody/tr"));
		System.out.println(findElement.getText());
		
		System.out.println("*************ALL DATA*************");
		
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement alldata : allData)
			System.out.println(alldata.getText());
			
		System.out.println("*************ROW DATA*************");
			
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		for (WebElement rowdata : rowData) 
			System.out.println(rowdata.getText());
			
		System.out.println("*************COLUMN DATA*************");
			
		List<WebElement> colData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (WebElement coldata1 : colData) {
			System.out.println(coldata1.getText());
			
		}
		
		System.out.println("*************SINGLE DATA*************");
		WebElement singleElement = driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		System.out.println(singleElement.getText());
	}
}
