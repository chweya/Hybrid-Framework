package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class NewCustomerRegistrationPage 
{
    WebDriver driver;
	XSSFWorkbook wb; 
	XSSFSheet PersonalInformation;
    
    //Personal Information Objects
    @FindBy(how=How.ID,using="Item1_Surname")private WebElement Surname;
    @FindBy(how=How.ID,using="Item1_OtherNames")private WebElement Other_Names;
    @FindBy(how=How.ID,using="Item1_Citizenship")private WebElement Citizenship;
    @FindBy(how=How.ID,using="Item1_DateOfBirth")private WebElement DateOfBirth;
    @FindBy(how=How.ID,using="Item1_IdentificationNumber")private WebElement IdentificationNumber;
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[1]/table/tbody/tr[4]/td[2]/div/div/span[2]/span")private WebElement Gender_Dropdown;
    @FindBy(how=How.XPATH,using="/html/body/div/div/ul/li[text()='Male']")private WebElement Gender;
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[1]/table/tbody/tr[4]/td[4]/div/div/span[2]/span")private WebElement Marital_Dropdown;
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[1]/table/tbody/tr[3]/td[4]/div/div/span[2]/span")private WebElement IDType_Dropdown;
    @FindBy(how=How.XPATH,using="/html/body/div[8]/div/ul/li[text()=\"National ID\"]")private WebElement IDType;
    @FindBy(how=How.XPATH,using="/html/body/div[7]/div/ul/li[text()='Divorced']")private WebElement Marital_Status;
    @FindBy(how=How.ID,using="Item1_DateOfBirth")private WebElement DOB;
    @FindBy(how=How.ID,using="Item1_Citizenship")private WebElement Ctship;
    @FindBy(how=How.ID,using="Item1_IdentificationNumber")private WebElement IDNO;
    @FindBy(how=How.XPATH, using="//*[@id='divBodyMain']/form/div/fieldset[1]/table/tbody/tr[2]/td[2]/div/div/span/span[text()='Open the calendar']")private WebElement calendar;
    @FindBy(how=How.XPATH,using="/html/body/div[5]/div/div[1]/a[text()=\"December 1999\"]")private WebElement curdate;
    @FindBy(how=How.XPATH,using="html/body/div[5]/div/div[1]/a[3]/span")private WebElement Next;
    @FindBy(how=How.XPATH,using="html/body/div[5]/div/div[1]/a[1]/span")private WebElement Previous;
    
   
  //Contact Information Objects
    @FindBy(how=How.ID,using="mainphNo")private WebElement phone;
    
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[2]/table/tbody/tr[2]/td[2]/div/div/span[2]/span")
    private WebElement language_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[9]/div/ul/li[text()=\"English\"]")private WebElement Language;
    
    
    @FindBy(how=How.ID,using="Item1_Town")
    private WebElement town;
    
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[3]/table/tbody/tr/td[2]/div/div/span/span")
    private WebElement dealership_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[10]/div/ul/li[text()=\"SC001 M-KOPA Shop Meru (01063)\"]")
    private WebElement dealership;
    
    
    @FindBy(how=How.XPATH,using=" .//*[@id='divBodyMain']/form/div/fieldset[3]/table/tbody/tr/td[4]/div/div/span[2]/span")
    private WebElement outlet_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[11]/div/ul/li[text()=\"Dsr Nancy Muthoni\"]")
    private WebElement outlet;
    
    @FindBy(how=How.XPATH,using=" .//*[@id='divBodyMain']/form/div/fieldset[3]/table/tbody/tr/td[6]/div/div/span[2]/span")
    private WebElement operator_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[12]/div/ul/li[text()=\"(DSR) Dsr Nancy Muthoni\"]")
    private WebElement operator;
    
    
    
    //Sales channel info
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[4]/table/tbody/tr/td[2]/div/div/span[2]/span")
    private WebElement salechannel_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[13]/div/ul/li[text()=\"Normal\"]")
    private WebElement saleschannel;
  
    
    //Product Information
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[5]/table/tbody/tr/td[2]/div/div/span[2]/span")
    private WebElement paymentplan_dropdown;
    
    @FindBy(how=How.XPATH,using="/html/body/div[14]/div/ul/li[text()=\"Cash\"]")
    private WebElement paymentplan;
    
    
    @FindBy(how=How.XPATH,using=".//*[@id='divBodyMain']/form/div/fieldset[5]/table/tbody/tr/td[4]/div/div/span[2]/span")
    private WebElement pplan_dropdown;
    
    
    @FindBy(how=How.XPATH,using="/html/body/div[15]/div/ul/li[text()=\"MKIII SC Cash v1 (14,599 Immediate Payment (MK3))\"]")
    private WebElement payment;
  
    @FindBy(how=How.ID,using="Item2_RequestNotes")
    private WebElement notes;
    
    //Custom Fields
    
    @FindBy(how=How.ID,using="ExcludeFromCRBReport")
    private WebElement ecrb;
    

    @FindBy(how=How.ID,using="ZukuDecoderSerial")
    private WebElement zukurecorder;
    

    @FindBy(how=How.ID,using="ZukuSmartCardNumber")
    private WebElement zukursmart;
    
    @FindBy(how=How.ID,using="submit")
    private WebElement save;
    
 /*=================================================================================================================================================================================*/   
  //Method That Capturers New Customer surname
    public void surname(String sname) 
    {
    	Surname.sendKeys(sname);
    }
    
    
  //Method That Capturers New Customer Other names
    public void othernames(String othernames) 
    {
    	Other_Names.sendKeys(othernames);
    }
    
    public void citizenship(String Citizenp) 
    {
    	Ctship.sendKeys(Citizenp);
    }
    public void Mobile(String mobile) 
    {
    	phone.sendKeys(mobile);
    	
    }
    public void ID(String IDNumber) 
    {
    	IDNO.sendKeys(IDNumber);
    }
    
    public void Gender() 
    {
    	Gender_Dropdown.click();
    	List <WebElement> gender_menu=driver.findElements(By.xpath("//div[@class=\"t-popup t-group\"]//li"));
    	for(int i=0;i<gender_menu.size();i++) 
    	{
    		WebElement element =gender_menu.get(i);
    		String innerhtml = element.getAttribute("innerHTML");
    		if(innerhtml.contentEquals("Female")) 
    		{
    			element.click();
    			break;
    		}
    	}
    }
    public void MaritalStatus() 
    {
    	Marital_Dropdown.click();
    	Marital_Status.click();
    }
    
    public void IDNType() 
    {
    	IDType_Dropdown.click();
    	IDType.click();
    	
    }
     public void Language() 
     {
    	 language_dropdown.click();
    	 Language.click();
     }
    
     public void Town(String twn) 
     {
    	 town.sendKeys(twn);
     }
     public void Dealership() 
     {
    	 dealership_dropdown.click();
    	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",dealership);
    	 dealership.click();
     }
     
     public void outlet() throws Exception 
     {
    	 Thread.sleep(1000);
    	 outlet_dropdown.click();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",outlet);
    	 outlet.click();
     }
     
     public void operator() throws Exception 
     {
    	 Thread.sleep(1000);
    	 operator_dropdown.click();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",operator);
    	 operator.click();
     }
     
     public void saleschannel() throws Exception
     {
    	 salechannel_dropdown.click();
    	 Thread.sleep(1000);
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",saleschannel);
    	 saleschannel.click();
     }
     
     public void Paymentpaln() throws Exception 
     {
    	 Thread.sleep(1000);
    	 paymentplan_dropdown.click();
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",paymentplan);
    	 paymentplan.click();
     }
     public void Payment() throws Exception 
     {
    	 Thread.sleep(1000);
    	 pplan_dropdown.click();
    	 JavascriptExecutor je = (JavascriptExecutor) driver;
    	 je.executeScript("arguments[0].scrollIntoView(true);",payment);
    	 payment.click();
     }
     public void RequestNotes(String Notes) 
     {
    	 notes.sendKeys(Notes);
     }
     public void Exclude(String Exclude) 
     {
    	 ecrb.sendKeys(Exclude);
     }
     
     public void ZukuDecord(String ZDecord) 
     {
    	 zukurecorder.sendKeys(ZDecord);
     }
     
     
     public void Zukusmart(String Zsmart) 
     {
    	 zukursmart.sendKeys(Zsmart);
     }
     public void SaveButton() 
     {
    	 save.click();
     }
    public void calendar() 
    {
    	//WebDriverWait wait=new WebDriverWait(driver, 20);
    	//calendar.click();
    	//System.out.println("The Path is  "+driver.findElement(By.xpath("//a[@class=\"t-link t-nav-fast\"]")).getText());
    	//driver.manage().timeouts().implicitlyWait(210, TimeUnit.SECONDS);
    	//String currentdate = driver.findElement(By.xpath("//a[@class=\"t-link t-nav-fast\"]")).getText();
    	//System.out.println("The date is   "+currentdate);
    	//date1.click();
    	//String current_date = driver.findElement(By.xpath("//div[@class=\"t-header\"]/a[@class=\"t-link t-nav-fast\"]")).getText();
    	//WebElement current_date = driver.findElement(By.xpath("//div[@class=\"t-header\"]/a[@class=\"t-link t-nav-fast\"]")).click();
    	//System.out.println("The date is   "+current_date);
    	//Selecting Date of Interest
    	 //String setDatestring = "1999-11-27";
    	 
    	
    	//SimpleDateFormat inputformat = new SimpleDateFormat("mmmm");
    	//Calendar cal = Calendar.getInstance();
    	 //Retrieve the month and date
    	/* String[] dateval = setDatestring.split("-");
    	 int monthtoselect = Integer.parseInt(dateval[1]);*/
    	 
    	//Getting the current date on the Calendar
    	/*driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    	String current_date = driver.findElement(By.xpath("//div[@class=\"t-header\"]/a[@class=\"t-link t-nav-fast\"]")).getText();
    	System.out.println("The date is   "+current_date);*/
    	
		
		//Set the format of calendar to month text
		//SimpleDateFormat inputformat = new SimpleDateFormat("MMMM");//Jan-Dec
		
		/*Calendar cal = Calendar.getInstance();
		cal.setTime(inputformat.parse(current_date));
		
		
		//convert the month name to month number
		SimpleDateFormat outputformat = new SimpleDateFormat("MM");//1-12
		System.out.println(outputformat.format(cal.getTime()));
		int presentmonth = Integer.parseInt(outputformat.format(cal.getTime()));
		System.out.println(presentmonth);
		
		
		if(monthtoselect > presentmonth) 
		{
			for(int i=0;i<monthtoselect - presentmonth;i++) 
			{
				Next.click();
				Thread.sleep(500);
			}
		}
		else if(monthtoselect<presentmonth) 
		{
			for(int i=0;i<presentmonth - monthtoselect;i++) 
			{
				Previous.click();
				Thread.sleep(500);
			}
		}
    }*/
    }
    
  //NewCustomerRegistrationPage Constructor
  	public  NewCustomerRegistrationPage(WebDriver driver)
  	{
  		this.driver = driver;
  		PageFactory.initElements(driver, this);
  	}
}

