package com.PageObjectModel_POM_CLasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage_Adactin 
{
	WebDriver driver;

	public BookingPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
		
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "(//input[@onkeypress='return OnlyNumbersonly(event)'])[1]")
	private WebElement creditCard_No;
	
	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditCard_Type;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement creditCard_Exp_Month;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement creditCard_Exp_Year;
	
	@FindBy(xpath = "(//input[@onkeypress='return OnlyNumbersonly(event)'])[2]")
	private WebElement cvv_No;
	
	@FindBy(xpath = "//input[@value='Book Now']")
	private WebElement bookNowbtn;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard_No() {
		return creditCard_No;
	}
	
	public WebElement getCreditCard_Exp_Month() {
		return creditCard_Exp_Month;
	}

	public void setCreditCard_Exp_Month(WebElement creditCard_Exp_Month) {
		this.creditCard_Exp_Month = creditCard_Exp_Month;
	}

	public WebElement getCreditCard_Type() {
		return creditCard_Type;
	}

	public WebElement getCreditCard_Exp_Year() {
		return creditCard_Exp_Year;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}
	
	public WebElement getBookNowbtn() {
		return bookNowbtn;
	}

}
