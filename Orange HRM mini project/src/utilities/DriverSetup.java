package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverSetup {

	// Create WebDriver Instance
			private static WebDriver driver;
			AccessPropertiesFile access=new AccessPropertiesFile();
			 public  WebDriver openBrowser(String browser) throws InterruptedException, IOException {
				
				
				
				System.out.println("Opening "+browser+" browser...");
				//Check if parameter passed as 'Firefox'
				if (browser.equalsIgnoreCase("Firefox")) 
				{
					
					String firefox_driverpath=access.getFirefoxPath();
					
					
					//Setting webdriver.gecko.driver property
					
					System.setProperty("webdriver.gecko.driver",firefox_driverpath);
					
				    
				    //Instantiating driver object and launching browser
				    
				    driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
				} 
				//Check if parameter passed as 'Chrome'
				else if (browser.equalsIgnoreCase("Chrome")) 
				{
					String chrome_driverpath=access.getChromePath();
					//set path to chromedriver.exe
					System.setProperty("webdriver.chrome.driver",chrome_driverpath);
					
					//create Chrome instance
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
				} 
				//Check if parameter passed as 'Opera'
				else  if (browser.equalsIgnoreCase("opera")) 
					{
						String opera_driverpath=access.getOperaPath();
						//set path to msedgedriver.exe
				         System.setProperty("webdriver.opera.driver",opera_driverpath);
				         
				        //create Edge instance
				         driver = new OperaDriver();
				         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				         
				      } else  {
			    	//If no browser passed 
			         System.out.println("No browser value is given");
			      }
				
				 //Maximize Browser Window
				 driver.manage().window().maximize();
				return driver;
				}
}
