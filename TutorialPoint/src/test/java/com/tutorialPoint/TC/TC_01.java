package com.tutorialPoint.TC;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.tutorialPoint.genericUtils.BaseClass;
import com.tutorialPoint.pom.ArtificialIntelligenceWithPython;
import com.tutorialPoint.pom.Home;
import com.tutorialPoint.pom.LibraryPage;


public class TC_01 extends BaseClass{
	@Test
	public void validatOptionTest() throws Throwable
	{
		// Pre Condition for validation OR Assertion
		int expectedCount = 33;
		boolean expectedFlag = true;
		
		// Create an object of Home and click on Libary link
		Home h= new Home(driver);
		h.getLibraryLink().click();

		// Create an object of LibraryPage and click on AiWithPythonLink link
		LibraryPage lp = new LibraryPage(driver);
		lp.getAiWithPythonLink().click();
		
		// Create an object of ArtificialIntelligenceWithPython and click on Category link
		ArtificialIntelligenceWithPython aiwp = new ArtificialIntelligenceWithPython(driver);
		aiwp.getCategoryLink().click();
		
		//Assertion for the Category Options is 33 or not
		Assert.assertSame(expectedCount, aiwp.categoryCount());

		//Assertion for the text is present or not
		Assert.assertEquals(expectedFlag, aiwp.getBigDataText());
		Assert.assertTrue(aiwp.getBigDataText());
	}
}
