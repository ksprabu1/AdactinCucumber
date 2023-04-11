package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom03 {
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement box;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;


	public Pom03(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getBox() {
		return box;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	
}
