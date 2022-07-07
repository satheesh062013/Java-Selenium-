package com.PageObjectModel_POM_CLasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage_Adactin 
{
	WebDriver driver;

	public BookingConfirmationPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//input[@value='My Itinerary']")
	private WebElement myItinerarybtn;

	public WebElement getMyItinerarybtn() {
		return myItinerarybtn;
	}

}
