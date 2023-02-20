package Module_Login1_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import Module_Login1.KiteHomePage;
import Module_Login1.KiteLoginPage1;
import Module_Login1.KiteloginPage2;

public class KiteTestClass extends BaseClass 
{  
	 KiteLoginPage1 Login1;
	 KiteloginPage2 Login2;
	 KiteHomePage Homepage;
	@BeforeClass
	public void OpenBrowser()                        //Start condition
	{
		InitializeBrowser();
	//Create object of POM-1 class
	  Login1=new KiteLoginPage1(driver);
	  
	//Create object of POM-2 class
	  Login2=new KiteloginPage2(driver);
	 
	 //Create object of POM-3 class
	  Homepage=new KiteHomePage(driver);
	}
	
	
	@BeforeMethod
	public void LoginToApp() throws IOException                          //Pre-condition
,InterruptedException
	{
		Login1.enterUserID(UtilityClass.getdatafromPF("USERID"));//GP8097
		Login1.enterpassword(UtilityClass.getdatafromPF("PASSWORD")); //gms@0110 
		Login1.Clickloginbutton();
		
		Thread.sleep(2000);
		
		Login2.enterPIN(UtilityClass.getdatafromPF("PIN2"));//11100
		Login2.clickctnbtn();
		
	}

	@Test                                             //Test Case/Test Method
	public void VerifyUserID() throws EncryptedDocumentException, IOException 
	{
		
		        // Actual UserID
		String ActualUserID=Homepage.getUserID();//GP8097
		
		  // Expected UserID
		String ExpectedUserID=UtilityClass.getTD(0,0); //GP8095
		
		Assert.assertEquals(ActualUserID, ExpectedUserID);
	}
	

	@AfterMethod                                     //Post-condition
	public void LogoutfromApp(ITestResult Result) throws IOException //Pass  or fail
	{
	      // fail                  //fail
		if(Result.getStatus()==ITestResult.FAILURE)  //fail==fail
		{
			UtilityClass.CaptureScreenshot(driver); 
		}
		
		
		
		Homepage.ClickUserID();
		Homepage.Clicklogout();
		
	}
	
	@AfterClass
	public void CloseBrower()                        //End condition 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
