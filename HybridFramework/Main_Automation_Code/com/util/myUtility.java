package com.util;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class myUtility 
{
  public static String capturescreenshot(WebDriver driver, String screenshotname) 
  {
	  try {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		  File source = screenshot.getScreenshotAs(OutputType.FILE);
		  String dest = "C:\\Users\\Chweya\\Desktop\\Screenshots"+screenshotname+".png";
		  File destination = new File(dest);
		  FileUtils.copyFileToDirectory(source, destination);
		  return dest;
		  //FileUtils.copyFile(source, new File("./Screenshots/" +screenshotname+".png"));
	} catch (Exception e) 
	  {
		System.out.println("Screenshot exception "+e.getMessage());
		return e.getMessage();
	 }
  }
}
