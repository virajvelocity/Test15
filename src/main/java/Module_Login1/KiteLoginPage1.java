package Module_Login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage1 
{
	//POM-1

	//1. Data members/Global Variables should be declared globally with access level private by using @findby.
	
@FindBy(xpath="//input[@id='userid']")  private   WebElement UN;   //private WebElement UN=driver.findelement(By.xpath("//input[@id='userid']"));
@FindBy(xpath="//input[@id='password']")  private   WebElement PSW;//private WebElement PSW=driver.findelement(By.xpath("//input[@id='password']"));
@FindBy(xpath="//button[text()='Login ']")  private   WebElement Loginbtn;//private WebElement Loginbtn=driver.findelement(By.xpath("//button[text()='Login ']"));
	
	
  // 2. Initialize within a constructor with access level public using pagefactory        
	        public KiteLoginPage1(WebDriver driver)
	        {
	        	PageFactory.initElements(driver,this);
	        }
	
	
	//3. Utilize within a method with access level public
	
	public void enterUserID(String UserID) //GP8097
	{
		UN.sendKeys(UserID); //GP8097
	}
	
	public void enterpassword(String Password)  // gms@0110
	{
		PSW.sendKeys(Password); //gms@0110
	}
	
	public void Clickloginbutton() 
	{
		Loginbtn.click();
	}
	
	
}
