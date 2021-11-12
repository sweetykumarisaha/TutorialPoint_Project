package com.tutorialPoint.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home 
{
	public WebDriver driver = null; //global driver variable
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Library")
	private WebElement libraryLink;

	public WebElement getLibraryLink() {
		return libraryLink;
	}


}
