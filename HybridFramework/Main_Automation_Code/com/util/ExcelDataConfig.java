package com.util;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig 
{
    //Global Variables
	XSSFWorkbook wb; 
	XSSFSheet LoginCredentials;
	
	
	//constructor that initialize excel sheet
	public ExcelDataConfig(String excelpath) 
	{
        try 
        {
			File src = new File(excelpath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
		}  catch (Exception e) 
        {
			System.out.println(e.getMessage());
		}   
	}
/*==========================================================================Login Module==============================================*/	
	
	//Method that get UserName from excel
	public String getUsername(int sheetnumber,int row, int column) 
	{
		LoginCredentials = wb.getSheetAt(0);
		String Username = LoginCredentials.getRow(0).getCell(0).getStringCellValue();
		return Username;
	}
	
	
	//Method that get Password from excel
	public String getPassword(int sheetnumber,int row, int column) 
	{
		LoginCredentials = wb.getSheetAt(0);
		String password = LoginCredentials.getRow(0).getCell(1).getStringCellValue();
		return password;
	}
	
	//Gets Logged in User
	public String getLoggedUser(int sheetnumber,int row,int column) 
	{
		LoginCredentials = wb.getSheetAt(0);
		String loggeduser = LoginCredentials.getRow(0).getCell(2).getStringCellValue();
		return loggeduser;
	}
		

	
	
	
	
	
	
	
	
}

