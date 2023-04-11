package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom02 {
public static WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']/*[text()='London']")
	private WebElement location;
	
	
	@FindBy(xpath = "//select[@name='hotels']/*[text()='Hotel Creek']")
	private WebElement hotels;
	

	@FindBy(xpath = "//select[@name='room_type']/*[text()='Deluxe']")
	private WebElement roomType;
	

	@FindBy(xpath = "//select[@name='room_nos']/*[text()='3 - Three']")
	private WebElement noOfRooms;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;
	
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOutDate;
	

	@FindBy(xpath = "//select[@name='adult_room']/*[text()='2 - Two']")
	private WebElement adults;
	

	@FindBy(xpath = "//select[@name='child_room']/*[text()='0 - None']")
	private WebElement childrens;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search;
	
	

	public Pom02(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildrens() {
		return childrens;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}
