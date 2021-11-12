package com.tutorialPoint.genericUtils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass 
{	
	public WebDriver driver;
	public	FileUtility flib = new FileUtility();
	public	WebdriverUtilty wlib = new WebdriverUtilty();
	@BeforeTest
	public void openBrowser() throws Throwable
	{
		Reporter.log("======== Launch Browser ==============",true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String URL = flib.getPropertKeyValue("url");
		System.out.println(URL);
		driver.get(URL);
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("============CLOSE Browser=============",true);
		driver.close();
	}
}