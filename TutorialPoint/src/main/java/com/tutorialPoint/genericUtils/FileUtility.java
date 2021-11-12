package com.tutorialPoint.genericUtils;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class FileUtility 
{ 
	 
	/**
	 * @author Sweety
	 * This method used to read the data from properties and return the value based on key specifier
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
}
