package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class DashBoardPage 
{
    public WebDriver driver;
    //Actions act = new Actions(driver);
    
    @FindBy(how=How.XPATH,using=".//*[@id='Menu']/li[2]/span/span") private WebElement Customers_Dropdown;
    @FindBy(how=How.XPATH,using=".//*[@id='Menu']/li[2]/div/ul/li[1]/span/span") private WebElement Registrations_Dropdown;
    @FindBy(how=How.XPATH,using="//*[@id='Menu']/li[2]/div/ul/li[1]/div/ul/li[1]/a[text()='New Registration']") private WebElement New_Registration;
    
    
    //Customer Menu hover method
    public void CustomerMouseOver() 
    {
    	Actions actions = new Actions(driver);
    	actions.moveToElement(Customers_Dropdown).perform();
    }
    
    //Registration sub menu hover menu
    public void RegistrationsMouseOver() 
    {
    	WebDriverWait wait = new WebDriverWait(driver,200);
    	wait.until(ExpectedConditions.elementToBeClickable(Registrations_Dropdown));
    	Actions actions = new Actions(driver);
    	actions.moveToElement(Registrations_Dropdown).perform();
    }
    
    //Loads New Registration Page
    public void NewRegistartion() 
    {
    	WebDriverWait wait = new WebDriverWait(driver,200);
    	wait.until(ExpectedConditions.elementToBeClickable(New_Registration));
    	New_Registration.click();
    }
    
    public DashBoardPage(WebDriver driver) 
    {
    	this.driver = driver;
		PageFactory.initElements(driver, this);
    }
}


