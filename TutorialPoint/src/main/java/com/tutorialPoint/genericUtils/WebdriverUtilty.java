package com.tutorialPoint.genericUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverUtilty 
{

	/**
	 * @author Sweety
	 * This method wait for 20 sec for page loading
	 * @param driver
	 */
	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 * this method wait for the element to be visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementVisibility(WebDriver driver , WebElement element)
	{
		WebDriverWait  wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
		
}
