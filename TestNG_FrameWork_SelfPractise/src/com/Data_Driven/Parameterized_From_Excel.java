package com.Data_Driven;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Excel_Utilities.Xls_Reader;

public class Parameterized_From_Excel 
{
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32_101.0.4951.41\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(5000);
	}
	
	@Test(dataProvider="getData")
	public void faceBookAccount(String firstname,String lastname,String emailaddress,String password,String dob,String month,String year) throws InterruptedException
	{
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(emailaddress);
		driver.findElement(By.name("reg_email_confirmation__")).clear();
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(emailaddress);
		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
		int dob1 = Math.round(Float.parseFloat(dob));
		Select birthDay = new Select(driver.findElement(By.id("day")));
		birthDay.selectByValue(""+dob1);
		
		int month1 = Math.round(Float.parseFloat(month));
		Select birthMonth = new Select(driver.findElement(By.id("month")));
		birthMonth.selectByValue(""+month1);
		
		int year1 = Math.round(Float.parseFloat(year));
		Select birthyear = new Select(driver.findElement(By.id("year")));
		birthyear.selectByVisibleText(""+year1);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(5000);
	}
	
	
	@DataProvider
	public Iterator<String[]> getData()
	{
		ArrayList<String[]> readData = readData();
		return readData.iterator();
	}
	
	public static ArrayList<String[]> readData() 
	{
		//Excel Data from TestData in Test_Data
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\TestNG_FrameWork_SelfPractise\\src\\com\\Data_Driven\\TestData_for_FB_Account_Create.xlsx");
		ArrayList<String[]> al=new ArrayList<String[]>();
		for(int rowCount=2;rowCount<=reader.getRowCount("TestData1");rowCount++)
		{
			String firstname = reader.getCellData("TestData1", "firstname", rowCount);
			String surname = reader.getCellData("TestData1", "surname", rowCount);
			String emailaddress = reader.getCellData("TestData1", "emailaddress", rowCount);
			String password = reader.getCellData("TestData1", "password", rowCount);
			String birthdate = reader.getCellData("TestData1", "birthdate", rowCount);
			String birthmonth = reader.getCellData("TestData1", "birthmonth", rowCount);
			String birthyear = reader.getCellData("TestData1", "birthyear", rowCount);
			
			String data[]= {firstname,surname,emailaddress,password,birthdate,birthmonth,birthyear};
			al.add(data);
		}
		return al;
	}

}
