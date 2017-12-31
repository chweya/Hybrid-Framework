package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class LoginPage 
{
	WebDriver driver;
	@FindBy(how=How.ID,using="UserNameOrEmail") private WebElement username;
	@FindBy(how=How.ID,using="Password") private WebElement password;
	@FindBy(how=How.XPATH,using="//*[@id='divLoginFormSub']/form/div[6]/input[@class='greenbutton']")private  WebElement Login_Button;
	@FindBy(how=How.XPATH,using="//*[@id='topUserDetails']//div//a[contains(text(),'Pascal Kipkemoi')]") private WebElement Logged_User;
	
	
	
	//Method that sets users email/USERNAME
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	//Method that sets password
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	
	//Click login button
	public void clickLoginButton()
	{
		Login_Button.click();
	}
	
	//LoginPage Constructor
	public  LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyLoggedUser(String actual, String expected) 
	{
		Assert.assertEquals(actual, expected);
	}
	
	
	
	
}
