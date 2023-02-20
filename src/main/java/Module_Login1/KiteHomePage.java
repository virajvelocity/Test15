package Module_Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//POM-3
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby
                         
	 @FindBy(xpath="//span[@class='user-id']") private WebElement UserID; //private WebElement UserID=driver.findelement(By.xpath("//span[@class='user-id']"));
	 @FindBy(xpath="//a[text()=' Logout']") private  WebElement logout;
	
	  // 2. Initialize within a constructor with access level public using pagefactory 
	   public KiteHomePage(WebDriver driver)
	  {
	 	 PageFactory.initElements(driver, this);
	  }
	 
	
	   public String getUserID() 
	   {
		 String  ActUserID=UserID.getText();  //GP8097
		
		 return ActUserID;
	   }
	   
	   public void ClickUserID()
	   {
		   UserID.click();
	   }
	   
	   public void Clicklogout() 
	   {
		   logout.click();
	   }
	   
	 
}
