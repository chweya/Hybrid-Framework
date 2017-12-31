package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.util.ConfigReader;

public class BaseClass 
{
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	//This method opens an application
	public void setUpApplication()
	{
		ConfigReader config = new ConfigReader();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(config.getApplicationUrl());
	}
	
	
	/*@AfterMethod
	//This Method closes the launched application
	public void closeApplication() 
	{
		//driver.quit();
	}*/

}
