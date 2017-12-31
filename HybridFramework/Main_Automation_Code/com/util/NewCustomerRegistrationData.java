package com.util;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewCustomerRegistrationData 
{
	//Global Variables
		XSSFWorkbook wb; 
		XSSFSheet PersonalInformation;

		//constructor that initialize excel sheet
		public NewCustomerRegistrationData(String excelpath) 
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
					
/*=======================================================================New Customer Registration=========================================*/
		//Get Customer Personal Information surname
		public String getSurname(int sheetnumber,int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String surname = PersonalInformation.getRow(0).getCell(0).getStringCellValue();
			return surname;
		}
		
		//Get Customer Personal Information other names
		public String getOtherNames(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String othernames = PersonalInformation.getRow(0).getCell(1).getStringCellValue();
			return othernames;
		}
		
		//Get Citizenship
		public String getCitizenship(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String citizenship = PersonalInformation.getRow(0).getCell(3).getStringCellValue();
			return citizenship;
		}
		//Get IDNUMBER
		public String getID(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			int IDNumber= (int) PersonalInformation.getRow(0).getCell(4).getNumericCellValue();
			@SuppressWarnings("deprecation")
			Integer i = new Integer(IDNumber);
			String str = i.toString();
			return str;
		}
		
		public String getTown(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String town = PersonalInformation.getRow(0).getCell(6).getStringCellValue();
			return town;
		}

        
		public String getNotes(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String notes = PersonalInformation.getRow(0).getCell(7).getStringCellValue();
			return notes;
		}
		public String getCRB(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String crb = PersonalInformation.getRow(0).getCell(8).getStringCellValue();
			return crb;
		}
		public String getZukuD(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String decorder = PersonalInformation.getRow(0).getCell(9).getStringCellValue();
			return decorder;
		}
		public String getZukusmart(int sheetnumber, int row, int column) 
		{
			PersonalInformation = wb.getSheetAt(1);
			String smart = PersonalInformation.getRow(0).getCell(10).getStringCellValue();
			return smart;
		}
}

