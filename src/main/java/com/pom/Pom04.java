package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom04 {
public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	
	@FindBy(id="last_name")
	private WebElement lastName;
	

	@FindBy(id="address")
	private WebElement billingAddress;
	

	@FindBy(id="cc_num")
	private WebElement creditCard;
	
	@FindBy(xpath = "//select[@name='cc_type']/*[text()='VISA']")
	private WebElement cardType;
	
	
	@FindBy(xpath = "//select[@name='cc_exp_month']/*[text()='January']")
	private WebElement expiryMon;
	

	@FindBy(xpath = "//select[@name='cc_exp_year']/*[text()='2022']")
	private WebElement expiryYear;
	

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvvNumber;
    
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement bookNow;
    
    

	public static WebDriver getDriver() {
		return driver;
	}

	public Pom04(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMon() {
		return expiryMon;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	

}
