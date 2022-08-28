
package steps;

import org.openqa.selenium.WebDriver;

import utilities.AccessPropertiesFile;
import utilities.DriverSetup;
import utilities.Project;

public class Project_Test {

	public static void main(String[] args) throws Exception{
		String url = AccessPropertiesFile.getUrl();
	    String browser = AccessPropertiesFile.getBrowser();
	    DriverSetup d = new DriverSetup();
	    WebDriver driver = d.openBrowser(browser);		             //Opening browser...
	    driver.get(url);								             //Navigating to URL
	    driver.manage().window().maximize();
	    Project project=new Project();
	    project.login(driver);                                       //Login using Username and Password as shown in site.
	    project.Navigate_to_PIM_add(driver);                         //Navigate to PIM->Add Employee Page.
	    project.enter_details(driver);                               // Enter required details 
	    project.save_details(driver);                                //Save the details.
	    project.edit_details(driver);                                // Edit the Employee details 
	    project.select_nationality(driver);                          //  Select Nationality as Indian from drop down menu
	    project.select_gender(driver);                               //  Select Gender as Female from radio button.
	    project.savedetails(driver);                                 // Save the details.
	    project.closing(driver);                                     // Close the browser

	}

}
