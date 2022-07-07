package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.BaseClass_AdactinPages_Mini_Proj.BaseClass_Adactin;
import com.PageObjectManager.Page_Object_Manager;
import com.Properties.File_Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

//import cucumber.api.java.en.Given;

import cucumber.api.java.en.*;
import junit.framework.Assert;

public class stepDefinition extends BaseClass_Adactin{
	
	@Before  //Before Hooks
	public void beforeHooks(Scenario scen)
	{
		String scenarioName = scen.getName();
		System.out.println("Scenario Name is: "+scenarioName);
	}
	
	@After	//After Hooks
	public void afterHooks(Scenario scenar) throws IOException
	{
		String scenarioStatus = scenar.getStatus();
		System.out.println("Scenario Status is: "+scenarioStatus);
		if(scenar.isFailed())
		{
			takeScreenShot(System.getProperty("user.dir")+"\\ScreenShot\\FailedScenario.png");
		}
	}
	
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
		
	//Login Page: 
	
//	@Given("^the user launches the chromeBrowser$")
//	public void the_user_launches_the_chromeBrowser() throws Throwable 
//	{
//		driver = launchBrowser(File_Reader_Manager.getInstanceFRM().getInstanceCR().getbrowserName());
//		pom 
//	}
	
	@Given("^user launch the Adactin url$")
	public void user_launch_the_Adactin_url() throws Throwable 
	{
		String urlAddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturlAddress();
		launchUrl(urlAddress);
	}
	
	@When("^enters the Username$")
	public void enters_the_Username() throws Throwable 
	{
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		sendKeysIn(pom.getInstanceLoginPage().getUsername(), username);
	}

	@When("^enters the Password$")
	public void enters_the_Password() throws Throwable 
	{
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getpassword();
		sendKeysIn(pom.getInstanceLoginPage().getPassword(), password);
	}

	@Then("^user clickOnLoginButton$")
	public void user_clickOnLoginButton() throws Throwable
	{
		clickOnElement(pom.getInstanceLoginPage().getLoginbtn());
	}
	
	// Verify the Page Title:
	
	@Given("^User successfully lands at the Page \"([^\"]*)\"$")
	public void user_successfully_lands_at_the_Page(String PageTitle) throws Throwable
	{
	    Assert.assertEquals(driver.getTitle(), PageTitle);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}
	
	//Search Page:
	
	@Then("^user selects the HotelLocation$")
	public void user_selects_the_HotelLocation() throws Throwable 
	{
		selectElementByIndex(pom.getInstanceSearchPage().getLocation(), 8);
	}

	@Given("^selects the Hotel$")
	public void selects_the_Hotel() throws Throwable 
	{
		selectElementByValue(pom.getInstanceSearchPage().getHotels(), "Hotel Sunshine");
	}

	@Given("^selects the RoomType$")
	public void selects_the_RoomType() throws Throwable 
	{
		selectElementByVisibleText(pom.getInstanceSearchPage().getRoomtype(), "Super Deluxe");
	}

	@Given("^selects the No of Rooms$")
	public void selects_the_No_of_Rooms() throws Throwable 
	{
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_rooms(), "3");
	}

	@Given("^selects the CheckInDate$")
	public void selects_the_CheckInDate() throws Throwable 
	{
		pom.getInstanceSearchPage().getDatepick_In().clear();
		sendKeysIn(pom.getInstanceSearchPage().getDatepick_In(), "15/07/2022");
	}

	@Given("^selects the CheckOutDate$")
	public void selects_the_CheckOutDate() throws Throwable 
	{
		pom.getInstanceSearchPage().getDatepick_Out().clear();
		sendKeysIn(pom.getInstanceSearchPage().getDatepick_Out(), "20/07/2022");
	}

	@Given("^selects the No Of Adults Room$")
	public void selects_the_No_Of_Adults_Room() throws Throwable 
	{
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_adultRooms(), "1");
	}

	@And("^selects the No Of Childs Room$")
	public void selects_the_No_Of_Childs_Room() throws Throwable 
	{
		selectElementByValue(pom.getInstanceSearchPage().getNo_of_childRooms(), "1");
	}

	@Then("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable 
	{
		clickOnElement(pom.getInstanceSearchPage().getSearchbtn());
	}
	
	//Itinerary Page:
	@Then("^Click on the RadioButton to Select the Hotel$")
	public void click_on_the_RadioButton_to_Select_the_Hotel() throws Throwable 
	{
		Thread.sleep(3000);
		clickOnElement(pom.getInstanceItineraryPage().getRadiobtn());
	}

	@And("^Click on the ContinueButton$")
	public void click_on_the_ContinueButton() throws Throwable 
	{
		clickOnElement(pom.getInstanceItineraryPage().getContinuebtn());
	}
	
	//Booking Page:
	@Then("^user Enters the FirstName$")
	public void user_Enters_the_FirstName() throws Throwable
	{
		pom.getInstanceBookingPage().getFirstname().clear();
		sendKeysIn(pom.getInstanceBookingPage().getFirstname(), "Satheeshkumar");
	}

	@Then("^user Enters the LastName$")
	public void user_Enters_the_LastName() throws Throwable 
	{
		pom.getInstanceBookingPage().getLastname().clear();
		sendKeysIn(pom.getInstanceBookingPage().getLastname(), "Sekar");
	}

	@Then("^user Enters the Address$")
	public void user_Enters_the_Address() throws Throwable 
	{
		pom.getInstanceBookingPage().getAddress().clear();
		sendKeysIn(pom.getInstanceBookingPage().getAddress(), "#07-305,JurongWest St42");
	}

	@Then("^user Enters the CreditCardDetail$")
	public void user_Enters_the_CreditCardDetail() throws Throwable 
	{
		pom.getInstanceBookingPage().getCreditCard_No().clear();
		sendKeysIn(pom.getInstanceBookingPage().getCreditCard_No(), "1234 4578 9101 1121");
	}

	@Then("^Selects the VISACardType$")
	public void selects_the_VISACardType() throws Throwable 
	{
		selectElementByVisibleText(pom.getInstanceBookingPage().getCreditCard_Type(), "VISA");
	}

	@Then("^Selects the VISACardExpiryMonth$")
	public void selects_the_VISACardExpiryMonth() throws Throwable 
	{
		selectElementByValue(pom.getInstanceBookingPage().getCreditCard_Exp_Month(), "10");
	}

	@Then("^Selects the VISACardExpiryYear$")
	public void selects_the_VISACardExpiryYear() throws Throwable 
	{
		selectElementByVisibleText(pom.getInstanceBookingPage().getCreditCard_Exp_Year(), "2022");
	}

	@Then("^user Enters the CVV Number$")
	public void user_Enters_the_CVV_Number() throws Throwable 
	{
		pom.getInstanceBookingPage().getCvv_No().clear();
		sendKeysIn(pom.getInstanceBookingPage().getCvv_No(), "789");
	}

	@Then("^Click on the BookNowButton$")
	public void click_on_the_BookNowButton() throws Throwable 
	{
		clickOnElement(pom.getInstanceBookingPage().getBookNowbtn());
	}
	
	//My Itinerary Page:
	@Given("^Click on the MyItineraryButton$")
	public void click_on_the_MyItineraryButton() throws Throwable {
		clickOnElement(pom.getInstanceBookingItineraryPage().getlogOutbtn());
	}

	@Then("^takes the Screenshot$")
	public void takes_the_Screenshot() throws Throwable {
	 takeScreenShot(System.getProperty("user.dir")+"\\ScreenShot\\AdactinBookingConfirmation.png");
	}
	
	@Then("^Click on the LogOutButton$")
	public void click_on_the_LogOutButton() throws Throwable {
		clickOnElement(pom.getInstanceBookingItineraryPage().getlogOutbtn());
		throw new Exception("Manually Created Exception for Test Purpose");
	}
	
}
