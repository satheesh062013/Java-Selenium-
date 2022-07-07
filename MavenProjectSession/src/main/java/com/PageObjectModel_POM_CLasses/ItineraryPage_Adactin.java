package com.PageObjectModel_POM_CLasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItineraryPage_Adactin 
{
	WebDriver driver;
	
	public ItineraryPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement Radiobtn;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continuebtn;

	public WebElement getRadiobtn() 
	{
		return Radiobtn;
	}

	public WebElement getContinuebtn() 
	{
		return continuebtn;
	}
}
