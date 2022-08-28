package utilities;

import java.text.DecimalFormat;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Project {

	WebDriver driver;
    /*
     * Function for log In using valid credentials.
     */
	public void login(WebDriver driver) throws Exception{
			
		String uName=AccessPropertiesFile.getUsername();
		String pass=AccessPropertiesFile.getPassword();
			
			WebElement userName = driver.findElement(By.name("username"));
			userName.sendKeys(uName);
			
			
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys(pass);
			
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			login.click();
			
		}
	
	/*
	 *Function to navigate to PIM-->Add Employee 
	 */

		public void Navigate_to_PIM_add(WebDriver driver) throws Exception{
			
			WebElement PIM =driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']"));
			PIM.click();
			shortwait();
			
			WebElement add =driver.findElement(By.xpath("//*[contains(text(),'Add')]"));
			add.click();
			shortwait();
		}
		
		/*
		 * Function for entering valid employee details. 
		 */
		public void enter_details(WebDriver driver) {
			String random= "0"+new DecimalFormat("000").format(new Random().nextInt(999));
			String FirstName=AccessPropertiesFile.firstname();
			String LastName=AccessPropertiesFile.lastname();
			WebElement firstName=driver.findElement(By.name("firstName"));
			firstName.sendKeys(FirstName);
			
			
			WebElement lastName=driver.findElement(By.name("lastName"));
			lastName.sendKeys(LastName);
			
			
			driver.findElement(By.xpath("//*[text()='Employee Id']/following::input[1]")).clear();
			WebElement empID=driver.findElement(By.xpath("//*[text()='Employee Id']/following::input[1]"));
			empID.sendKeys(random);
		}
		/*
		 * Function for Saving the employee details. 
		 */
		
		public void save_details(WebDriver driver) throws Exception{
			WebElement addButton=driver.findElement(By.id("//button[text() = ' Save ']"));
			addButton.click();
			shortwait();
		}
		
		/*
		 * Function for editing the employee details*/
		
		public void edit_details(WebDriver driver) {
			WebElement edit=driver.findElement(By.id("btnSave"));
			edit.click();
			
			
		}
		
		
		/*
		 * function for selecting nationality. 
		 */
		public void select_nationality(WebDriver driver) {
			WebElement nationality=driver.findElement(By.id("personal_cmbNation"));
			nationality.sendKeys("Indian");
			
		}
		/*
		 * function for selecting gender. 
		 */
		
		public void select_gender(WebDriver driver) {
			WebElement gender=driver.findElement(By.id("personal_optGender_1"));
			gender.click();
			
		}
		/*
		 * Function for saving the edited details */
		
		public void savedetails(WebDriver driver) throws Exception {
			WebElement saveButton=driver.findElement(By.id("btnSave"));
			saveButton.click();
			Thread.sleep(2000);
		}
		/* Function for closing the Browser */
		
		public void closing(WebDriver driver) {
			driver.close();
		}
		
		public void shortwait() throws Exception {
			Thread.sleep(1500);
		}
}
