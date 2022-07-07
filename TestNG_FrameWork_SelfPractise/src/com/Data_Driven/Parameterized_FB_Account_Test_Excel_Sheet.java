package com.Data_Driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Excel_Utilities.Xls_Reader;

public class Parameterized_FB_Account_Test_Excel_Sheet {

	public static void main(String[] args) throws InterruptedException {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\TestNG_FrameWork_SelfPractise\\Test_Data\\TestData.xlsx");
		
		
		String firstname = reader.getCellData("TestData1", "firstname", 2);
		String lastname = reader.getCellData("TestData1", "surname", 2);
		String emailaddress = reader.getCellData("TestData1", "emailaddress", 2);
		String password = reader.getCellData("TestData1", "password", 2);
		String birthdate = reader.getCellData("TestData1", "birthdate", 2);
		System.out.println(birthdate);
		Integer dob = Math.round(Float.parseFloat(birthdate));
		
		String birthmonth = reader.getCellData("TestData1", "birthmonth", 2);
		Integer month = Math.round(Float.parseFloat(birthmonth));
		
		String birthYear = reader.getCellData("TestData1", "birthyear", 2);
		
	
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("reg_email__")).sendKeys(emailaddress);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(emailaddress);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
		Select birthDay = new Select(driver.findElement(By.id("day")));
		birthDay.selectByValue(""+dob);
		
		Select birthMonth = new Select(driver.findElement(By.id("month")));
		birthMonth.selectByValue(""+month);
		
		Select birthyear = new Select(driver.findElement(By.id("year")));
		birthyear.selectByIndex(34);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
