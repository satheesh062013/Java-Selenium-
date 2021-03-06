package com.PageObjectModel_POM_CLasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage_Adactin {

	WebDriver driver;

	public SearchPage_Adactin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement no_of_rooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datepick_In;
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement datepick_Out;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement no_of_adultRooms;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement no_of_childRooms;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getDatepick_In() {
		return datepick_In;
	}

	public WebElement getDatepick_Out() {
		return datepick_Out;
	}

	public WebElement getNo_of_adultRooms() {
		return no_of_adultRooms;
	}

	public WebElement getNo_of_childRooms() {
		return no_of_childRooms;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

}
