package readExcellData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData {

	public static void main(String[] args) throws Exception {
		
		
		File src = new File("C:\\Users\\Chweya\\MyDataSheet\\FrameworkTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet LoginCredentials = wb.getSheetAt(0);
		
		//Retrieves UserName
		
		String Username = LoginCredentials.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data From Excell Sheet Is  "+Username);
		
		
		//Retrieves Password
		
		String pwd = LoginCredentials.getRow(0).getCell(1).getStringCellValue();
				
		System.out.println("Data From Excell Sheet Is  "+pwd);
		
		
		wb.close();

	}

}
