package com.tests;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelDataConfig;





public class LoginTest extends BaseClass
{
  WebDriver loggeddriver;
  ExtentReports report;
  ExtentTest logger;
  //ITestResult result;
  
 /* @FindBy(how=How.XPATH,using="//div[@id=\"topHeader\"]/div[@id=\"topUserDetails\"]//a[text()=\"Pascal Kipkemoi\"]")
  private WebElement user;*/
  @Test
  public void Verify_SuccessfulLoginTest() 
  {
		  try {
			  
			  LoginPage login = new LoginPage(driver);
			  ExcelDataConfig mydata = new ExcelDataConfig("C:\\\\Users\\\\Chweya\\\\MyDataSheet\\\\FrameworkTestData.xlsx");
			  login.setUsername(mydata.getUsername(0, 0, 0));
			  login.setPassword(mydata.getPassword(0, 0, 1));
			  login.clickLoginButton();
			  
			  
			  
			  //Capture Screenshot
			 // myUtility.capturescreenshot(driver, "Login");
			  
			  //Verify the logged in User
			  ExtentReports report = new ExtentReports("C:\\Reports\\Login.html");
			  WebElement loggedInUser = driver.findElement(By.xpath("//div[@id=\"topHeader\"]/div[@id=\"topUserDetails\"]//a[text()=\"Pascal Kipkemoi\"]"));
			  logger =  report.startTest("Validate Logged In User");
			  Assert.assertEquals(loggedInUser.getText(),"Pascal Kipkemoi");
			  logger.log(LogStatus.PASS, "Logged User Pascal Kipkemoi Verified");
			  report.endTest(logger);
			  report.flush();
			  report.close();
			  driver.get("C:\\\\Reports\\\\Login.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
}
