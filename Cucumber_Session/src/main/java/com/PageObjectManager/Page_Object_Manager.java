package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

//import com.PageObjectModel_POM_CLasses.BookedItineraryPage_Adactin;
//import com.PageObjectModel_POM_CLasses.BookingConfirmationPage_Adactin;
//import com.PageObjectModel_POM_CLasses.BookingPage_Adactin;
//import com.PageObjectModel_POM_CLasses.ItineraryPage_Adactin;
//import com.PageObjectModel_POM_CLasses.LoginPage_Adactin;
//import com.PageObjectModel_POM_CLasses.SearchPage_Adactin;
	import com.PageObjectModel_POM_CLasses.*;

public class Page_Object_Manager 
{
	WebDriver driver;
	private LoginPage_Adactin lp;
	private SearchPage_Adactin sp;
	private ItineraryPage_Adactin ip;
	private BookingPage_Adactin bpg;
	private BookingConfirmationPage_Adactin bcpg;
	private BookedItineraryPage_Adactin bipg;
	
	
	public Page_Object_Manager(WebDriver driver) 
	{
		this.driver = driver;
	}

	public LoginPage_Adactin getInstanceLoginPage() 
	{
		if(lp==null)
		{
			lp= new LoginPage_Adactin(driver);
		}
		return lp;
	}

	public SearchPage_Adactin getInstanceSearchPage() 
	{
		if(sp==null)
		{
			sp = new SearchPage_Adactin(driver);
		}
		return sp;
	}
	
	public ItineraryPage_Adactin getInstanceItineraryPage() 
	{
		if(ip==null)
		{
			ip = new ItineraryPage_Adactin(driver);
		}
		return ip;
	}
	
	public BookingPage_Adactin getInstanceBookingPage() 
	{
		if(bpg==null)
		{
			bpg = new BookingPage_Adactin(driver);
		}
		return bpg;
	}
	
	public BookingConfirmationPage_Adactin getInstanceBookingConfirmationPage() 
	{
		if(bcpg==null)
		{
			bcpg = new BookingConfirmationPage_Adactin(driver);
		}
		return bcpg;
	}
	
	public BookedItineraryPage_Adactin getInstanceBookingItineraryPage() 
	{
		if(bipg==null)
		{
			bipg = new BookedItineraryPage_Adactin(driver);
		}
		return bipg;
	}
	
}
