package Library_Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class UtilityClass 
{	
	//@Automation TE: Viraj
	
	//Fetch/Read data from Property file
	
	@Test            //UN1      PSW1           PIN1
	public static String getdatafromPF(String key) throws IOException 
	{
		//To reach upto Property file
		FileInputStream file=new FileInputStream("C:\\Users\\VIRAJ\\eclipse-workspace\\12_Aug_B_Maven\\PropertyFile1.properties");
		
		//Create object of properties Class
		Properties prop=new Properties();
		
		//To open property file
		prop.load(file);
		
		//to fetch/read data
		String Value1=prop.getProperty(key);//UN1---->GP8097        PSW1-->gms@0110  PIN1-->111000
		
		return Value1;    //GP8097    gms@0110 
	}
	
	
	//Fetch data from Excelsheet
	@Test                        //0           //0
	public static String getTD(int RowIndex, int cellIndex) throws EncryptedDocumentException, IOException 
	{
		
		//To reach upto Excelsheet
	FileInputStream file =new FileInputStream("C:\\Users\\VIRAJ\\eclipse-workspace\\12_Aug_B_Maven\\TestData\\21_May_A_selenium.xlsx");
		
	  Sheet	Sh=WorkbookFactory.create(file).getSheet("Sheet11");
		                        //0                   //0
		String Value2=Sh.getRow(RowIndex).getCell(cellIndex).getStringCellValue();  //GP8097
		
		return Value2;  //GP8097
	}
	
	
	//To capture Screenshot
	
	@Test                                                     
	public static void CaptureScreenshot(WebDriver driver) throws IOException 
	{
		//to take screenshot(Typecast/downcasting/convert)
		
		File  Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
				                                             
		File Destination=new File("C:\\Users\\VIRAJ\\eclipse-workspace\\12_Aug_B_Maven\\Screenshot\\Sample5.jpg");
		FileHandler.copy(Source,Destination);
		
	}
	
	
	
	

}
