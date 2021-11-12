package com.tutorialPoint.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtificialIntelligenceWithPython {
	WebDriver driver = null;
	public ArtificialIntelligenceWithPython(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[. = 'Categories ']")
	private WebElement categoryLink;

	@FindBy(xpath = "//i[@class = 'fa fa-caret-right']")
	private List<WebElement> categoryDrpDwn;

	public WebElement getCategoryLink() {
		return categoryLink;
	}

	@FindBy(xpath = "//a[. = ' Big Data & Analytics ']")
	private WebElement bigDataLink;


	public List<WebElement> getCategoryDrpDwn() {
		return categoryDrpDwn;
	}

	public WebElement getBigDataLink() {
		return bigDataLink;
	}
	//business logic to get the count 
	public int categoryCount()
	{
		int count = categoryDrpDwn.size();
		return count;
	}
	//business logic to get the text 
	public boolean getBigDataText()
	{
		boolean bl = bigDataLink.isDisplayed();
		return bl;
	}



}
