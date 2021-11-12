package com.tutorialPoint.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage  {
	public WebDriver driver = null;
	public LibraryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h4[. = 'Python Technologies']/..//li/a[. = 'Artificial Intelligence with Python']")
	private WebElement aiWithPythonLink;

	public WebElement getAiWithPythonLink() {
		return aiWithPythonLink;
	}


}
