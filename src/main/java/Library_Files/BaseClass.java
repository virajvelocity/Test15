package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass 
{
	
	public WebDriver driver;
	                                        
	public void InitializeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\VIRAJ\\eclipse-workspace\\12_Aug_B_Maven\\Browser\\chromedriver.exe");

		driver=new ChromeDriver();
		
		//To enter URL on the webpage/To open an application
		driver.get("https://kite.zerodha.com/");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
