package com.Selenium_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MiniProject_2_Booking_A_Room 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//Chrome SetUp
		MiniProject_2_NewRegister proj_2_Reg = new MiniProject_2_NewRegister();
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sgsasek\\Desktop\\jAva\\Supporting Files\\chromedriver_win32\\chromedriver.exe");
		
		// Browser & Url Launch
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://adactinhotelapp.com/index.php");
		Thread.sleep(2000);	
		
		//LogIn Credentials
		String username ="Satheesh062013";
		String password = "satheesh062013";
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);	
		
		//Drop-Down Select Class LOCATION Option
		System.out.println("***Drop-Down Select Class LOCATION Option***");
		Select locationSelect = new Select(driver.findElement(By.id("location")));
		List<WebElement> locationSelectOption = locationSelect.getOptions();
		for (WebElement locSelOpt : locationSelectOption) {
			System.out.println(locSelOpt.getText());
		}
		locationSelect.selectByIndex(8);	//Paris
		Thread.sleep(1000);
		
		//Drop-Down Select Class HOTEL Option
		System.out.println("***Drop-Down Select Class HOTEL Option***");
		Select hotelSelect = new Select(driver.findElement(By.name("hotels")));
		List<WebElement> hotelSelectOption = hotelSelect.getOptions();
		for (WebElement hotSelOpt : hotelSelectOption) {
		System.out.println(hotSelOpt.getText());
		}
		hotelSelect.selectByValue("Hotel Sunshine");	//Hotel Sunshine
		Thread.sleep(1000);

		//Drop-Down Select Class ROOM-TYPE Option
		System.out.println("***Drop-Down Select Class ROOM-TYPE Option***");
		Select roomSelect = new Select(driver.findElement(By.name("room_type")));
		List<WebElement> roomSelectOption = roomSelect.getOptions();
		for (WebElement roomSelOpt : roomSelectOption) {
		System.out.println(roomSelOpt.getText());
		}
		roomSelect.selectByVisibleText("Super Deluxe");	//Super Deluxe
		Thread.sleep(1000);

		//Drop-Down Select Class NO.OF ROOMS Option
		System.out.println("***Drop-Down Select Class NO.OF ROOMS Option***");
		Select no_Of_RoomSelect = new Select(driver.findElement(By.id("room_nos")));
		List<WebElement> no_Of_RoomSelectOption = no_Of_RoomSelect.getOptions();
		for (WebElement no_Of_RoomSelOpt : no_Of_RoomSelectOption) {
		System.out.println(no_Of_RoomSelOpt.getText());
		}
		no_Of_RoomSelect.selectByValue("3");	//3 - Three
		Thread.sleep(1000);
		
		//checkIn Date
		driver.findElement(By.name("datepick_in")).clear();
		Thread.sleep(1500);
		driver.findElement(By.name("datepick_in")).sendKeys("05/06/2022");
		//CheckOut Date
		driver.findElement(By.name("datepick_out")).clear();
		Thread.sleep(1500);
		driver.findElement(By.name("datepick_out")).sendKeys("10/06/2022");
		
		//Drop-Down Select Class NO.OF ADULTS Option
		System.out.println("***Drop-Down Select Class NO.OF ADULTS Option***");
		Select adults_In_RoomSelect = new Select(driver.findElement(By.name("adult_room")));
		List<WebElement> adults_In_RoomSelectOption = adults_In_RoomSelect.getOptions();
		for (WebElement adults_In_RoomSelOpt : adults_In_RoomSelectOption) {
		System.out.println(adults_In_RoomSelOpt.getText());
		}
		adults_In_RoomSelect.selectByValue("2");	//2 - Two
		Thread.sleep(1000);
		
		//Drop-Down Select Class NO.OF KIDS Option
		System.out.println("***Drop-Down Select Class NO.OF KIDS Option***");
		Select kids_In_RoomSelect = new Select(driver.findElement(By.id("child_room")));
		List<WebElement> kids_In_RoomSelectOption = kids_In_RoomSelect.getOptions();
		for (WebElement kids_In_RoomSelOpt : kids_In_RoomSelectOption) {
		System.out.println(kids_In_RoomSelOpt.getText());
		}
		kids_In_RoomSelect.selectByValue("1");	//1 - One
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		
		System.out.println("Total Booking Amount(Incl.GST) is: "+driver.findElement(By.xpath("//input[@id='final_price_dis']")).getText());
		
		driver.findElement(By.name("first_name")).sendKeys("Satheeshkumar");
		driver.findElement(By.name("last_name")).sendKeys("Sekar");
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("#07-305,JurongWest St42");
		driver.findElement(By.xpath("(//input[@onkeypress='return OnlyNumbersonly(event)'])[1]")).sendKeys("1234 4578 9101 1121");
		
		//Drop-Down Select Class CREDIT CARD Option
		System.out.println("***Drop-Down Select Class CREDIT CARD Option***");
		Select ccSelect = new Select(driver.findElement(By.id("cc_type")));
		List<WebElement> ccSelectOption = ccSelect.getOptions();
		System.out.println("Is this Drop-Down  for CREDIT CARD Option is Multiple Selectable?"+ccSelect.isMultiple());
		for (WebElement ccSelOpt : ccSelectOption) {
		System.out.println(ccSelOpt.getText());
		}
		ccSelect.selectByVisibleText("VISA");	//VISA
		Thread.sleep(1000);
		
		//Drop-Down Select Class CC EXP_MONTH Option
		System.out.println("***Drop-Down Select Class CC EXP_MONTH Option***");
		Select ccExpMonSelect = new Select(driver.findElement(By.id("cc_exp_month")));
		List<WebElement> ccExpMonSelectOption = ccExpMonSelect.getOptions();
		for (WebElement ccExpMonSelOpt : ccExpMonSelectOption) {
		System.out.println(ccExpMonSelOpt.getText());
		}
		ccExpMonSelect.selectByValue("10"); //October
		Thread.sleep(1000);
		
		//Drop-Down Select Class CC EXP_YEAR Option
		System.out.println("***Drop-Down Select Class CC EXP_YEAR Option***");
		Select ccExpYeaSelect = new Select(driver.findElement(By.id("cc_exp_year")));
		List<WebElement> ccExpYeaSelectOption = ccExpYeaSelect.getOptions();
		for (WebElement ccExpYeaSelOpt : ccExpYeaSelectOption) {
		System.out.println(ccExpYeaSelOpt.getText());
		}
		ccExpYeaSelect.selectByVisibleText("2016"); //2016
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]")).sendKeys("789");
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\MiniProject2_BookingInformation.png",driver);
		
		driver.findElement(By.xpath("//input[@value='Book Now']")).click();
		Thread.sleep(8000);
		
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\"
				+ "ScreenShots\\MiniProject2_AfterBookingRoom.png",driver);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		Thread.sleep(2000);
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\Selenium\\ScreenShots\\MiniProject2_Itinerary.png",driver);
		driver.findElement(By.xpath("(//input[contains(@onclick,'window.location')])[2]")).click();
	}
	
	public static void takeScreenShot(String File_Name_Path, WebDriver driver) throws IOException
	{
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File(File_Name_Path);
	FileHandler.copy(src, destination);
	}
}
