package com.PageObjectModel_POM_CLasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage_Adactin 
{
	WebDriver driver;
	
	public BookedItineraryPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "(//input[contains(@onclick,'window.location')])[2]")
	private WebElement logOutbtn;

	public WebElement getlogOutbtn() {
		return logOutbtn;
	}
}
