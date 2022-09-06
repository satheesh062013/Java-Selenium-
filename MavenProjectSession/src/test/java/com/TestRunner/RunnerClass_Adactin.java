package com.TestRunner;

import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass_AdactinPages_Mini_Proj.BaseClass_Adactin;
import com.PageObjectManager.Page_Object_Manager;
import com.Properties.File_Reader_Manager;

public class RunnerClass_Adactin extends BaseClass_Adactin 
{
	
	static WebDriver driver = launchBrowser("chrome");
	
	static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//String browserName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getbrowserName();
		//driver = launchBrowser(browserName);
		String urlAddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturlAddress();
		launchUrl(urlAddress);
		
		//LoginPage
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		sendKeysIn(pom.getInstanceLoginPage().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		sendKeysIn(pom.getInstanceLoginPage().getPassword(), password);
		
		clickOnElement(pom.getInstanceLoginPage().getLoginbtn());

		//SearchPage
		selectElementByIndex(pom.getInstanceSearchPage().getLocation(), 8);
		selectElementByValue(pom.getInstanceSearchPage().getHotels(), "Hotel Sunshine");
		selectElementByVisibleText(pom.getInstanceSearchPage().getRoomtype(), "Super Deluxe");
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_rooms(), "3");
		pom.getInstanceSearchPage().getDatepick_In().clear();
		sendKeysIn(pom.getInstanceSearchPage().getDatepick_In(), "15/06/2022");
		pom.getInstanceSearchPage().getDatepick_Out().clear();
		sendKeysIn(pom.getInstanceSearchPage().getDatepick_Out(), "20/06/2022");
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_adultRooms(), "2");
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_childRooms(), "1");
		clickOnElement(pom.getInstanceSearchPage().getSearchbtn());
		
		//ItineraryPage
		clickOnElement(pom.getInstanceItineraryPage().getRadiobtn());
		clickOnElement(pom.getInstanceItineraryPage().getContinuebtn());
//		System.out.println("Total Booking Amount(Incl.GST) is: "+find_A_WebElement("//input[@id='final_price_dis']").getText());
		
		//BookingPage
		pom.getInstanceBookingPage().getFirstname().clear();
		sendKeysIn(pom.getInstanceBookingPage().getFirstname(), "Satheeshkumar");
		pom.getInstanceBookingPage().getLastname().clear();
		sendKeysIn(pom.getInstanceBookingPage().getLastname(), "Sekar");
		pom.getInstanceBookingPage().getAddress().clear();
		sendKeysIn(pom.getInstanceBookingPage().getAddress(), "#07-305,JurongWest St42");
		pom.getInstanceBookingPage().getCreditCard_No().clear();
		sendKeysIn(pom.getInstanceBookingPage().getCreditCard_No(), "1234 4578 9101 1121");
		selectElementByVisibleText(pom.getInstanceBookingPage().getCreditCard_Type(), "VISA");
		selectElementByValue(pom.getInstanceBookingPage().getCreditCard_Exp_Month(), "10");
		selectElementByVisibleText(pom.getInstanceBookingPage().getCreditCard_Exp_Year(), "2016");
		pom.getInstanceBookingPage().getCvv_No().clear();
		sendKeysIn(pom.getInstanceBookingPage().getCvv_No(), "789");
		clickOnElement(pom.getInstanceBookingPage().getBookNowbtn());
		
		//BookingConfirmationPage
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceBookingConfirmationPage().getMyItinerarybtn());
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\ScreenShot\\Adctin_Itinerary_14JUN2022.jpg");
		
		//BookingItineraryPage
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceBookingItineraryPage().getlogOutbtn());
		takeScreenShot("C:\\Users\\sgsasek\\Desktop\\jAva\\eclipse-workspace\\MavenProjectSession\\ScreenShot\\Adctin_LogOut_14JUN2022.jpg");
		
		Thread.sleep(2000);
		closeWindow();
	}

}
