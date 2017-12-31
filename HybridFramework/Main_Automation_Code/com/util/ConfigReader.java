package com.util;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader 
{
   Properties pro;
   public ConfigReader()
   {
	   try 
	   {
		File src = new File("./Configuration/config.property");   
		   FileInputStream fis = new FileInputStream(src);
		   pro = new Properties();
		   pro.load(fis);
	   } catch (Exception e)
	   
	   {
		System.out.println("Exception is =======" + e.getMessage());
   	   } 
   }
   
   //This method gets the application URL
   public String getApplicationUrl() 
   {
	   return pro.getProperty("URL");
   }
   
   
   public String launchFirefox()
   {
	   return pro.getProperty("BROWSER1");
   }
}
