package com.tests;

//import java.text.ParseException;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.NewCustomerRegistrationPage;
import com.util.ExcelDataConfig;
import com.util.NewCustomerRegistrationData;

public class NewCustomerRegistartion extends BaseClass
{ 
	WebDriver custdriver;
	@Test
	public void NewCustRegistration() throws Exception 
	{
		// User Login
		  LoginPage login = new LoginPage(driver);
		  ExcelDataConfig mydata = new ExcelDataConfig("C:\\\\Users\\\\Chweya\\\\MyDataSheet\\\\FrameworkTestData.xlsx");
		  login.setUsername(mydata.getUsername(0, 0, 0));
		  login.setPassword(mydata.getPassword(0, 0, 1));
		  login.clickLoginButton();	
		  
		//New Customer Registration  
		  DashBoardPage db = new DashBoardPage(driver);
		  db.CustomerMouseOver();
		  db.RegistrationsMouseOver();
		  db.NewRegistartion();
		  
		  
		//Method that enters New Customer Personal Information
		  NewCustomerRegistrationPage ncr = new NewCustomerRegistrationPage(driver);
		  NewCustomerRegistrationData custdata = new NewCustomerRegistrationData("C:\\\\Users\\\\Chweya\\\\MyDataSheet\\\\FrameworkTestData.xlsx");
		  ncr.surname(custdata.getSurname(1, 0, 0));
		  ncr.othernames(custdata.getOtherNames(1, 0, 1));
		  ncr.citizenship(custdata.getCitizenship(1, 0, 3));
		  ncr.ID(custdata.getID(1, 0, 4));
		  ncr.Gender();
		  ncr.MaritalStatus();
		  ncr.IDNType();
		  ncr.Mobile("0725165222");
		  ncr.Language();
		  ncr.Town(custdata.getTown(1, 0, 5));
		  ncr.Dealership();
		  ncr.outlet();
		  ncr.operator();
		  ncr.saleschannel();
		  ncr.Paymentpaln();
		  ncr.Payment();
		  ncr.RequestNotes(custdata.getNotes(1, 0, 7));
		  ncr.Exclude(custdata.getCRB(1, 0, 8));
		  ncr.ZukuDecord(custdata.getZukuD(1, 0, 9));
		  ncr.Zukusmart(custdata.getZukusmart(1, 0, 10));
		  ncr.SaveButton();
		  
	}
}
