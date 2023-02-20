package Module_Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteloginPage2 
{
	//POM-2
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby
	                       
@FindBy(xpath="//input[@type='password']") private	WebElement PIN;//private WebElement PIN=driver.findelement(By.xpath("//input[@id='pin']"));
@FindBy(xpath="//button[text()='Continue ']") private WebElement Ctnbtn; //private WebElement Ctnbtn=driver.findelement(By.xpath("//button[text()='Continue ']"));
	
	
	  // 2. Initialize within a constructor with access level public using pagefactory 
	     public KiteloginPage2(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	   //3. Utilize within a method with access level public
	 	
	     public void enterPIN(String PIN0) //111000
	 	{
	    	 PIN.sendKeys(PIN0); //111000
	 	}
	 	
	     
	     public void clickctnbtn()
		 {
	    	 Ctnbtn.click();
		 }
		 	 
	     
	     
	
}
